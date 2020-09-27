package com.alisarrian;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldReturnMinus1WhenNull() {
        Assertions.assertEquals(-1, nthPowerOf(null, 1));
    }

    @Test
    void shouldReturnMinus1WhenEmptyArray() {
        int[] array = {};
        Assertions.assertEquals(-1, nthPowerOf(array, 0));
    }

    @Test
    void shouldReturnMinus1WhenNegativeIndex() {
        int[] array = {1};
        Assertions.assertEquals(-1, nthPowerOf(array, -1));
    }

    @Test
    void shouldReturn1WhenIndexIsEqual0() {
        int[] array = {5};
        Assertions.assertEquals(Math.pow(5, 0), nthPowerOf(array, 0));
    }

    @Test
    void shouldReturnThePowerOfTheValueAtTheSpecifiedIndex() {
        int[] array = {1, 3, 5};
        Assertions.assertEquals(Math.pow(5, 2), nthPowerOf(array, 2));
    }

    @Test
    void shouldReturnMinus1WhenIndexIsEqualToArraySize() {
        int[] array = {1, 3, 5};
        Assertions.assertEquals(-1, nthPowerOf(array, 3));
    }

    @Test
    void shouldReturnMinus1WhenIndexIsGreaterThanArraySize() {
        int[] array = {1, 3, 5};
        Assertions.assertEquals(-1, nthPowerOf(array, 5));
    }

    private int nthPowerOf(int[] array, int index) {
        return Kata.nthPower(array, index);
    }
}