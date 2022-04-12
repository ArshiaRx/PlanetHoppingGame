import java.util.*;
import java.io.*;
/**
 * Write a description of class RoomOneInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomOneInput
{
    PlanetHades Hades = new PlanetHades();
    PlanetHades.roomOne direction = Hades.new roomOne();
        
    Commands I = new Commands();
    public void R1() throws Exception{
        
        
        direction.readRoomFile();
        direction.readCharacterFile();
        ArrayList<String> wentTo = new ArrayList<String>(5);
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            
            if(wentTo.contains(userInput)){
                System.out.println("I already went that way, no point in going back");
            }
            
            if(userInput.contains("east") && !wentTo.contains("east")){
                wentTo.add("east");
                direction.FirstEast();
            }else if(userInput.contains("west") && !wentTo.contains("west")){
                wentTo.add("west");
                direction.West();
            }else if(userInput.contains("south") && !wentTo.contains("south")){
                wentTo.add("south");
                direction.South();
            }else if(userInput.contains("north") && !wentTo.contains("north")){
                wentTo.add("north");
                direction.North();
                break;
            }else if(userInput.contains("inventory")){
                I.Inventory();
            }else{
                direction.readRoomFile();
            }
        }while(true);
    }
    public void R1Return() throws Exception{
        direction.RunBack();
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("hand") && userInput.contains("over")){
                direction.HandOver();
                break;
            }else{
                System.out.println("you should prabably handover the diamond you found");
            }
        
        }while(true);
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("east")){
                direction.SecondEast();
                break;
            }else{
                System.out.println("Theres no time we better find that monster quickly");
            }
        
        }while(true);
        
    }
}
