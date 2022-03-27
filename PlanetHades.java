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
    public void Inventory()throws Exception{
        //allows player to see what in there inventory
        File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\PlayerCharacter\\Inventory.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
            
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
                
        } 
        br.close();
    
    }
    public void ClearInventory() throws Exception{
        //clears inventory at the end of the game
        BufferedWriter toInven = new BufferedWriter(new FileWriter("Game\\Planet\\Hades\\Room 1\\Character\\PlayerCharacter\\Inventory.txt"));
        toInven.write("");
        toInven.close();
    }
    
    //Room One begins
    
    class roomOne implements PlanetHades.room.character, PlanetHades.room{
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
            // When the player goes east before the explosion
            File file = new File("Game\\Planet\\Hades\\Room 1\\FirstEast\\FirstEast.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
            
        }
        public void West()throws Exception{
            //When the player goes west
            File file = new File("Game\\Planet\\Hades\\Room 1\\West\\West.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        }
        public void South() throws Exception{
            String userInput = "check";
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
                    if(text.contains("[Update inventory with �Book of planet hades�]")){
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
        public void RunBack() throws Exception{
            //player goes back to the first room with Alexender
            File file = new File("Game\\Planet\\Hades\\Room 1\\runBack.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            File Alex = new File("Game\\Planet\\Hades\\Room 1\\Character\\Alexender\\AlexenderDialog.txt");
            BufferedReader fixShip = new BufferedReader(new FileReader(Alex));
            
            String st, AlexOffer;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
            System.out.println("\n");
            while((AlexOffer = fixShip.readLine()) != null){
                System.out.println(AlexOffer);
                
            } 
            br.close();
            fixShip.close();
        }
        public void HandOver() throws Exception{
            //When the player hands over the redDiamond
            File inputFile = new File("Game\\Planet\\Hades\\Room 1\\Character\\PlayerCharacter\\Inventory.txt");
            File tempFile = new File("Game\\Planet\\Hades\\Room 1\\Character\\PlayerCharacter\\myTempFile.txt");
            File give = new File("Game\\Planet\\Hades\\Room 1\\Character\\Alexender\\HandOverRed.txt");
            
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedReader Alex = new BufferedReader(new FileReader(give));
            BufferedWriter send = new BufferedWriter(new FileWriter(tempFile));
            
            String removeRed = "Red Diamond";
            String current, goodJob;
            goodJob = Alex.readLine();
            System.out.println(goodJob);
            while((current = reader.readLine()) != null){
                current = current.trim();
                if(current.equals(removeRed)){
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
        public void SecondEast() throws Exception{
            //You head East to Room 3
            File file = new File("Game\\Planet\\Hades\\Room 1\\SecondEast\\SecondEast.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
            
        }
    }
    
    //These are the characteristics of room 2
    
    class RoomTwo implements PlanetHades.room.character, room.monster, PlanetHades.room{
        //Direction in this room is meaningless since you fight a monster here
        public void North()throws Exception{
            System.out.println("No application here.");
        }
        public void FirstEast()throws Exception{
            System.out.println("No application here.");
        }
        public void West() throws Exception{
            System.out.println("No application here.");
        }
        public void South() throws Exception{
            System.out.println("No application here.");
        }
        
        public void readRoomFile() throws Exception{
            //Reads the room descritption of Room 2
            File file = new File("Game\\Planet\\Hades\\Room 2\\Describe the room.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
            br.close();
            
        }
        @Override
        public void readCharacterFile() throws Exception{
            //Alexenders introduction dialog
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
            //The monster lurks in the background
            File file = new File("Game\\Planet\\Hades\\Room 2\\Monster\\Action\\Action.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
            
        }
        public void assistant() throws Exception{
            //Your companion tells you something is lurking in the background
            File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Android Assistant\\room2 dialog.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
        public void Ask() throws Exception{
            //Ask about the planet to Alexender
            File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Alexander\\AlexanderAsk.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        }
        public void Boom() throws Exception{
            //At the end of your conversation with Alexender you hear an explosion
            File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\PlayerCharacter\\boom.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        }
        public void Run() throws Exception{
            //you go back to the first room
            File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Alexander\\AlexanderBoom.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            st = br.readLine();
            System.out.println(st);
        }
    }
    
    //Room three starts here
    
    class RoomThree implements PlanetHades.room.character, PlanetHades.room, PlanetHades.room.monster{
        public void readCharacterFile() throws Exception{
            //the robot Assistant dialog
            File file = new File("Game\\Planet\\Hades\\Room 3\\Character\\Android Assistant\\Room 3 dialog.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
            
        }
        public void readRoomFile()throws Exception{
            //reads room 3 description
            File file = new File("Game\\Planet\\Hades\\Room 3\\Describe the room.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
            br.close();
        }
        public void North()throws Exception{
            
            File file = new File("Game\\Planet\\Hades\\Room 3\\North\\North.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
        
        }
        public void FirstEast()throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 3\\East\\East.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
            br.close();
            
        }
        public void West() throws Exception{
            System.out.println("No application here.");
        }
        public void South() throws Exception{
            System.out.println("No application here.");
        }
        public void readMonsterFile() throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 3\\Monster\\Action\\Action.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
        public void CaveAttack() throws Exception{
        
            File file = new File("Game\\Planet\\Hades\\Room 3\\cave.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
        public void EndOfBattle()throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 3\\Character\\PlayerCharacter\\EndOfBattle.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        
        }
        public void Alex() throws Exception{
            File file = new File("Game\\Planet\\Hades\\Room 3\\Character\\Alexender\\EndGame.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
        public void EndPlanet() throws Exception{
            
            File file = new File("Game\\Planet\\Hades\\Room 3\\Character\\PlayerCharacter\\End.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
    }
}



