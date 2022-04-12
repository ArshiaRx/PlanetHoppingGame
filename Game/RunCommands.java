package Game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunCommands {
    public static void main(String agrs[]) throws Exception {
        BufferedReader in;    //Reads text from a character-input stream.
        //For better reading of characters, arrays and lines.
        String Input;
        //String Output;

        in = new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader - a bridge from bytes streams to character streams.
        do {
            System.out.println("Please enter a command [N, W, E, S or Q to quit] ...\n> ");

            Input = in.readLine();
            //Output = CommandProcessor(Input);
            System.out.println(Input);
        } while (!"q".equals(Input) || !"Q".equals(Input));
    }
}