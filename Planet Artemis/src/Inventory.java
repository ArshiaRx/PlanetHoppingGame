import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Inventory {
    //Reads a Inventory list created and gives out Information about it

    public void Sword() throws Exception{
        File file = new File("PlanetArtemis\\Room1\\Item\\Sword.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));
        String string;

        while ((string = read.readLine()) != null){
            System.out.println(string);
        }
        read.close();
    }

    public void Book() throws Exception{
        File file = new File("PlanetArtemis\\Room1\\Item\\Letter.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));
        String string;
        while ((string = read.readLine()) != null){
            System.out.println(string);
        }
        read.close();
    }

    public void Letter() throws Exception{

    }
}
