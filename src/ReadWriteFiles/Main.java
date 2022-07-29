package ReadWriteFiles;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 0;
            Random random = new Random();
            int y = random.nextInt(500);
            System.out.println("Writing Files!");
            File myFile = new File("newFile.txt");
            if (myFile.exists()) {
                myFile = new File("NewestFile" + y);
            }
            FileWriter writeFile = new FileWriter(myFile);
            while(x < 10) {
                writeFile.write("This is a new line!! " + y + "\n");
                x++;
            }
            writeFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
