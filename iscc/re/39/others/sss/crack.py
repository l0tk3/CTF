from pwn import *
context.log_level="debug"
f=open("./synthesis","rb+")
data=f.read()
f.close()
sum=13
step=7
offset=0x15c0+0x9
datalist=list(data)
print(datalist[offset])
print(datalist[offset+step])
length=14
def write_order(b):
    for i in range(14):
        if b[i] == '0':
            datalist[offset+i*step]=0
        if b[i] == '1':
            datalist[offset+i*step]=1
    f=open("./synthesis","wb")
    f.write(bytes(datalist))
    f.close()
# write_order("00000000001111")
for i in range(16384):
    tmp=bin(i)[2:].rjust(14,'0')
    write_order(tmp)
    sh=process("./synthesis")
    sh.recvuntil(b'Desired product: Ammosamide B\n')
    res=sh.recvline()
    if b'flag' in res:
        sh.interactive()
    else:
        sh.close()
        continue