from pwn import *
import os
context.log_level="debug"
os.system('chmod +x ./synthesis')

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
datalist[0x15c2] = 1
datalist[0x192b] = 0xd9
datalist[0x192c] = 0x11
datalist[0x194a] = 0xca
datalist[0x194b] = 0x11
datalist[0x196d] = 0xa7
datalist[0x196e] = 0x11
datalist[0x1999] = 0x7b
datalist[0x199a] = 0x11
datalist[0x19a0] = 0x64
datalist[0x19a1] = 0x11

material = b'4-chloroisatin\x00'
product = b'Ammosamide B\x00'

for i in range(len(material)):
	datalist[0x2b08 + i] = material[i]
for i in range(len(product)):
	datalist[0x2b18 + i] = product[i]
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
