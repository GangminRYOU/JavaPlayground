package hellojpa.generics;

public class ResultTwoGenerics {
    public <I, O> ContainTwoGenerics<I, O> mockingChunk(int chunkSize){
        return new ContainTwoGenerics<>();
    }
}
