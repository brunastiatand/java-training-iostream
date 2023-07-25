package digital.and.javaTraining.iostream;

import java.io.*;

public class FileReadingJava7Way {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("FileReadingJava7Way ----------");

        File file = new File("./testData/myConfig.properties");

        try (FileInputStream fis = new FileInputStream(file)) {
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}