#include "flatbuffers/flatbuffers.h"
#include "heaps_generated.h"
#include <iostream> 
#include <unistd.h>
int main(){
    flatbuffers::FlatBufferBuilder builder;
    auto heap = builder.CreateString("testtest");
    int idx = 0;
    auto heapinfo = CreateHeapinfo(builder,idx,heap);
    auto operation = builder.CreateString("Create");  
    int vecidx = 0;
    std::vector<flatbuffers::Offset<Heapinfo>> Heapvec;
    Heapvec.push_back(heapinfo);
    auto vec = builder.CreateVector(Heapvec);
    auto s_player = CreatePlayer(builder,operation,vecidx,0x20,vec);
    builder.Finish(s_player);
    auto output = builder.GetBufferPointer();
    auto output_size = builder.GetSize();
    write(1,output,output_size);
    std::cout << "finish!" << std::endl;
}