package Practical5;


import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any 10 Digit to Sort even in file");

        try {
            FileWriter myWriter = new FileWriter("input.txt");
            for (int i = 0; i < 15; i++) {
                String s=in.next();
                myWriter.write(s+"\n");
            }

            myWriter.close();
            System.out.println("Program is Done Successful");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        Evensplit.dosplit();
        try {
            File myObj = new File("Even.txt");
            Scanner myReader = new Scanner(myObj);
            System.out.println("Saved Even Numbers Are ");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Prapared By PATEL KARM HITESHKUMAR(21CE095)");
    }
}

