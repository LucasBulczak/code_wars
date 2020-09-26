package com.alisarrian;

public class Kata {
    public static int nthPower(int[] array, int index) {
        if (array == null) {
            return -1;
        }
        if (index < 0) {
            return -1;
        }
        return array[index] * array[index];
    }
}
