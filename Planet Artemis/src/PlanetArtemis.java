import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class PlanetArtemis implements Planet {
    Assistant Assistant = new Assistant();
    Inventory Inventory = new Inventory();

    class Room1 implements PlanetArtemis.room{
        //Read The planet Description
        public void readPlanetFile() throws Exception{
            File file = new File("Planet Artemis\\PlanetDescription.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));

            String string;
            while ((string = read.readLine()) != null){
                System.out.println(string);
            }
            read.close();
        }

        //Read Room1 - Description
        public void readRoomFile() throws Exception{
            File file = new File("Planet Artemis\\Room1\\Room1_Description.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));

            String string;
            while((string = read.readLine()) != null){
                System.out.println(string);
            }
            read.close();
        }

        //When user Discover North
        public void DiscoverNorth() throws Exception{
            File file = new File("Planet Artemis\\Direction\\DiscoverNorth.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));
            String string;

            while ((string = read.readLine()) != null){
                System.out.println(string);
            }
            read.close();
        }

        //User head north
        public void North() throws Exception{
            File file = new File("Planet Artemis\\Direction\\North.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));
            String string;

            while ((string = read.readLine()) != null){
                System.out.println(string);
            }
            read.close();
        }

        @Override
        public void readCharacterFile() throws Exception {
            Assistant.NorthAssistant();
        }

        @Override
        public void readItemFile() throws Exception {
            Inventory.Sword();
        }

        //Discovering West
        public void DiscoverWest() throws Exception{
            File file = new File("Planet Artemis\\Direction\\DiscoverWest.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));
            String string;

            while ((string = read.readLine()) != null){
                System.out.println(string);
            }
            read.close();
        }

        public void West() throws Exception{

        }
        public void DiscoverEast() throws Exception{

        }
        public void East() throws Exception{

        }
        public void DiscoverSouth() throws Exception{
            File file = new File("Planet Artemis\\Direction\\DiscoverSouth.txt");
            BufferedReader read = new BufferedReader(new FileReader(file));
            String string;

            while ((string = read.readLine()) != null){
                System.out.println(string);
            }
            read.close();
        }

        public void South() throws Exception {

        }
        @Override
        public void Monster() throws Exception{

        }
    }
}


