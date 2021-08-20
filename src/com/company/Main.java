package com.company;

public class Main {

    public static void main(String[] args) {

        //Question 3 (recursiveCount)
        System.out.println("Question 3");
        String x = "xxhixx";
        String x2 = "xhixhix";
        String x3 = "hi";

        System.out.print(recursiveCount.myCounter(x));
        System.out.println("x is in String "+x);

        System.out.print(recursiveCount.myCounter(x2));
        System.out.println("x is in String "+x2);

        System.out.print(recursiveCount.myCounter(x3));
        System.out.println("x is in String "+x3);


        //Question 4. (Trianglesolve)
        System.out.println();
        System.out.println("Question 4");
        int row = 0;
        int row1 = 1;
        int row2 = 2;

        System.out.println("Number of Rows   : "+row+  " Blocks -> "+ triangleSolve.Solve(row));
        System.out.println("Number of Rows   : "+row1+  " Blocks -> "+ triangleSolve.Solve(row1));
        System.out.println("Number of Rows   : "+row2+  " Blocks -> "+ triangleSolve.Solve(row2));


        //Question 5. (ParenthesisSolve)
        System.out.println();
        System.out.println("Question 5");
        String y1 = "xyz(abc)123";
        String y2 = "x(hello)";
        String y3 = "(xy)1";
        System.out.println(y1+" -->  " + ParenthesisSolve.wordInParenthesis(y1));
        System.out.println(y2+" -->  " + ParenthesisSolve.wordInParenthesis(y2));
        System.out.println(y3+" -->  " + ParenthesisSolve.wordInParenthesis(y3));


    }
}
