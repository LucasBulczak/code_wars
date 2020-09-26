package com.alisarrian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldReturnMinus1_whenNull() {
        assertEquals(-1, Kata.nthPower(null, 1));
    }


}