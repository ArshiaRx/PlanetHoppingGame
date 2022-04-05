import java.util.*;
import java.io.*;
/**
 * Write a description of class RoomThreeInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomThreeInput
{
    PlanetHades Hades = new PlanetHades();
    PlanetHades.RoomThree move = Hades.new RoomThree();
    Commands I = new Commands();
    UserBattleRoomThree secondRound = new UserBattleRoomThree();
    public void R3() throws Exception{
        move.readRoomFile();
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
                move.FirstEast();
            }else if(userInput.contains("north") && !wentTo.contains("north")){
                wentTo.add("north");
                move.North();
                break;
            }else if(userInput.contains("inventory")){
                I.Inventory();
            }else if(userInput.contains("south") || userInput.contains("west")){
                System.out.println("Its to dark, I have to keep looking for the monster");
            }else{
                move.readRoomFile();
            }
        }while(true);
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            
            if(userInput.contains("talk")){
                move.readCharacterFile();
            }else if(userInput.contains("inventory")){
                I.Inventory();
            }else if(userInput.contains("forward")){
                move.readMonsterFile();
                break;
            }else{
                System.out.println("you should keep moving");
            }
        }while(true);
        move.CaveAttack();
        
        secondRound.SimBattle(move);
        move.EndOfBattle();
        move.Alex();
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            
            if(userInput.contains("tell") || userInput.contains("goodbye")){
                move.EndPlanet();
                break;
            }else{
                System.out.println("You better alexender its time to leave");
            }
        
        }while(true);
    }
}
