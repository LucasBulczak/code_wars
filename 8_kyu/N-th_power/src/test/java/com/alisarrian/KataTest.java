package com.alisarrian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldReturnMinus1WhenNull() {
        assertEquals(-1, Kata.nthPower(null, 1));
    }

    @Test
    void shouldReturnMinus1WhenNegativeIndex() {
        assertEquals(-1, Kata.nthPower(new int[]{1}, -1));
    }
}