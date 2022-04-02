import java.util.*;
import java.io.*;
/**
 * Write a description of class AttackMonster here.
 * if the player gets lucky, the player will kill the monster instancely
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class AttackMonster
{
    private static String Condition = "";
    public static void resetCondition(){
        Condition = "";
    }
    
    public String DealDamage(boolean crit, String path, boolean monsterUse)throws Exception{
        //this methed deals damage to a monster/player
        //The parameters is the location of the monsters/player health
        //the crit is to increase the chance of a critical hit on a monster/player or to 
        //monsterUse is used when the monster is attacking
        //to increase the chance of dealing more damage to the monster/player
        int strike, chance;
        String st, str, readHit, readMonHit;
        
        GenerateAttack fight = new GenerateAttack();
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        File attackFile = new File("Game\\Planet\\Player\\critical hit.txt");
        BufferedReader CriHit = new BufferedReader(new FileReader(attackFile));
        str = CriHit.readLine();
        
        File H = new File("Game\\Planet\\Player\\regular hit.txt");
        BufferedReader RegHit = new BufferedReader(new FileReader(H));
        
        File C = new File("Game\\Planet\\Hades\\Monster\\RegularHit.txt");
        BufferedReader RegHitMon = new BufferedReader(new FileReader(C));
        
        readMonHit = RegHitMon.readLine();
        readHit = RegHit.readLine();
        st = br.readLine();
        st = st.trim();
            
            
        if(crit && !monsterUse){
            fight.setcriticalHit(30);
        }
        if(monsterUse){
            fight.setcriticalHit(1);
            fight.setAttack(4);
        }
        strike = fight.getAttack();
        chance = fight.getcriticalHit();
        if(strike >= 3 && chance >= 5){
            System.out.println(str);
            Condition = st;
        }
        else if(strike >= 3){
            if(!monsterUse){
                System.out.println(readHit);
            }else{
                System.out.println(readMonHit);
            }
            Condition = Condition + "A";
        }
        else{
            if(monsterUse){
                System.out.println("You see the monsters Attack coming and dodge immediately");
            }else{
                System.out.println("The monster see your attack coming and swiftly dodges");
            }
            return "miss";
        }
        return Condition;
        
    }
}
