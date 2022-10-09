package Practical5;

import java.io.*;

public class Evensplit{
    public static final String DATA_SOURCE_PATH = "input.txt";
    public static final String EVEN_TARGET_PATH = "Even.txt";


    public static void dosplit() throws IOException, NumberFormatException {

        BufferedReader sourceReader = new BufferedReader(new FileReader(new File(DATA_SOURCE_PATH)));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter(new File(EVEN_TARGET_PATH)));

        String sourceLine = null;

        while ((sourceLine = sourceReader.readLine()) != null) {
            int lineNumber = Integer.parseInt(sourceLine.split(" ")[0]);

            if (lineNumber % 2 == 0) {
                evenWriter.write(sourceLine);
                evenWriter.newLine();
            }
        }
        sourceReader.close();
        evenWriter.close();

    }
}
