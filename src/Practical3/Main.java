package Practical3;

import java.io.*;
import java.util.*;
public class Main {


        public static void main(String[] args) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the source filename from where you have to read :");
            String a = sc.nextLine();
            File x = new File(a);
            System.out.println("Enter the destination filename where you have to write:");
            String b = sc.nextLine();
            File y = new File(b);
            if (x.createNewFile()) {
                System.out.println("New File is created file1!");
            } else {
                System.out.println("File already exists.");
            }
            if (y.createNewFile()) {
                System.out.println("New File is created file2!");
            } else {
                System.out.println("File already exists.");
            }
            copyfile.copy(x, y);
            System.out.println("Prapared By PATEL KARM HITESHKUMAR(21CE095)");
        }
    }

