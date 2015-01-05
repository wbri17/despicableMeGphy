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
public class Message extends Item
{
    // instance variables - replace the example below with your own
    private String myText;

    /**
     * Constructor for objects of class Message
     */
    public Message(String desc, int weig, String tex)
    {
        // initialise instance variables
        super(desc, weig); 
        myText = tex; 
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getMessage()
    {
        // put your code here
        return (myText);
    }
}