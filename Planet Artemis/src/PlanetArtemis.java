import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PlanetArtemis {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        Random random = new Random();
        int PlayerHealth = 100;
        int MonsterHealth = 50;
        int Monster1 = random.nextInt(50);
        System.out.println(Monster1);
        int Monster1_rand = (int)Math.floor(Math.random()*(PlayerHealth-MonsterHealth+1)+MonsterHealth);
        System.out.println(Monster1_rand);

        System.out.println("Inventory: " + set);
        PlanetDescription();
        Room1_Description();
        System.out.println("Enter a command [N, W, E, S, Q]");
        Scanner scanner = new Scanner(System.in);
        String Direction = scanner.next();

        String upperCase = Direction.toUpperCase();
        char upperCase1 = upperCase.charAt(0);
        if (upperCase1 == 'N') {
            System.out.println("You decided to Discover North");
            System.out.println("Walking in this foggy dark night seems really scary.");
            System.out.println("[Assistant]:\nOH appolo!\nLook at that tree it seems like there is a letter stick to the tree.");
            System.out.println("Do you want to have a look at it ?!");
            System.out.println("1. yes, lets check\n2. No, let's continue\nEnter the number ...");
            int answer = scanner.nextInt();
            if (answer == 1) {
                System.out.println("**Reading the Letter**\nhahaha\nI knew you would find this, I'm the father of all Monsters.");
                System.out.println("You won't get of this planet alive");
                set.add("Letter");
            } else {
                System.out.println("You decided to move on.");
            }
            System.out.println("Let's continue walking forward ...");
            System.out.println("[Assistant]:\nAppolo there is as you see we are in a two way intersection.");
            System.out.println("Do you can choose to go ..\n1. East\n2. West");
            int direction = scanner.nextInt();
            if(direction == 1){
                System.out.println("You decided to discover East");
                System.out.println("[Assistant]:\nIt is so quiet in here, you should be careful as always there is something happening in quiet dark nights.");
            }
            else {
                System.out.println("You are heading toward West");
                System.out.println("[Assistant]:\nAppolo look there is a dead human by the sidewalk.\nWant to check it out?!\n1. Check out\n2. Move on");
                int selection = scanner.nextInt();
                if (selection == 1){
                    System.out.println("Wow nice! Take his sword, it could be useful to fight the creatures in the planet.");
                    set.add("Sword");
                }
                else if (selection == 2){
                    System.out.println("Okay! let's move on ...");
                    System.out.println("[Assistant]: \nLook we are approaching a two, if we go west we go where we begin. Therefore lets head to the east");
                    System.out.println("Oh what's that sound it's like a creature\nLet's check your inventory: " + set);
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
        } else {
            System.out.println("Invalid Value");   // Needs a loop to ask if a wrong input is entered
        }
    }

    public static void PlanetDescription() {
        System.out.println("\nThis is the Artemis planet of the goddess of wild animals, the hunters, the moon and chastity.");
        System.out.println("As you proceed in this planet you should be cautious of each step you take.");
        System.out.println("Let's begin the game!");
    }

    public static void Room1_Description() {
        System.out.println("\nWelcome to Room 1");
        System.out.println("I will be your assistant in finding your twin sister, Artemis.");
        System.out.println("I will try to give you hint as much as possible but you need to be smart in\nchoosing you options wisely.\n");
        System.out.println("In this planet, there could be many monsters that could get you killed or\nmake you bleed therefore be extra cautious.");
        System.out.println("Let's Discover ...\n");
    }
}
