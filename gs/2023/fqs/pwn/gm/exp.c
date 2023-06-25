#include <stdio.h>
int main(){
    int seed=0x61616161;
    srand(seed);
    int i=0;
    while(i <= 99 ){
        printf("0x%0x ",rand());
        ++i;
    }
}