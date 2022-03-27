
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

        try{
            Inh.readRoomFile();
            Inh.readCharacterFile();
            Inh.FirstEast();
            Inh.West();
            Inh.South();
            Inh.North();
            L.readMonsterFile();
            L.assistant();
            L.readRoomFile();
            L.readCharacterFile();
            L.Ask();
            L.Boom();
            L.Run();
            Inh.RunBack();
            Inh.HandOver();
            Inh.SecondEast();
            K.readRoomFile();
            K.FirstEast();
            K.North();
            K.readCharacterFile();
            K.readMonsterFile();
            K.CaveAttack();
            K.EndOfBattle();
            K.Alex();
            K.EndPlanet();
        }
        catch(Exception e){
            System.out.println("Not Found");
        }
    }
}
