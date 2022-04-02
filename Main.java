
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
        PlanetHades.RoomTwo L = H.new RoomTwo();
        PlanetHades.RoomThree K = H.new RoomThree();
        Commands I = new Commands();

        try{
            //When the player enters the planet, start describing the room
            Inh.readRoomFile();
            Inh.readCharacterFile();
            
            H.PassiveAssistantMode();
            H.PassiveAlexenderMode();
            
            //Directions of room 1 that the player can go to
            //Should have the player enter north, west, south, or east
            Inh.FirstEast();
            Inh.West();
            Inh.South();
            Inh.North();
            
            
            //Command to open the inventory at anytime
            //Allow player to open inventory anytime
            I.Inventory();
            
            //Reads the monsters dialog file
            L.readMonsterFile();
            //The assistant tells the player a monster is close by
            L.assistant();
            
            L.StartBattle();
            //Battle starts 
            // have the player enter attack
            //battle is very simple so the play only needs to attack a couple of times
            //function returns a boolean when the battle is over
            L.AttackFirstMonster();
            L.AttackFirstMonster();
            System.out.println();
            L.MonsterAttacking();
            
            // discussion with Alexender
            L.readRoomFile();
            L.readCharacterFile();
            //Maybe ask the player to type in ask(not necessary)
            L.Ask();
            L.Boom();
            L.Run();
            
            //go back to first room
            Inh.RunBack();
            H.SecondPassiveAlexenderMode();
            //Maybe have the player type in "hand over" or string containing hand over
            Inh.HandOver();
            Inh.SecondEast();
            //After the player types in "hand over" head East immediately(no player input)
            
            //read third room description file
            K.readRoomFile();
            
            //Ask the direction the player wants to go East or North (no South or west)
            //When player goes East
            K.FirstEast();
            //Player cannot go anywhere else
            
            
            //Player goes North
            K.North();
            K.readCharacterFile();
            K.readMonsterFile();
            K.CaveAttack();
            
            //Player is attack by another monster
            //Again have the player type in attack to a couple of times, the function returns a boolean when the battle is over
            K.Attack();
            System.out.println(K.Attack());
            System.out.println();
            System.out.println(K.MonsterResponse());
            System.out.println(K.MonsterResponse());
            
            K.MonsterResponse();
            K.MonsterResponse();
            K.MonsterResponse();
            //End of the planet no user input here
            K.EndOfBattle();
            K.Alex();
            K.EndPlanet();
            
            //Clear inventory commands
            I.ClearInventory();
            
        }
        catch(Exception e){
            System.out.println("Not Found");
        }
    }
}
