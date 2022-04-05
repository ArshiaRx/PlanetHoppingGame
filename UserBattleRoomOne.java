import java.util.*;
import java.io.*;
/**
 * Write a description of class UserBattle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserBattleRoomOne extends battleHelper<PlanetHades.RoomTwo>
{
    public void SimBattle(PlanetHades.RoomTwo AttackTime) throws Exception{
        boolean winYet;
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("attack")){
                winYet = AttackTime.Attack();
                if(winYet){
                    break;
                }
            }else{
                AttackTime.MonsterResponse();
            }
            AttackTime.MonsterResponse();
        }while(true);
    }
}
