/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despicable_me2;

/**
 *
 * @author william
 */
public class Bounty extends Item
{
    // instance variables - replace the example below with your own
    private int point;

    /**
     * Constructor for objects of class Bounty
     */
    public Bounty()
    {
        // initialise instance variables
        super ("Bounty", 0); 
        point=1000;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void winPoint(int y)
    {
        // put your code here
        point = point+y;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
             */
    public void losePoint(int y)
    {
        // put your code here
        point = point-y;
    }
}

