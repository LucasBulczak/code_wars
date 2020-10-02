package com.alisarrian._8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrassHopperTest {
    @Test
    public void shouldReturn1WhenGiven1() {
        assertEquals(1,
                GrassHopper.summation(1));
    }

    @Test
    void shouldReturn3WhenGiven2() {
        assertEquals(3,
                GrassHopper.summation(2));
    }

    @Test
    void shouldReturn6WhenGiven3() {
        assertEquals(6,
                GrassHopper.summation(3));
    }

//    @Test
//    public void test2() {
//        assertEquals(36,
//                GrassHopper.summation(8));
//    }
}