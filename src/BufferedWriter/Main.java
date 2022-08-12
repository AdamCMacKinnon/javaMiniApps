package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        String[] siblings = {"Adam", "Meg", "Sarah", "Jack", "Ben", "Kate", "Clay", "Britt", "Alec", "Sam"};
        shuffle(Arrays.asList(siblings));

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Sibling Secret Santa List!!");
            System.out.println("FILE SUCCESSFULLY WRITTEN!");
            for (String sibling : siblings) {
                writer.write("\n" + "GIVER: " + sibling + "   ---------------------------------   " + "RECEIVER: " + sibling);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR!");
            e.printStackTrace();
        }
    }
}
