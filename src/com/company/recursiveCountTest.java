package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class recursiveCountTest {

    @Test
    void myCounter() {
        assertEquals(4, recursiveCount.myCounter("xxhixx"));
        assertEquals(3, recursiveCount.myCounter("xhixhix"));
        assertEquals(0, recursiveCount.myCounter("hi"));
    }
}