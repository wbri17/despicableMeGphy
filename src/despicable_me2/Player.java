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
public class Player extends Character
{
    // instance variables - replace the example below with your own

    private ArrayList<Item> inventory;  
    private static final int MAX_WEIGHT = 10; 
    private Room currentRoom; 
    private int score; 
    private boolean HaveLiquid; 
    private boolean HaveSeringue; 

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
        for (int j = 0; j<inventory.size() ; j++){
            if (j==i){
            return inventory;           
        }
        return null; 
        }
        return null; 
    }
    
    public void removeItemInventory (int j){
    
        for (int i=0; i<inventory.size(); i++){
            if (j==i){
                inventory.remove(j); 
            }
        }
    }
    public int getScore(){
        return score; 
    }
    
    public String getStringScore(){
        return "Score" + score; 
    }
    
    public void setScorePlus(int i){
        score = score + i;
    }
    
    public void setScoreMoins(int i){
        score = score - i; 
    }
    
    public boolean isScorePositive(){
        if (score > 0){
            return true;
        }
        else { 
            return false;
        }
    }
    public void haveLiquid(){
        HaveLiquid=true; 
    }
        public void haveSeringue(){
        HaveSeringue=true; 
    }
    
        
    public void startSeringue(){
        HaveSeringue=false;
        HaveLiquid=false; 
    }
    
    public boolean getSeringue(){
        return HaveSeringue;  
    }
    public boolean getLiquid(){
        return HaveLiquid;  
    }
}

