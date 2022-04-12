
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        
        PlanetHades H = new PlanetHades();
        PlanetHades.roomOne Inh = H.new roomOne();
        
        RoomOneInput RoomOneExe = new RoomOneInput();
        RoomTwoInput RoomTwoExe = new RoomTwoInput();
        RoomThreeInput RoomThreeExe = new RoomThreeInput();
        
        PlanetHades.RoomTwo L = H.new RoomTwo();
        PlanetHades.RoomThree K = H.new RoomThree();
        
        
        Commands I = new Commands();
        Alexender pass = new Alexender();
        Assistant voice = new Assistant();
        
        
        UserBattleRoomOne firstRound = new UserBattleRoomOne();
        UserBattleRoomThree secondRound = new UserBattleRoomThree();


        try{
            I.ClearInventory();
            //When the player enters the planet, start describing the room
            
            //voice.PassiveAssistantMode();
            //pass.PassiveAlexenderMode();
            
            //Directions of room 1 that the player can go to
            //Should have the player enter north, west, south, or east
            RoomOneExe.R1();
            

            
            
            //Command to open the inventory at anytime
            //Allow player to open inventory anytime
            RoomTwoExe.R2();
            
            //Reads the monsters dialog file
            
            //The assistant tells the player a monster is close by
            
            
            
            
            //Battle starts 
            // have the player enter attack
            //battle is very simple so the play only needs to attack a couple of times
            //function returns a boolean when the battle is over
            
            RoomOneExe.R1Return();
            
            RoomThreeExe.R3();
            // discussion with Alexender
            
            //Maybe ask the player to type in ask(not necessary)
            
            
            //go back to first room
            
            pass.SecondPassiveAlexenderMode();
            //Maybe have the player type in "hand over" or string containing hand over
            
            //After the player types in "hand over" head East immediately(no player input)
            
            //read third room description file
            
            
            //Ask the direction the player wants to go East or North (no South or west)
            //When player goes East
            
            //Player cannot go anywhere else
            
            
            //Player goes North
            
            
            
            //Player is attack by another monster
            //Again have the player type in attack to a couple of times, the function returns a boolean when the battle is over
            
            
            
            
            //End of the planet no user input here
            
            
            //Clear inventory commands
            I.ClearInventory();
            
        }
        catch(Exception e){
            System.out.println("Not Found");
        }
    }
}
