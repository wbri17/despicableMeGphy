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
public class Character
{
    // instance variables - replace the example below with your own
    private String name;
    private String desc; 
    private Room myRoom; 

    /**
     * Constructor for objects of class Character
     */
    public Character(String N, String D, Room theRoom)
    {
        // initialise instance variables
        name=N;
        desc = D; 
        myRoom=theRoom;
        
    }

    /**
     * return the character's name 
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
        /**
     * return the character description 
     */
    public String getDescription()
    {
        // put your code here
        return desc;
    }
    
    
    
}

