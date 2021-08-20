package com.company;

public class recursiveCount {
    public static int myCounter(String name)
    {
        if (!name.contains("x"))
        {
            return 0;
        }
        if (name.charAt(0) == 'x')
        {
            return 1 + myCounter(name.substring(1));
        }
        return myCounter(name.substring(1));
    }
}
