package SingleClass;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to write? ");
            String fileContent = scanner.nextLine();
            int x = 0;
            Random random = new Random();
            int y = random.nextInt(500);
            String header = "Daily Report " + y + " FOR TESTING:\n";
            String footer = "\nConclusion of Daily Report.  Processing Date: " + LocalDate.now();
            System.out.println("Writing Files!");
            File myFile = new File("newFile.txt");
            if (myFile.exists()) {
                myFile = new File("NewestFile" + y + ".txt");
            }
            FileWriter writeFile = new FileWriter(myFile);
            writeFile.write(header);
            writeFile.write("-----------------------------\n");
            while(x < 10) {
                writeFile.write(fileContent + y + "\n");
                x++;
            }
            writeFile.write("\n-----------------------------\n");
            writeFile.write(footer);
            writeFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
