#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <linux/seccomp.h>
#include <seccomp.h>
void *heaps[0x100]={0};
int heapsize[0x100]={0};
void add(){
    char buf[0x10]={0};
    int size=0;
    puts("size:");
    read(0,buf,0x10);
    size=atoi(buf);
    void *ptr=malloc(size);
    if(!ptr){
        puts("sth wrong while malloc!");
        exit(0);
    }
    puts("content:");
    read(0,ptr,size);
    int i=0;
    for(i=0;i<0x100;i++){
        if(!heaps[i]) break;
    }
    if(i<0x100){
        heaps[i]=ptr;
        heapsize[i]=size;
        puts("Add success!");
    }
    else{
        puts("Full!");
    }

}
void delete(){
    char buf[0x10]={0};
    int idx=0;
    puts("idx:");
    read(0,buf,0x10);
    idx=atoi(buf);
    if(idx<0x100&&heaps[idx]){
        free(heaps[idx]);
        puts("Delete success!");
    }else{
        puts("Invalid idx!");
    }
}
void edit(){
    char buf[0x10]={0};
    int idx=0;
    puts("idx:");
    read(0,buf,0x10);
    idx=atoi(buf);
    if(idx<0x100&&heaps[idx]){
        puts("content:");
        read(0,heaps[idx],heapsize[idx]);
        puts("edit success!");
    }else{
        puts("Invalid idx!");
    }
}
void show(){
    char buf[0x10]={0};
    int idx=0;
    puts("idx:");
    read(0,buf,0x10);
    idx=atoi(buf);
    if(idx<0x100&&heaps[idx]){
        puts("Contents:");
        write(1,heaps[idx],heapsize[idx]);
    }else{
        puts("Invalid idx!");
    }
}
int main(){
    setvbuf(stdout,0,2,0);
    setvbuf(stdin,0,2,0);
    setvbuf(stderr,0,2,0);
    scmp_filter_ctx ctx;
    ctx = seccomp_init(SCMP_ACT_ALLOW);
    seccomp_rule_add(ctx,SCMP_ACT_KILL,SCMP_SYS(execve),0);
    seccomp_load(ctx);
    puts("0.add\n1.delete\n2.edit\n3.show");
    char buf[0x10]={0};
    while (1)
    {
        printf(">>");
        memset(buf,0,sizeof(buf));
        read(0,buf,0x10);
        switch (atoi(buf))
        {
        case 0:
            add();
            break;
        case 1:
            delete();
            break;
        case 2:
            edit();
            break;
        case 3:
            show();
            break;
        default:
            puts("Invalid option!");
            break;
        }
    }
    
}