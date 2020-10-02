package com.alisarrian._8kyu;

import java.util.stream.IntStream;

public class GrassHopper {
    public static int summation(int n) {
        return IntStream.rangeClosed(0, n)
                .sum();
    }
}
