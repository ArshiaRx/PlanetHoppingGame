import java.util.*;
import java.io.*;
/**
 * Write a description of class AlexenderHitTaken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AlexenderHitTaken
{
    private String hits;
    public AlexenderHitTaken()throws Exception{
        File hitsTake = new File("Game\\Planet\\Hades\\Room 1\\Character\\Alexender\\Hits.txt");
        BufferedReader get = new BufferedReader(new FileReader(hitsTake));
        this.hits = get.readLine();
    }
    public String getHits(){
        return hits;
    }
}
