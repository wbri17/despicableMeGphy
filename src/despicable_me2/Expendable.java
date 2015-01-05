
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despicable_me2;
import java.util.*;
/**
 *
 * @author william
 */
public class Expendable extends Item
{
    // instance variables - replace the example below with your own
    private Player myPlayer;

    /**
     * Constructor for objects of class Expendable
     */
    public Expendable(String desc, int weig)
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
    public void use()
    {
        // put your code here
        ArrayList<Item> invent = new ArrayList<Item>();
        invent = myPlayer.getInventory(); 
        Item theItem = this; 
        for (int i; i< invent.size(); i++)
        {
            if (invent.get(i)== theItem)
            {
                myPlayer.getInventory(i).remove();
            }
    }
}
}

