package com.example.ductran.myapplication;

/**
 * Created by ductran on 12/4/16.
 */

public class Questions
{
    public static String ShowQuestion(int n)
    {
        String quest="";
        switch (n)
        {
            case 1:
                quest = "Which of the following is a programming language?"; //Ans B
                break;
            case 2:
                quest = "2 x 2 + 4 x 2 = ?"; //Ans A
                break;
            case 3:
                quest = "Which team is World Cup 2014 Champion?"; //Anc C
                break;
            case 4:
                quest = "What is the biggest country in term of area in the world?";  //Ans C
                break;
            case 5:
                quest = "How many string does a normal violin have?"; //Ans A
            default:
                break;
        }
        return quest;
    }

    public static String getA(int n)
    {
        String ans="";
        switch (n)
        {
            case 1:
                ans = "English";
                break;
            case 2:
                ans = "12";
                break;
            case 3:
                ans = "Brazil";
                break;
            case 4:
                ans = "China";
                break;
            case 5:
                ans = "4";
                break;
            default:
                break;
        }
        return ans;
    }
    public static String getB(int n)
    {
        String ans="";
        switch (n)
        {
            case 1:
                ans = "Java";
                break;
            case 2:
                ans = "16";
                break;
            case 3:
                ans = "Britain";
                break;
            case 4:
                ans = "The US";
                break;
            case 5:
                ans = "5";
                break;
            default:
                break;
        }
        return ans;
    }
    public static String getC(int n)
    {
        String ans="";
        switch (n)
        {
            case 1:
                ans = "Windows";
                break;
            case 2:
                ans = "24";
                break;
            case 3:
                ans = "Germany";
                break;
            case 4:
                ans = "Russia";
                break;
            case 5:
                ans = "6";
                break;
            default:
                break;
        }
        return ans;
    }



}
