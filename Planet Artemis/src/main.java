import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String args[]){

        System.out.println(RoomPass());
    }
    public static String RoomPass(){
        System.out.println("Room Pass:\n" +
                "Who's the god of all monsters in this Planet? ");
        Random rand = new Random();
        int max = 100; int min = 0;
        int GenerateRnd = (int)Math.floor(Math.random()*(max-min+1)+min);

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        int PlayerHealth = 100;
        do {

                System.out.println("Your health now: " + PlayerHealth);
                System.out.println("Wrong! Try again ...");

                PlayerHealth -= GenerateRnd;
                pass = scanner.next();
        }while((!pass.equals("Typhon")) && (PlayerHealth >= 0));
        String res = "";

        if (PlayerHealth > 0){
            res += "Congrates you open the lock heading to new room\nPlayer Health: " + PlayerHealth;
        } else if (PlayerHealth <= 0) {
            res += "You faild." + "\nPlayer Health: " + PlayerHealth + "\n";
        }

        return res;
    }
}
