package com.company;

public class triangleSolve {
    public static int Solve(int row) {
        if (row <= 1) {
            return row;
        }
        return row + Solve(row - 1);
    }
}
