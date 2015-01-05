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
public class Item
{
    // instance variables - replace the example below with your own
    private String itemDescription;
    private int itemWeight;

    /**
     * Constructor for objects of class Item
     */
    public Item(String desc, int weig )
    {
        // initialise instance variables
        itemDescription = desc;
        itemWeight=weig; 
    }

    /**
     * 
     */
    public String getItemDesc()
    {
        return itemDescription;
    }
        /**
     * 
     */
    public int getItemWeight()
    {
        return itemWeight;
    }
}

