import java.util.*;
import java.io.*;
/**
 * Write a description of class AssistantHitTaken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AssistantHitTaken
{
    private String hits;
    public AssistantHitTaken()throws Exception{
        File hitsTake = new File("Game\\Planet\\Hades\\Room 1\\Character\\Android Assistant\\Hits.txt");
        BufferedReader get = new BufferedReader(new FileReader(hitsTake));
        this.hits = get.readLine();
    }
    public String getHits(){
        return hits;
    }
}
