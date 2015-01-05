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
public class ExitRoom
{
    // instance variables - replace the example below with your own
    private Room nextRoom;
    private Room previousRoom; 
    private Lock doorLocked; 

    /**
     * Constructor for objects of class ExitRoom
     */
    public ExitRoom(Room next, Room previous)
    {
        // initialise instance variables
        nextRoom = next; 
        previousRoom = previous; 
         
    }
    
    /**
     * open the door
     */
    public Room openIt()
    {
        return (nextRoom); 
    }

    public Room getNextRoom()
    {
        return (nextRoom);
    }
    
    public Room getPreviousRoom()
    {
        return (previousRoom); 
    }
}

