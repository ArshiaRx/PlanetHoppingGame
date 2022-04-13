import java.util.*;
import java.io.*;
/**
 * Write a description of class DirectionLess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DirectionLess
{
    public void Nothing()throws Exception{
        //If the player goes in the wrong direction
        File noDirection = new File("Game\\Planet\\Hades\\Room 2\\All Direction\\noWheretogo.txt");
        BufferedReader noWay = new BufferedReader(new FileReader(noDirection));
        String str;
        str = noWay.readLine();
        System.out.println(str);
        
        
    }
}
