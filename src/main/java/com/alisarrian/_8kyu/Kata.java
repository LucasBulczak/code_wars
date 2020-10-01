package com.alisarrian._8kyu;

import java.util.stream.IntStream;

public class Kata {
    public static int nthPower(int[] array, int n) {
        if (array == null) {
            return -1;
        }

        return IntStream.range(0, array.length)
                .filter(value -> value == n)
                .map(operand -> (int) Math.pow(array[n], n))
                .findFirst()
                .orElse(-1);
    }
}
