package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisSolveTest {

    @Test
    void wordInParenthesis() {
        String y1 = "xyz(abc)123";
        String y2= "x(hello)";
        String y3 = "(xy)1";
        assertEquals("(abc)", ParenthesisSolve.wordInParenthesis(y1));
        assertEquals("(hello)", ParenthesisSolve.wordInParenthesis(y2));
        assertEquals("(xy)", ParenthesisSolve.wordInParenthesis(y3));
    }
}