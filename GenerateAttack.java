import java.util.*;
import java.io.*;
/**
 * Write a description of class GenerateAttack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenerateAttack
{
    private int playerAttack;
    private int criticalHit;
    GenerateAttack(){
        Random dice = new Random();
        this.playerAttack = dice.nextInt(7);
        this.criticalHit = dice.nextInt(10);
    }
    public int getAttack(){
        return playerAttack;
    }
    public int getcriticalHit(){
        return criticalHit;
    }
    public void setcriticalHit(int newCrit){
        Random dice = new Random();
        this.criticalHit = dice.nextInt(newCrit);
    }
}
