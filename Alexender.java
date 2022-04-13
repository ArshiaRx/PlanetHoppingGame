import java.util.*;
import java.io.*;
/**
 * Write a description of class Alexender here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alexender
{
    public String Hits()throws Exception{
        String amount;
        AlexenderHitTaken H = new AlexenderHitTaken();
        amount = H.getHits();
        return amount;
    }
    public String PassiveAlexenderMode() throws Exception{
        //This is Alexenders passive mode in the first room
        //if the player is not on the planet, or has moved passed this planet this is what alexender is doing
        //this is what alexender does before the player enters the 2nd room but changes after a story event
        //the explosion later on
        File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\Alexender\\FirstpassiveMode.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        st = br.readLine();
        return st;
    }
    public String SecondPassiveAlexenderMode() throws Exception{
        //After your the explosion alexenders passive mode changes to a new text
        File file = new File("Game\\Planet\\Hades\\Room 1\\Character\\Alexender\\SecondpassiveMode.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        st = br.readLine();
        return st;
    }
    public void IntroductionAlexender() throws Exception{
        //Alexenders introduction dialog
        File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Alexander\\Alexander dialog.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
                
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
        } 
        br.close();
            
    }
    public void AskAboutPlanet() throws Exception{
        File file = new File("Game\\Planet\\Hades\\Room 2\\Character\\Alexander\\AlexanderAsk.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine()) != null){
            System.out.println(st);
        } 
        br.close();
    
    }
    public void FixingShip() throws Exception{
        File Alex = new File("Game\\Planet\\Hades\\Room 1\\Character\\Alexender\\AlexenderDialog.txt");
        BufferedReader fixShip = new BufferedReader(new FileReader(Alex));
        String AlexOffer;
        while((AlexOffer = fixShip.readLine()) != null){
                System.out.println(AlexOffer);
                
        } 
        fixShip.close();
    }
    public void EndPlanetDialog() throws Exception{
        File file = new File("Game\\Planet\\Hades\\Room 3\\Character\\Alexender\\EndGame.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
                
        String st;
        System.out.println("\n");
        while((st = br.readLine()) != null){
            System.out.println(st);
        } 
        br.close();
    }
}
