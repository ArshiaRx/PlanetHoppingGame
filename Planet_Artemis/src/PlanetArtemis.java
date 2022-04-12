import java.util.Scanner;

public class PlanetArtemis {

    public static void main(String[] args) {
        PlanetDescription();
        Room1_Description();
        Scanner scanner = new Scanner(System.in);
        String Direction = scanner.next();
        String upperCase = Direction.toUpperCase();
        char upperCase1 = upperCase.charAt(0);
        if (upperCase1 == 'N') {
            System.out.println("You decided to Discover North");
            System.out.println("Walking in this foggy dark night seems really scary.");
            System.out.println("Oh appolo!\nLook at that tree it seems like there is a letter stick to the tree.");
            System.out.println("Do you want to have a look at it ?!");
            System.out.println("1. yes, lets check\n2. No, let's continue\nEnter the number ...");
            int answer = scanner.nextInt();
            if (answer == 1){
                System.out.println("**Reading the Letter**\nhahaha\n I knew you would find this, I'm the father of all Monsters.");
                System.out.println("You won't get of this planet alive");
            } else {
                System.out.println("You decided to move on.");
            }
        } else if (upperCase1 == 'W'){
            System.out.println("Let's Discover West");
        } else if (upperCase1 == 'E'){
            System.out.println("Let's Discover East");
        } else if (upperCase1 == 'S'){
            System.out.println("You just been there!");
        } if (upperCase1 == 'Q'){
            System.out.println("You want to quit the game!");
        } else {
            System.out.println("Exit the game");
        }
    }

    public static void PlanetDescription() {
        System.out.println("\nThis is the Artemis planet of the goddess of wild animals, the hunters, the moon and chastity.");
        System.out.println("As you proceed in this planet you should be cautious of each step you take.");
        System.out.println("Let's begin the game!\n");
    }

    public static void Room1_Description() {
        System.out.println("\nWelcome to Room 1");
        System.out.println("I will be your assistant in finding your twin sister, Artemis.");
        System.out.println("I will try to give you hint as much as possible but you need to be smart in\nchoosing you options wisely.\n");
        System.out.println("In this planet, there could be many monsters that could get you killed or\nmake you bleed therefore be extra cautious.");
        System.out.println("Let's Discover ...\n");
    }
}
    /*public static String MoveCommand(char Direction) {
        System.out.println("Please Enter a command [N, W, S, E] ...");
        Scanner scanner = new Scanner(System.in);
        Direction = scanner.next().charAt(0);

        char UppCase = Character.toUpperCase(Direction);
        switch (UppCase){
            case 'W':
                System.out.println(" West");
                break;
            case 'N':
                System.out.println(" North");
                break;
            case 'E':
                System.out.println(" East");
                break;
            case 'S':
                System.out.println(" South");
            default:
                System.out.println("Invalid Command\nPlease Try again");
        }*/





//public class Main {


