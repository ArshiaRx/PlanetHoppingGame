
/**
 * Write a description of class AttackMonster here.
 * if the player gets lucky, the player will kill the monster instancely
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class AttackMonster
{
    private String Condition = "";
    public boolean DealDamage(boolean crit, String path)throws Exception{
        //this methed deals damage to a monster
        //The parameters is the location of the monsters health
        //the crit is to increase the chance of a critical hit on a monster or to 
        // to increase the chance of dealing more damage to the monster
        int strike, chance;
        ConditionHelper help = new ConditionHelper();
        
        GenerateAttack fight = new GenerateAttack();
        GenerateAttack powerUp = new GenerateAttack();
        powerUp.setcriticalHit(20);
            
        System.out.println(fight.getAttack());
        System.out.println(powerUp.getcriticalHit());
            
            
        strike = fight.getAttack();
        chance = powerUp.getcriticalHit();
        if(strike >= 3 && chance >= 5){
            Condition = "AAA";
        }
        else if(strike >= 3){
            help.setCondition("A");
            Condition = help.getCondition();
        }
        Win con = new Win();
        return con.WinCondition(Condition, path);
        
        
    }
}
