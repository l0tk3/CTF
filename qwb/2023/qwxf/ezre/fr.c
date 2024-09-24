#include <stdio.h>
#include <stdlib.h>
int main(){
    srand(0x55);
    for(int i=0;i<64;i++){
        printf("%#x,",rand());
    }
    puts("");
    srand(0x55);
    for(int i=0;i<64;i++){
        printf("%#x,",rand());
    }
}