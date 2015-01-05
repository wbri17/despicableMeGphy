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
public class Room 
{
    private String description;
    private HashMap <String, Room> myExits;
    

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        myExits = new HashMap(); 
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
public void setExits(String direction, Room neighbor) 
{
    myExits.put(direction,neighbor); 
}

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * print info
     * this method allow to remove some doublon in the code
     */
    
    public String printInfo()
    {
        return("you're in: "+ description + "\n"+ "the exits are:" + (myExits.keySet()).toString());
    }
    
    public Room getExit(String direction) 
    {
        return (Room)myExits.get(direction);
    }
}
