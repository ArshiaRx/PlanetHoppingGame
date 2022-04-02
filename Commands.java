import java.util.*;
import java.io.*;
/**
 * Write a description of class Commands here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Commands
{
    public void PickUP(String item) throws Exception{
        //Allows player to pick up items
        BufferedWriter toInven = new BufferedWriter(new FileWriter("Game\\Planet\\Player\\Inventory.txt", true));
        
        toInven.write(item);
        toInven.newLine();
        toInven.close();
    
    
    }
    public void Inventory()throws Exception{
        //allows player to see what in there inventory
        File file = new File("Game\\Planet\\Player\\Inventory.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
            
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
                
        } 
        br.close();
    
    }
    public void Give(String remov) throws Exception{
        //When an item is removed from the inventory of the player
        File inputFile = new File("Game\\Planet\\Player\\Inventory.txt");
        File tempFile = new File("Game\\Planet\\Player\\myTempFile.txt");
        boolean flag;
        flag = false;
        
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter send = new BufferedWriter(new FileWriter(tempFile));
        
        String current;
        while((current = reader.readLine()) != null){
                if(!current.matches(".*[a-zA-Z]+.*")){
                    flag = false;
                }
                if(current.contains(remov)){
                    flag = true;
                    continue;
                }else if(flag){
                    continue;
                }else{
                    send.write(current + "\n");
                }
        }
            
        send.close();
        reader.close();
        inputFile.delete();
        boolean succ = tempFile.renameTo(inputFile);
    }
    public void ClearInventory() throws Exception{
        //clears inventory at the end of the game
        BufferedWriter toInven = new BufferedWriter(new FileWriter("Game\\Planet\\Player\\Inventory.txt"));
        toInven.write("");
        toInven.close();
    }
}
