package hellojpa.generics;

import java.nio.DoubleBuffer;

public class Caller {
    public static void main(String[] args) {
        ResultTwoGenerics resultTwoGenerics = new ResultTwoGenerics();
        ContainTwoGenerics<Integer, Double> result = resultTwoGenerics.<Integer, Double>mockingChunk(
            3);
        System.out.println(result.call1());
        System.out.println(result.call2());
    }
}
