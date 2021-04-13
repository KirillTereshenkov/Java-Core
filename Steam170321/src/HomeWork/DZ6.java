package HomeWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class DZ6 {

    private static final Random R = new Random();
    private static final int a = 90;
    private static final int b = 70;
    private static final int c = 80;
    private static final int d = 2;


    private static FileOutputStream fos;
    private static FileInputStream fis;

    private static String getLetters(int amount) {
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < amount; i++)
            sequence.append((char) (b + R.nextInt(c - b)));
        return sequence.toString();
    }

    private static void getFile(String fileName, int length) {
        try {
            fos = new FileOutputStream(fileName);
            fos.write(getLetters(length).getBytes());
        } catch (IOException e) {

        }
    }


    private static void connectionsFiles(String inputFile1, String inputFile2, String outputFile) {
        try {
            fos = new FileOutputStream(outputFile);
            int ch;
            fis = new FileInputStream(inputFile1);
            while ((ch = fis.read()) != -1)
                fos.write(ch);
            fis.close();

            fis = new FileInputStream(inputFile2);
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            fis.close();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {

        String[] fileNames = new String[d];
        for (int i = 0; i < fileNames.length; i++)
            fileNames[i] = "File " + i + ".txt";

        for (int i = 0; i < fileNames.length; i++)
            if (i < 2)
                getFile(fileNames[i], a);
        System.out.println("Созданные фаилы File 1 и File 2.");


        connectionsFiles(fileNames[0], fileNames[1], "File Result.txt");
        System.out.println("Склеиный фаил File Result.");

    }
}
