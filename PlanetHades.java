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
    Assistant dialog = new Assistant();
    Alexender Alex_dialog = new Alexender();
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
            //Assistant dialog for room 
            dialog.RoomOneDialog();
        }
        public void North()throws Exception{
            //Player goes North
            File file = new File("Game\\Planet\\Hades\\Room 1\\North\\North.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            Commands pick = new Commands();
            File item = new File("Game\\Planet\\Hades\\Room 1\\Items\\redDiamond\\Description.txt");
            BufferedReader red = new BufferedReader(new FileReader(item));
            
            String st, dia;
            while((st = br.readLine()) != null){
                if(st.contains("[pick up]")){
                    
                    //copies in entire item name and descritption
                    while((dia = red.readLine()) != null){
                        pick.PickUP(dia);
                        System.out.println(dia);
                    }
    
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
            //reads an input of the user to either check out the skeleton or not
            //the player goes south and puts book in inventory
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            File file = new File("Game\\Planet\\Hades\\Room 1\\South\\South.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Commands pick = new Commands();
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            }
            String userInput = reader.readLine();
            if(userInput.contains("check")){
                File pathSkele = new File("Game\\Planet\\Hades\\Room 1\\South\\Skeleton\\LyingSkeleton.txt");
                BufferedReader skele = new BufferedReader(new FileReader(pathSkele));
                
                String text, recite;
                //copies in entire item name and descritption
                while((text = skele.readLine()) != null){
                    if(text.contains("[Update inventory with “Book of planet hades”]")){
                        File item = new File("Game\\Planet\\Hades\\Room 1\\Items\\BookOfHades\\Description.txt");
                        BufferedReader book = new BufferedReader(new FileReader(item));
                        
                        
                        while((recite = book.readLine()) != null){
                            pick.PickUP(recite);
                            System.out.println(recite);
                        }
                
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
            
            
            String st, AlexOffer;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
            System.out.println("\n");
            Alex_dialog.FixingShip();
            br.close();
        }
        public void HandOver() throws Exception{
            //When the player hands over the redDiamond to Alexender
            File give = new File("Game\\Planet\\Hades\\Room 1\\Character\\Alexender\\HandOverRed.txt");
            
    
            BufferedReader Alex = new BufferedReader(new FileReader(give));
            Commands hand = new Commands();
            
            String removeRed = "Red Diamond";
            hand.Give(removeRed);
            
            String goodJob;
            
            
            goodJob = Alex.readLine();
            System.out.println(goodJob);
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
        DirectionLess less = new DirectionLess();
        
        public void North()throws Exception{
            less.Nothing();
        }
        public void FirstEast()throws Exception{
            less.Nothing();
        }
        public void West() throws Exception{
            less.Nothing();
        }
        public void South() throws Exception{
            less.Nothing();
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
            Alex_dialog.IntroductionAlexender();
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
        public void StartBattle() throws Exception{
            //second room battle starts
            File file = new File("Game\\Planet\\Hades\\Room 2\\Monster\\battle\\startbattle.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        
        }
        public boolean AttackFirstMonster() throws Exception{
            //When the player attacks the Monster
            String file = "Game\\Planet\\Hades\\Room 2\\Monster\\NumberOfHit.txt";
            Battle enter = new Battle();
            return enter.EntityAttack(false, file, false);
            
        
        
        }
        public boolean MonsterAttacking() throws Exception{
            //When the monster attacks the player
            String playerFile;
            playerFile = "Game\\Planet\\Player\\Hits.txt";
            Battle enter = new Battle();
            return enter.EntityAttack(false,playerFile, true);
            
            
        
        
        }
        public void assistant() throws Exception{
            //Your companion tells you something is lurking in the background
            dialog.RoomTwoDialog();
        }
        public void Ask(String question) throws Exception{
            //Ask about the planet to Alexender
            if(question.contains("Ask")){
                Alex_dialog.AskAboutPlanet();
            }
        
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
            //the robot Assistant dialog after going North
            dialog.RoomThreeDialog();

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
            //When the player goes north in the third room
            File file = new File("Game\\Planet\\Hades\\Room 3\\North\\North.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            System.out.println("\n");
            while((st = br.readLine()) != null){
                System.out.println(st);
                
            } 
        
        }
        public void FirstEast()throws Exception{
            //When the player goes East
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
            // before the monster attacks
            File file = new File("Game\\Planet\\Hades\\Room 3\\Monster\\Action\\Action.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
        public void CaveAttack() throws Exception{
            //When monster attacks
        
            File file = new File("Game\\Planet\\Hades\\Room 3\\cave.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
                
            String st;
            while((st = br.readLine()) != null){
                System.out.println(st);
            } 
            br.close();
        }
        public boolean Attack()throws Exception{
            //Battle inside the cave attack by the player
            //When the player attacks the monster
            String deal;
            String file = "Game\\Planet\\Hades\\Room 3\\Monster\\NumberOfHit.txt";
            
            Battle enter = new Battle();
            return enter.EntityAttack(true, file, false);
            
            
        }
        public boolean MonsterResponse()throws Exception{
            //When the monster attacks the player
            String deal;
            String playerFile;
            playerFile = "Game\\Planet\\Player\\Hits.txt";
            
            Battle enter = new Battle();
            return enter.EntityAttack(true,playerFile, true);
            
            

        }
        public void EndOfBattle()throws Exception{
            //When the battle ends
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
            //Alexender shows up again after the battle
            Alex_dialog.EndPlanetDialog();
        }
        public void EndPlanet() throws Exception{
            //The end of the planet
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



