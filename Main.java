
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
        PlanetHades.roomOne L = H.new roomOne();
        

        try{
            Inh.readRoomFile();
            Inh.readCharacterFile();
            Inh.passiveMode();
        }
        catch(Exception e){
            System.out.println("Not Found");
        }
    }
}
