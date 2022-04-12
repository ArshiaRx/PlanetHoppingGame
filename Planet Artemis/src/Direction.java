import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Direction {
    //
    //Discover North
    public void DiscoverNorth() throws Exception{
        File file = new File("Planet Artemis\\Room1\\Direction\\DiscoverNorth.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));
        String string;

        while ((string = read.readLine())!= null){
            System.out.println(string);
        }
        read.close();
    }

    //Discover West
    public void DiscoverWest() throws Exception{
        File file = new File("Planet Artemis\\Room1\\Direction\\DiscoverWest.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));
        String string;

        while ((string = read.readLine())!= null){
            System.out.println(string);
        }
        read.close();
    }

    //Room1 - North
    public void North() throws Exception{
        File file = new File("Planet Artemis\\Room1\\Direction\\North.txt");
        BufferedReader read = new BufferedReader(new FileReader(file));
        String string;

        while((string = read.readLine()) != null){
            System.out.println(string);
        }
        read.close();
    }
}
/*  public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Direction North = new Direction();

        Random random = new Random();
        //String use;
        int PlayerHealth = 100;
        int MonsterHealth = 50;
        int Monster1 = random.nextInt(50);
        System.out.println(Monster1);
        int Monster1_rand = (int)Math.floor(Math.random()*(PlayerHealth-MonsterHealth+1)+MonsterHealth);
        System.out.println(Monster1_rand);

        System.out.println("Inventory: " + set);
        //PlanetDescription();
        //Room1_Description();
        System.out.println("Enter a command [N, W, E, S, Q]");
        Scanner scanner = new Scanner(System.in);
        String Direction = scanner.next();

        String upperCase = Direction.toUpperCase();
        char upperCase1 = upperCase.charAt(0);
        //try {
        if (upperCase1 == 'N') {
            //System.out.println("You decided to Discover North");   --- [Direction-DiscoverNorth.txt]
            //System.out.println("Walking in this foggy dark night seems really scary.");   --- [Direction-North.txt]

            //[Assistant-AssistantNorth.txt]
            //System.out.println("[Assistant]:\nOH appolo!\nLook at that tree it seems like there is a letter stick to the tree.");
            //System.out.println("Do you want to have a look at it ?!");
            //System.out.println("1. yes, lets check\n2. No, let's continue\nEnter a number ...");
            int answer = scanner.nextInt();
            if (answer == 1) {
                System.out.println("Letter Taken.");

                //[Item-Letter.txt]
                //System.out.println("**Reading the Letter**\nhahaha\nI knew you would find this, I'm the father of all Monsters.");
                //System.out.println("You won't get of this planet alive");
                set.add("Letter");
            } else {
                System.out.println("You decided to move on.");
            }
            System.out.println("Let's continue walking forward ...");

            //[Assistant-AssistantNorth_TwoWay.txt]
            //System.out.println("[Assistant]:\nAppolo there is as you see we are in a two-way intersection.");
            //System.out.println("You can choose to go ...\n1. East\n2. West\nEnter a number ...");
            int direction = scanner.nextInt();
            if(direction == 1){
                System.out.println("You decided to discover East");
                System.out.println("[Assistant]:\nIt is so quiet in here, you should be careful as always there is something happening in quiet dark nights.");
            }
            else {
                //System.out.println("You decided to discover West");    ---[Direction-DiscoverWest.txt]
                System.out.println("[Assistant]:\nAppolo look there is a dead human by the sidewalk.\nWant to check it out?!\n1. Check out\n2. Move on");
                int selection = scanner.nextInt();
                if (selection == 1){
                    System.out.println("[Checking out the dead human ...]");
                    System.out.println("Wow nice there is bloody sword by his side! Take his sword, it could be useful to fight the creatures in the planet.");
                    System.out.println("Sword Taken.");
                    set.add("Sword");
                    System.out.println("Let's continue walking west.");
                    System.out.println("[Assistant]: \nOh well, look you are in a two way intersection. I will suggest you to walk toward");
                    System.out.println("east, if you had west you end up at starting point." + "Let's turn to east");
                    System.out.println("[Assistant]: \nOh no it's raining and there is a roar sound as we continue east");
                }
                else if (selection == 2){
                    System.out.println("Okay! let's move on ...");
                    System.out.println("[Assistant]: \nLook we are approaching a two way intersection, if you go west you go where you started. Therefore lets head toward the east");
                    System.out.println("Oh what's that sound it's like a creature\nLet's check your inventory: " + set);
                    String use = scanner.next();
                    if (set.contains(use)){
                        String take = use;
                        set.remove(use);
                        System.out.println("Current Inventory: " + take);
                    }


                }
            }
            //Assistant message provides two way one to the next room
            //the other give item and then fight monster then the
        } else if (upperCase1 == 'W') {
            System.out.println("You decided to Discover West");
            //System.out.println("");
        } else if (upperCase1 == 'E') {
            System.out.println("Let's Discover East");
        } else if (upperCase1 == 'S') {
            System.out.println("You just started you can not go back!");
        }
        else if (upperCase1 == 'Q') {
            System.out.println("You quit the game!");
        } //catch (Exception e)  {
        else {
        System.out.println("Invalid Value");   // Needs a loop to ask if a wrong input is entered
        }
    }
    /*   //PlanetDescription.txt
    public static void PlanetDescription() {
        System.out.println("\nThis is the Artemis planet of the goddess of wild animals, the hunters, the moon and chastity.");
        System.out.println("As you proceed in this planet you should be cautious of each step you take.");
        System.out.println("Let's begin the game!");
    }*/

    /*
    public static void Room1_Description() {
        System.out.println("\nWelcome to Room 1");
        System.out.println("I will be your assistant in finding your twin sister, Artemis.");
        System.out.println("I will try to give you hint as much as possible but you need to be smart in\nchoosing you options wisely.\n");
        System.out.println("In this planet, there could be many monsters that could get you killed or\nmake you bleed therefore be extra cautious.");
        System.out.println("Let's Discover ...\n");
    }*/
