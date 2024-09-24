gj=b'GoodJob'
keya=b''.fromhex('532f08e5763374')
keyb=b''.fromhex("56e265b55b9847")
xorkey1=[]
xorkey2=[]
data1=b''.fromhex('722c06e6473225dd8bc608d1e288689c4b90d1be13a6d0d69f6ea5996039d83598d7f2c293ba')
data2=b''.fromhex('77e16bb66ac7125ca4fc25a4b49ab035a479c0b9a74b1b3830f0be1c9ace1ebc8c0ad94617c4')
for i in range(7):
    tmpa=keya[i]^gj[i]
    tmpb=keyb[i]^gj[i]
    xorkey1.append(tmpa)
    xorkey2.append(tmpb)
for i in range(7):
    print(chr(xorkey1[i]^data1[i]),end='')

print()
for i in range(7):
    print(chr(xorkey2[i]^data2[i]),end='')