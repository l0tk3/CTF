#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <strings.h>
#include <stdlib.h>

typedef unsigned long ULONG;

void init(unsigned char *s, unsigned char *key, unsigned long Len) //初始化函数
{
    int i =0, j = 0;
    char k[256] = {0};
    unsigned char tmp = 0;
    for (i=0;i<256;i++) {
        s[i] = i;
        k[i] = key[i%Len];
    }
    for (i=0; i<256; i++) {
        j=(j+s[i]+k[i])%256;
        tmp = s[i];
        s[i] = s[j]; //交换s[i]和s[j]
        s[j] = tmp;
    }
 }

void Crypt(unsigned char *s, unsigned char *Data, unsigned long Len) //加解密
{
    int i = 0, j = 0, t = 0;
    unsigned long k = 0;
    unsigned char tmp;
    for(k=0;k<Len;k++) {
        i=(i+1)%256;
        j=(j+s[i])%256;
        tmp = s[i];
        s[i] = s[j]; //交换s[x]和s[y]
        s[j] = tmp;
        t=(s[i]+s[j])%256;
        Data[k] ^= s[t];
     }
} 
void rc4(unsigned char *key, unsigned long keyLen,unsigned char *Data, unsigned long dataLen){
    unsigned char s[256] = {0}; //S-box
    init(s,(unsigned char *)key,keyLen); //已经完成了初始化
    Crypt(s,(unsigned char *)Data,dataLen);//加密
}
int main()
{
    unsigned char res[]={"GoodJob"};
    int a=1;
    while(1){
        unsigned char pData[512] ={0x56,0xe2,0x65,0xb5,0x5b,0x98,0x47,0x00};
        // unsigned char pData[512] ={0x53,0x2f,0x08,0xe5,0x76,0x33,0x74,0x00};
        // unsigned char pData[512] ={0xdd,0x9f,0x58,0xb3,0x72,0xdf,0xee,0xf0,0xaf,0x4a,0x65,0xba,0xf9,0x56,0x66,0xca,0x5,0xc1,0xcf,0x2a,0xfd,0x15};
        char key[256] = {0};
        puts("input the key:");
        int len = read(0,&key,256);
        key[len--]=0; 
        // char key[256] = {"12345678"};
        rc4(key,len,pData,7);
        int flag=1;
        for(int i=0;i<7;i++){
            printf("%c",pData[i]);
        }
        printf("\n");
        for(int i=0;i<7;i++){
            if(pData[i]!=res[i]){
                flag=0;
            }
        }
        if (flag==1){
            break;
        }
        else{
            printf("Fail!\n");
        }
    }
    printf("Success!!\n");
}