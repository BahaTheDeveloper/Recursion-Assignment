package com.company;

public class ParenthesisSolve {
    public static String wordInParenthesis(String name)
    {

        if (!name.contains("(") && !name.contains(")"))
        {
            return null;

        }
        if (name.charAt(0) != '(')
        {
            return wordInParenthesis(name.substring(1));
        }
        else
        {
            return name.substring(name.indexOf("("),name.indexOf(")")+1);
        }
    }
}
