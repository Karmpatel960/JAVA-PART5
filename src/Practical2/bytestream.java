package Practical2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytestream {
    public static void main(String[] args) throws IOException
    {

        try (
                FileInputStream sourceStream = new FileInputStream("file1.txt");
                FileOutputStream targetStream = new FileOutputStream("file2.txt")
        ) {

            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte) temp);

            System.out.print("Program successfully executed");
        }
    }
}
