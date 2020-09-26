package com.alisarrian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldReturnMinus1WhenNull() {
        assertEquals(-1, nthPowerOf(null, 1));
    }

    @Test
    void shouldReturnMinus1WhenNegativeIndex() {
        int[] array = {1};
        assertEquals(-1, nthPowerOf(array, -1));
    }

    private int nthPowerOf(int[] array, int index) {
        return Kata.nthPower(array, index);
    }
}