package Practical3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyfile {
    public static void copy(File a, File b) throws Exception
    {

        try (FileInputStream in = new FileInputStream(a);
             FileOutputStream out = new FileOutputStream(b)) {

            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        }
        System.out.println("File Copied");
    }
}
