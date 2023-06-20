from pwn import *
context.log_level="debug"
sh=process("./pwn")
def cmd(c):
    sh.sendlineafter(b": ",str(c).encode())
def add(idx,size=16,ctt=b'a'*16):
    cmd(1)
    sh.sendlineafter(b'? ', str(idx).encode())
    sh.sendlineafter(b'? ', str(size).encode())
    sh.sendlineafter(b': ', ctt)
def dele(idx):
    cmd(2)
    sh.sendlineafter(b'? ', str(idx).encode())

for i in range(10):
    add(i)
for i in range(9):
    dele(i)
gdb.attach(sh)
sh.interactive()