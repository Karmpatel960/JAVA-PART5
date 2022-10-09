package Practical1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String path;
            boolean b;
            File file = new File("file2.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }

            File file2 = file.getCanonicalFile();
            path = file2.getAbsolutePath();
            System.out.print(path + " is Exist in Computer");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nPrapared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}
