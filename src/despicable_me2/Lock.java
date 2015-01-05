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
public class Lock
{
    // instance variables - replace the example below with your own
    private Key myKey;
    private boolean isLocked; 

    /**
     * Constructor for objects of class Lock
     */
    public Lock(Key theKey)
    {
        // initialise instance variables
        this.myKey= theKey;
        isLocked = true; 
    }

    /**
     * 
     */
    public Key getKey()
    {
        return myKey; 
    }
    
    public void unlock(Key theKey)
    {
        if (theKey == getKey())
        {
            isLocked = false;
        }
    }
    
    public void lock(Key theKey)
    {
        if (theKey == getKey())
        {
            isLocked = true; 
        }
    }
    
    public boolean isLocked()
    {
        return (isLocked); 
    }
}

