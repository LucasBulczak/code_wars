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

    @Test
    void shouldReturn1WhenIndexIsEqual0() {
        int[] array = {1};
        assertEquals(1, nthPowerOf(array, 0));
    }

    @Test
    void shouldReturn25WhenIndexIsEqual0() {
        int[] array = {5};
        assertEquals(5 * 5, nthPowerOf(array, 0));
    }

    private int nthPowerOf(int[] array, int index) {
        return Kata.nthPower(array, index);
    }
}