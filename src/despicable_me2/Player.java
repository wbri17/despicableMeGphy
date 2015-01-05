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
public class Player extends Character
{
    // instance variables - replace the example below with your own

    private ArrayList<Item> inventory;  
    private static final int MAX_WEIGHT = 10; 
    private Room currentRoom; 

    /**
     * Constructor for objects of class Player
     */
    public Player(String nom, String D, Room theRoom)
    {
        // initialise instance variables
        super(nom, D, theRoom);
        inventory = new ArrayList<Item>(); 
        
    }

    /**
     * 
     */
    public boolean checkItem(Item it)
    {
       return inventory.contains(it); 
    }
    
    /**
     * 
     */
    public Item getItem(Item it)
    {
       return inventory.get(it.getItemWeight()); 
    }
    
        /**
     * 
     */
    public void pickUp(Item it)
    {
       if (currentWeight() < MAX_WEIGHT){
          inventory.add(it); 
       }
    }
    
        /**
     * 
     */
    public int currentWeight()
    {
       int w=0;
       for (Item i:inventory){
        w+= i.getItemWeight(); 
        }
        return w; 
    }
    
    public void changeRoom(Room newRoom)
    {
        currentRoom = newRoom; 
    }
    
    public Room getCurrentRoom()
    {
        return (currentRoom); 
    }
    
    public ArrayList<Item> getInventory()
    {
        return (inventory); 
    }
    
        public ArrayList<Item> getInventorySpecific(int i)
    {
        for (int j; j<inventory.size() ; j++){
            if (j==i){
            inventory(j).remove();           
        }
        
        }
    }
}

