import java.util.*;
import java.io.*;
/**
 * Write a description of class UserBattleRoomTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserBattleRoomThree extends battleHelper<PlanetHades.RoomThree>
{
    public void SimBattle(PlanetHades.RoomThree AttackTime) throws Exception{
        boolean check;
        do{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();
            userInput = userInput.toLowerCase();
            if(userInput.contains("attack")){
                check = AttackTime.Attack();
                if(check){
                    break;
                }
            }else{
                AttackTime.MonsterResponse();
            }
            AttackTime.MonsterResponse();
        }while(true);
    }
}
