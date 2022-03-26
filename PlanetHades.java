import java.util.*;
import java.io.*;
/**
 * Write a description of class PlanetHades here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class PlanetHades implements Planet
{
    class roomOne implements PlanetHades.room.character{
        public void readRoomFile() throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 1\\A) Describe the room.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
            br.close();
        }
        @Override
        public void readCharacterFile() throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\Android Assistant\\assisant dialog.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
        @Override
        public void passiveMode() throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\Android Assistant\\passive mode.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        }
    }
}



