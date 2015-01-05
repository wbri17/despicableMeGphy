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
public class LockedExit extends ExitRoom
{
    // instance variables - replace the example below with your own
    private Lock myLock;

    /**
     * Constructor for objects of class LockedExit
     */
    public LockedExit(Room previous, Room next, Key theKey)
    {
        // initialise instance variables
        super(next, previous); 
        myLock = new Lock(theKey) ;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Room open()
    {
        // put your code here
        if (myLock.isLocked())
        {
            return (getPreviousRoom());
        }
        else
        {
            return (getNextRoom()); 
        }
    }
    
    public void Unlock (Key theKey)
    {
        myLock.unlock(theKey); 
    }
    
    public void lock (Key theKey)
    {
        myLock.lock(theKey); 
    }
    
}

