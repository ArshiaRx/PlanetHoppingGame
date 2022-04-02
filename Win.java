import java.util.*;
import java.io.*;
/**
 * Write a description of class Win here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Win
{
    public boolean WinCondition(String hits, String path) throws Exception{
        //if the player hits the monster a certain about of time then he defeats the Monster
        //Acts has the win condition true when the player/monster has dealt enought damage to player/monster
        //False if not enough
        AttackMonster res = new AttackMonster();
        File file = new File(path);
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String st;
        st = br.readLine();
        st = st.trim();
        if(hits != "miss"){
            System.out.println(hits.length() + " of " + st.length());
        }
        if(hits.equals(st)){
            res.resetCondition();
            return true;
        
        }
        return false;
    }
}
