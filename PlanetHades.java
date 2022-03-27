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
        public void North()throws Exception{
            //Player goes North
            File file = new File("Game\\Planet\\Hades\\Room 1\\North\\North.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            File item = new File("Game\\Planet\\Hades\\Room 1\\Items\\redDiamond\\Description.txt");
            BufferedReader red = new BufferedReader(new FileReader(item));
            
            BufferedWriter toInven = new BufferedWriter(new FileWriter("Game\\Planet\\Hades\\Room 1\\Character\\PlayerCharacter\\Inventory.txt", true));
            
            String st, dia;
            while((st = br.readLine()) != null){
                if(st.contains("[pick up]")){
                    
                    
                    while((dia = red.readLine()) != null){
                        if(dia.contains("Red Diamond")){
                            toInven.write("Red Diamond\n");
                        }
                        System.out.println(dia);
                    }
                    toInven.close();
                }else{
                    System.out.println(st);
                }
            }            
            br.close();
            red.close();
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
            //the player goes south and puts book in inventory
            File file = new File("Game\\Planet\\Hades\\Room 1\\South\\South.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            }
            
            if(userInput.contains("check")){
                File pathSkele = new File("Game\\Planet\\Hades\\Room 1\\South\\Skeleton\\LyingSkeleton.txt");
                BufferedWriter toInven = new BufferedWriter(new FileWriter("Game\\Planet\\Hades\\Room 1\\Character\\PlayerCharacter\\Inventory.txt", true));
                BufferedReader skele = new BufferedReader(new FileReader(pathSkele));
                
                String text, recite;
                while((text = skele.readLine()) != null){
                    if(text.contains("[Update inventory with “Book of planet hades”]")){
                        File item = new File("Game\\Planet\\Hades\\Room 1\\Items\\BookOfHades\\Description.txt");
                        BufferedReader book = new BufferedReader(new FileReader(item));
                        
                        while((recite = book.readLine()) != null){
                            if(recite.contains("Book of planet hades")){
                                toInven.write("Book of planet hades\n");
                            }
                            System.out.println(recite);
                        }
                        toInven.close();
                    }else{
                        System.out.println(text);
                    }
                }
                
            
            
            }
            br.close();

        
        }
    }
    class RoomTwo implements PlanetHades.room.character, room.monster{
        
        @Override
        public void readCharacterFile() throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Alexander\\Alexander dialog.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
            
        }
        @Override
        public void readMonsterFile() throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Alexander\\Alexander dialog.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
            
        }
    }
}



