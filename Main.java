
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        
        PlanetHades H = new PlanetHades();
        PlanetHades.roomOne Inh = H.new roomOne();
        PlanetHades.RoomTwo L = H.new RoomTwo();
        PlanetHades.RoomThree K = H.new RoomThree();
        Commands I = new Commands();

        try{
            Inh.readRoomFile();
            Inh.readCharacterFile();
            
            H.PassiveAssistantMode();
            H.PassiveAlexenderMode();
            
            
            Inh.FirstEast();
            Inh.West();
            Inh.South();
            Inh.North();
            

            I.Inventory();
            
            L.readMonsterFile();
            L.assistant();
            L.StartBattle();
            L.readRoomFile();
            L.readCharacterFile();
            L.Ask();
            L.Boom();
            L.Run();
            Inh.RunBack();
            H.SecondPassiveAlexenderMode();
            Inh.HandOver();
            Inh.SecondEast();
            
            K.readRoomFile();
            K.FirstEast();
            K.North();
            K.readCharacterFile();
            K.readMonsterFile();
            K.CaveAttack();
            K.Attack();
            K.Attack();
            K.Attack();
            K.EndOfBattle();
            K.Alex();
            K.EndPlanet();
            
            
        

        
            

        
        }
        catch(Exception e){
            System.out.println("Not Found");
        }
    }
}
