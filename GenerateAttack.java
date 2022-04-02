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
    private int Attacker;
    private int criticalHit;
    public GenerateAttack(){
        Random dice = new Random();
        this.Attacker = dice.nextInt(15);
        this.criticalHit = dice.nextInt(10);
    }
    public int getAttack(){
        return Attacker;
    }
    public void setAttack(int newAttack){
        Random dice = new Random();
        this.Attacker = dice.nextInt(newAttack);
    }
    public int getcriticalHit(){
        return criticalHit;
    }
    public void setcriticalHit(int newCrit){
        Random dice = new Random();
        this.criticalHit = dice.nextInt(newCrit);
    }
}
