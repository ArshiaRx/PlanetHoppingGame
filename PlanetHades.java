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
            //The description of room 1
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
            //Assistant dialog for room 1
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
            //When passively prints in the background
            File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\Android Assistant\\passive mode.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        }
        public void North()throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 1\\North\\North.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st, dia;
            while((st = br.readLine()) != null){
                if(st.contains("[pick up]")){
                    
                    File item = new File("Game\\Planet\\Hades\\Room 1\\Items\\redDiamond\\Description.txt");
                    BufferedReader red = new BufferedReader(new FileReader(item));
                    while((dia = red.readLine()) != null){
                        System.out.println(dia);
                    }

                
                }else{
                    System.out.println(st);
                }
            }            
            br.close();
        }
        public void FirstEast()throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 1\\FirstEast\\FirstEast.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
            
        }
        public void West()throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 1\\West\\West.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        }
        public void South(String userInput) throws Exception{
            //reads an input of the user to either check out the skeleton or not
            //the player goes south
            File file = new File("Game\\Planet\\Hades\\Room 1\\South\\South.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            }
            
            if(userInput.contains("check")){
                File pathSkele = new File("Game\\Planet\\Hades\\Room 1\\South\\Skeleton\\LyingSkeleton.txt");
                BufferedReader skele = new BufferedReader(new FileReader(pathSkele));
                
                String text;
                while((text = skele.readLine()) != null){
                    System.out.println(text);
                }
            
            
            }
            br.close();

        
        }
    }
}



