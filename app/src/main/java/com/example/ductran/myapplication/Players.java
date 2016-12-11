package com.example.ductran.myapplication;

/**
 * Created by ductran on 12/6/16.
 */

public class Players
{
    private String name;
    private int score;
    private boolean q1,q2,q3,q4,q5;
    //  Constructor - sets default values for name.
    public Players ()
    {
        name = "";
        score = 0;
        q1 = true;
        q2 = true;
        q3 = true;
        q4 = true;
        q5 = true;
    }

    // Sets name
    public void setName (String nameValue)
    {
        name = nameValue;
    }

    // Increase Score
    public void increaseScore () { score++; }

    // Set answered
    public void set1()
    {q1 = false;}
    public void set2()
    {q2 = false;}
    public void set3()
    {q3 = false;}
    public void set4()
    {q4 = false;}
    public void set5()
    {q5 = false;}

    // Get questions status
    public boolean get1()
    {return q1;}
    public boolean get2()
    {return q2;}
    public boolean get3()
    {return q3;}
    public boolean get4()
    {return q4;}
    public boolean get5()
    {return q5;}

    // Returns name
    public String getName ()
    {
        return name;
    }

    //Return score
    public int getScore () {return score;}


}
