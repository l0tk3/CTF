from pwn import *
import base64
context.log_level="debug"
sh=remote("cha.hackpack.club",41709)
sh.recvuntil(b"b'")
raw_data=sh.recvuntil(b"'",drop=True)
print(raw_data)
plain_data=base64.b64decode(raw_data)
f=open("human","wb+")
f.write(plain_data)
sh.interactive()