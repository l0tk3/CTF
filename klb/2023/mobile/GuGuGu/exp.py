from pwn import *
context.log_level="debug"
sh=process("./exp")

for i in range(38515,1919811):
    sh.sendlineafter(b"input the key:\n",str(i).encode())
    res=sh.recv(7)
    if b'Good' in res:
        success(hex(i))
        break
    print(i)
# data1=b''.fromhex("532f08e5763374")
# data2=b''.fromhex("56e265b55b9847")
# res=b'GoodJob'
# finalkey=[]
# for i in range(7):
#     tmp=data2[i]^res[i]
#     print(tmp)