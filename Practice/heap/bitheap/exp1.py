from pwn import *
context.log_level="debug"
sh=process('./pwn')
def cmd(c):
	sh.sendlineafter(b"Your choice: ",str(c).encode())
def add(idx,size):
	cmd(1)
	sh.sendlineafter(b"Index: ",str(idx).encode())
	sh.sendlineafter(b"Size: ",str(size).encode())
def edit(idx,ctt):
	cmd(2)
	sh.sendlineafter(b"Index: ",str(idx).encode())
	sh.sendlineafter(b"Content: ",ctt)
def show(idx):
	cmd(3)
	sh.sendlineafter(b"Index: ",str(idx).encode())
def dele(idx):
	cmd(4)
	sh.sendlineafter(b"Index: ",str(idx).encode())
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
