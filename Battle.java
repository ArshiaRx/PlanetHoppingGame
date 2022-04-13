
/**
 * Write a description of class Battle here.
 *This class simulates a battle
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    public boolean EntityAttack(boolean critical, String path, boolean toggleMonster) throws Exception{
        //The critical vaiable increases the chance of a one hit kill by the player
        //The path variable looks for the health or how many times the player
        //needs to hit the monster to continue
        //The toggleMonster identities if the player is attack or the monster
        Win con = new Win();
        String deal;
        
        AttackMonster damage = new AttackMonster();
            
        deal = damage.DealDamage(critical, path, toggleMonster);


        return con.WinCondition(deal, path);
    
    }
}
