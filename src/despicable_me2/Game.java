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
public class Game 
{
    protected Player myPlayer;
    private Character Gru; 
    private Character Dog; 
    private Character Professor_Nefario;
    private Character Martian1 ;
    private Character Martian2; 
    private Character BadMinion1; 
    private Character BadMinion2; 
    private Room bedRoom; 
    private Room toilet; 
    private Room dressing; 
    private Room bathRoom; 
    private Room kitchen; 
    private Room livingRoom; 
    private Room lab;
    private Room rocket; 
    private Room moon; 
    private Room garden; 
    private Room villa;  
    
    // private int score; 
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game(String nom) 
    {
        createRooms();
        createCharacter(); 
        myPlayer= new Player (nom, "the player", bedRoom);
        myPlayer.setScorePlus(1000);
         
        //parser = new Parser();
        //score = 1000; 
    }
    /**
     * 
     */
    public void createCharacter()
    {
        Character Gru = new Character ("Gru", "Agnes Father", kitchen); 
        Character Dog = new Character ("Dog", "Gru's dog", livingRoom);
        Character Professor_Nefario = new Character ("Professor Nefario", "Professor", lab);
        Character Martian1 = new Character ("Martian 1", "1", moon); 
        Character Martian2 = new Character ("Martian 2", "2", moon);
        Minion BadMinion = new Minion ("Bad Minion", "Minion who need to be cured", bathRoom, false); 
        Minion BadMinion2 = new Minion ("Bad Minion", "Minion who need to be cured", villa, false); 
    }
    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        
      
        // create the rooms
        Room bedRoom = new Room("You're un Agnes bedroom, our main character");
        Room toilet = new Room ("toilet");
        Room dressing = new Room ("dressing");
        Room bathRoom = new Room ("bath"); 
        Room livingRoom = new Room("living room");
        Room kitchen = new Room("kitchen");
        Room lab = new Room("lab");
        Room rocket = new Room("rocket");
        Room moon = new Room ("moon");
        Room garden = new Room ("garden");
        Room villa = new Room ("El macho villa"); 
        
        // initialise room exits
        bedRoom.setExits("north", kitchen );
        bedRoom.setExits("east", livingRoom); 
        bedRoom.setExits("west", dressing); 
        bedRoom.setExits("south", bathRoom);
        kitchen.setExits("north", livingRoom);
        kitchen.setExits("east", garden);
        livingRoom.setExits("noth", lab);
        lab.setExits("south", livingRoom);
        lab.setExits("north", rocket);
        rocket.setExits("north", moon);
        moon.setExits("north", garden); 
        garden.setExits("north", villa); 
        garden.setExits("west", kitchen); 
        
        // initialise doors
        
        //LockedExit doors1 = new LockedExit(bedRoom,toilet, key1); 
        

        //myPlayer.changeRoom(bedRoom);  // start game in the bedRoom

    }


    /**
     *  Main play routine.  Loops until end of play.
     */
//    public void play() 
//    {            
//        printWelcome();
//
//        // Enter the main command loop.  Here we repeatedly read commands and
//        // execute them until the game is over.
//                
//        boolean finished = false;
//        while (! finished) {
//            //Command command = parser.getCommand();
//            //finished = processCommand(command);
//        }
//        System.out.println("Thank you for playing.  Good bye.");
//    }
//
//    /**
//     * Print out the opening message for the player.
//     */
//    private void printWelcome()
//    {
//        System.out.println();
//        System.out.println("Welcome to the World of Zuul!");
//        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
//        System.out.println("Type 'help' if you need help.");
//        System.out.println();
//        System.out.println("You are " + myPlayer.getCurrentRoom().getDescription());
//        System.out.print("Exits: ");
//        System.out.println(myPlayer.getCurrentRoom().printInfo());
//        System.out.println();
//    }
//
//    /**
//     * Given a command, process (that is: execute) the command.
//     * @param command The command to be processed.
//     * @return true If the command ends the game, false otherwise.
//     */
//    private boolean processCommand(Command command) 
//    {
//        boolean wantToQuit = false;
//
//        if(command.isUnknown()) {
//            System.out.println("I don't know what you mean...");
//            return false;
//        }
//
//        String commandWord = command.getCommandWord();
//        if (commandWord.equals("help"))
//            printHelp();
//        else if (commandWord.equals("go"))
//            goRoom(command);
//        //else if (commandWord.equals("pick"))
//           // ;
//        else if (commandWord.equals("quit"))
//            wantToQuit = quit(command);
//
//        return wantToQuit;
//    }
//
//    // implementations of user commands:
//
//    /**
//     * Print out some help information.
//     * Here we print some stupid, cryptic message and a list of the 
//     * command words.
//     */
//    private void printHelp() 
//    {
//        System.out.println("You are lost. You are alone. You wander");
//        System.out.println("around at the university.");
//        System.out.println();
//        System.out.println("Your command words are:");
//        parser.showCommands();
//    }
//
//    /** 
//     * Try to go to one direction. If there is an exit, enter
//     * the new room, otherwise print an error message.
//     */
//    private void goRoom(Command command) 
//    {
//        if(!command.hasSecondWord()) {
//            // if there is no second word, we don't know where to go...
//            System.out.println("Go where?");
//            return;
//        }
//
//        String direction = command.getSecondWord();
//
//        // Try to leave current room.
//        Room nextRoom = myPlayer.getCurrentRoom().getExit(direction);
//        
//        if (nextRoom == null)
//        {
//            System.out.println("There is no door!");
//        }
//        else {
//            myPlayer.changeRoom(nextRoom);
//            System.out.println(myPlayer.getCurrentRoom().printInfo());
//        }
//    }
//
//    /** 
//     * "Quit" was entered. Check the rest of the command to see
//     * whether we really quit the game.
//     * @return true, if this command quits the game, false otherwise.
//     */
//    private boolean quit(Command command) 
//    {
//        if(command.hasSecondWord()) {
//            System.out.println("Quit what?");
//            return false;
//        }
//        else {
//            return true;  // signal that we want to quit
//        }
//    }
}

