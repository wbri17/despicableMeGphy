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
public class MagicLiquid extends Expendable
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MagicLiquid
     */
    public MagicLiquid(String desc, int weig)
    {
        // initialise instance variables
        super(desc, weig);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void inject(Minion theMinion)
    {
        // put your code here
        use();
        
    }
}

