import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Assistant {
    //Room1 - AssistantNorth
    public void NorthAssistant() throws Exception{
        File file = new File("Planet Artemis\\Room1\\Assistant\\AssistantNorth.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));

        String string;
        while((string = read.readLine()) != null){
            System.out.println(string);
        }
        read.close();
    }

    //Room1 - AssistantNorth-Two-Way
    public void NorthAssistant_2way() throws Exception{
        File file = new File("Planet Artemis\\Room\\Assistant\\AssistantNorth_TwoWay.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));

        String string;
        while((string = read.readLine()) != null){
            System.out.println(string);
        }
        read.close();
    }
}
