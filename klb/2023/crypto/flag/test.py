a=b'ipfm\x82Kj]p~l?\x82ogw\x85mt[K\x8br\x97'
b=b'flag'
key=[15,28,7,10,249]
for i in range(len(a)):
    tmp=a[i]^key[i%5]
    print(chr(tmp),end='')