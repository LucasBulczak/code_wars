package com.alisarrian._8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthSeriesTest {
    @Test
    void shouldReturn1WhenGiven1() {
        assertEquals("1.00", NthSeries.seriesSum(1));
    }

    @Test
    void shouldReturn1_25WhenGiven2() {
        assertEquals("1.25", NthSeries.seriesSum(2));
    }

//    @Test
//    public void test1() {
//        assertEquals("1.57", NthSeries.seriesSum(5));
//    }
//    @Test
//    public void test2() {
//        assertEquals("1.77", NthSeries.seriesSum(9));
//    }
//    @Test
//    public void test3() {
//        assertEquals("1.94", NthSeries.seriesSum(15));
//    }
}