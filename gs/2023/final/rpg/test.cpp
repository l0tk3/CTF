#include "flatbuffers/flatbuffers.h"
#include "heap_generated.h"
#include <iostream> 
#include <unistd.h>
#include <string.h>
#include <stdio.h>
int main(){
    setvbuf(stdout,0,2,0);
    setvbuf(stdin,0,2,0);
    setvbuf(stderr,0,2,0);
    char buf[0x100]={0};
    while(1){
        memset(buf,0,0x100);
        printf("> ");
        int length = read(0,buf,0x20);
        if(buf[length-1]=='\n'){
            buf[length-1]=0;
        }
        if(!strcmp(buf,"add")){
            flatbuffers::FlatBufferBuilder builder;
            unsigned char data[]={0x61,0x62,0x63,0x64,0x65};
            auto heap = builder.CreateString("testtest");
            printf("idx: ");
            memset(buf,0,0x100);
            length = read(0,buf,0x20);
            if(buf[length-1]=='\n'){
                buf[length-1]=0;
            }
            size_t idx = atol(buf);
            // size_t idx = 0;
            auto heapinfo = CreateHeapinfo(builder,idx,heap);
            auto operation = builder.CreateString("Create");
            size_t vecidx = 0;
            printf("size: ");
            memset(buf,0,0x100);
            int length = read(0,buf,0x20);
            if(buf[length-1]=='\n'){
                buf[length-1]=0;
            }
            size_t create_size = atol(buf);
            // size_t create_size = 0x30;
            std::vector<flatbuffers::Offset<Heapinfo>> Heapvec;
            Heapvec.push_back(heapinfo);
            auto vec = builder.CreateVector(Heapvec);
            auto s_player = CreatePlayer(builder,operation,vecidx,create_size,vec);
            builder.Finish(s_player);
            auto output = builder.GetBufferPointer();
            auto output_size = builder.GetSize();
            write(1,output,output_size);
            std::cout << "finish!" << std::endl;
        }else if(!strcmp(buf,"show")){
            flatbuffers::FlatBufferBuilder builder;
            unsigned char data[]={0x61,0x62,0x63,0x64,0x65};
            auto heap = builder.CreateString("testtest");
            size_t idx = 0;
            auto heapinfo = CreateHeapinfo(builder,idx,heap);
            auto operation = builder.CreateString("Show");
            printf("idx: ");
            length = read(0,buf,0x20);
            if(buf[length-1]=='\n'){
                buf[length-1]=0;
            }
            size_t vecidx = atoi(buf);
            size_t create_size = 0x30;
            std::vector<flatbuffers::Offset<Heapinfo>> Heapvec;
            Heapvec.push_back(heapinfo);
            auto vec = builder.CreateVector(Heapvec);
            auto s_player = CreatePlayer(builder,operation,vecidx,create_size,vec);
            builder.Finish(s_player);
            auto output = builder.GetBufferPointer();
            auto output_size = builder.GetSize();
            write(1,output,output_size);
            std::cout << "finish!" << std::endl;            
        }else if(!strcmp(buf,"edit")){
            flatbuffers::FlatBufferBuilder builder;
            unsigned char data[0x100]={0};
            printf("size: ");
            memset(buf,0,0x100);
            int length = read(0,buf,0x20);
            if(buf[length-1]=='\n'){
                buf[length-1]=0;
            }
            int size = atoi(buf);
            // auto heap = Heap(size);
            printf("data: ");
            length = read(0,data,size);
            if(data[length-1]=='\n'){
                data[length-1]=0;
            }
            auto heap = builder.CreateString((const char *)data);
            printf("idx: ");
            memset(buf,0,0x100);
            length = read(0,buf,0x20);
            if(buf[length-1]=='\n'){
                buf[length-1]=0;
            }
            size_t idx = atol(buf);
            // size_t idx = 0;
            auto heapinfo = CreateHeapinfo(builder,idx,heap);
            auto operation = builder.CreateString("Edit");
            size_t vecidx = 0;

            size_t create_size = 0x30;
            std::vector<flatbuffers::Offset<Heapinfo>> Heapvec;
            Heapvec.push_back(heapinfo);
            auto vec = builder.CreateVector(Heapvec);
            auto s_player = CreatePlayer(builder,operation,vecidx,create_size,vec);
            builder.Finish(s_player);
            auto output = builder.GetBufferPointer();
            auto output_size = builder.GetSize();
            write(1,output,output_size);
            std::cout << "finish!" << std::endl;  
        }else if(!strcmp(buf,"free")){
            flatbuffers::FlatBufferBuilder builder;
            unsigned char data[]={0x61,0x62,0x63,0x64,0x65};
            auto heap = builder.CreateString("testtest");
            printf("idx: ");
            memset(buf,0,0x100);
            length = read(0,buf,0x20);
            if(buf[length-1]=='\n'){
                buf[length-1]=0;
            }
            size_t idx = atol(buf);
            // size_t idx = 0;
            auto heapinfo = CreateHeapinfo(builder,idx,heap);
            auto operation = builder.CreateString("Delete");
            size_t vecidx = 0;
            size_t create_size = 0x30;
            std::vector<flatbuffers::Offset<Heapinfo>> Heapvec;
            Heapvec.push_back(heapinfo);
            auto vec = builder.CreateVector(Heapvec);
            auto s_player = CreatePlayer(builder,operation,vecidx,create_size,vec);
            builder.Finish(s_player);
            auto output = builder.GetBufferPointer();
            auto output_size = builder.GetSize();
            write(1,output,output_size);
            std::cout << "finish!" << std::endl;
        }
    }

   
    // puts((const char*)g_content);
}