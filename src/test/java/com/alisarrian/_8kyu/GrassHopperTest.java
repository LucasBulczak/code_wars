package com.alisarrian._8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrassHopperTest {
    @Test
    public void shouldReturn1WhenGiven1() {
        assertEquals(1,
                GrassHopper.summation(1));
    }

//    @Test
//    public void test2() {
//        assertEquals(36,
//                GrassHopper.summation(8));
//    }
}