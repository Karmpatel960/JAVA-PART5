package Practical2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characterstram {
    public static void main(String[] args) throws IOException {
        try (
                FileReader in = new FileReader("file2.txt");
                FileWriter out = new FileWriter("file1.txt")
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);


            }
            System.out.print("Program successfully executed");
        }
    }
}
