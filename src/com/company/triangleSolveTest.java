package com.company;

import static org.junit.jupiter.api.Assertions.*;

class triangleSolveTest {

    @org.junit.jupiter.api.Test
    void solve() {
        assertEquals(0, new triangleSolve().Solve(0));
        assertEquals(1, new triangleSolve().Solve(1));
        assertEquals(3, new triangleSolve().Solve(2));
    }
}