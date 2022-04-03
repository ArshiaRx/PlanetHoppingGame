import java.util.*;
import java.io.*;
/**
 * Write a description of class Assistant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assistant
{
    public void PassiveAssistantMode() throws Exception{
        //This is the assistants passivemode
        //so when the player is or is not interacting with the assistant this is what is happening
        File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\Android Assistant\\passive mode.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
            
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
                
        } 
        br.close();    
    }
    public void RoomOneDialog() throws Exception{
        //Assistant dialog for room 1
        File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\Android Assistant\\assisant dialog.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
                
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
        } 
        br.close();
    }
    public void RoomTwoDialog() throws Exception{
        File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Android Assistant\\room2 dialog.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
        } 
        br.close();
    
    }
    public void RoomThreeDialog() throws Exception{
        File file = new File("Game\\Planet\\Hades\\Room 3\\Character\\Android Assistant\\Room 3 dialog.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
                
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
        } 
        br.close();
    }
}
