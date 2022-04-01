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
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        st = br.readLine();
        st = st.trim();
        System.out.println(st);
        System.out.println(hits);
        if(hits.equals(st)){
            return true;
        
        }
        return false;
    }
}
