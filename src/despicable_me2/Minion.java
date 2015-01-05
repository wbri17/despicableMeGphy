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
public class Minion extends Character
{
    // instance variables - replace the example below with your own
    private boolean good;

    /**
     * Constructor for objects of class Minion
     */
    public Minion(String Nom, String D, Room theRoom, boolean state)
    {
        // initialise instance variables
        super (Nom, D, theRoom);
        good=state; 
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void switcher()
    {
        // put your code here
        if (good == true){
            good = false;
        }
        else {
            good = true;
        }
    }
}

