package Practical4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Characterstream {
    public static void cs() throws IOException {
        try (
                FileReader in = new FileReader("file2.txt");
                FileWriter out = new FileWriter("file1.txt")
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.print(" Character Stream Program successfully executed\n");
        }
    }
}

