import base64
import struct
s="EvAzEwo6E9RO4qSAHq42E9KvEv5zHDt34GtdHGJaHD7NHG42bwd="
rawtable="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
newtable=""
dic_decode=str.maketrans(newtable,rawtable)
# ns=''
# for i in s:
#     ns+=chr(ord(i)-1)
# print(ns)
s=s.translate(dic_decode)
print(s)
res=base64.b64decode(s)
print(res)
