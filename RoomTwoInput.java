import java.util.*;
import java.io.*;
/**
 * Write a description of class RoomTwoInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomTwoInput
{
    public void R2() throws Exception{
        PlanetHades Hades = new PlanetHades();
        PlanetHades.RoomTwo walk = Hades.new RoomTwo();
        Commands I = new Commands();
        UserBattleRoomOne firstRound = new UserBattleRoomOne();
        //Reads the monsters dialog file
        walk.readMonsterFile();
        //The assistant tells the player a monster is close by
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("talk")){
                walk.assistant();
            }else if(userInput.contains("inventory")){
                I.Inventory();
            }else if(userInput.contains("forward")){
                break;
            }else{
                System.out.println("you should keep moving");
            }
        }while(true);
        walk.StartBattle();
        firstRound.SimBattle(walk);
        
        walk.readRoomFile();
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("talk")){
                walk.readCharacterFile();
                break;
            }else{
                System.out.println("try talking to the old man");
            
            }
        }while(true);
        
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("ask")){
                walk.Ask("Ask");
                break;
            }else{
                System.out.println("try asking the old man about the planet");
            }
        }while(true);
        walk.Boom();
        
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("run")){
                walk.Run();
                break;
            }else{
                System.out.println("you better run back");
                
            }
        }while(true);
        
        
        
    
    }
}
