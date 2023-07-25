package digital.and.javaTraining.iostream;

import java.io.*;

class BufferedOutputStreamExample {

    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println();
        System.out.println("BufferedOutputStreamExample ----------");

        try {
            // loading a file into f variable
            FileOutputStream f1 = new FileOutputStream("./testData/output.txt");

            // declaring a f1 as BufferedOutputStream
            BufferedOutputStream f2 = new BufferedOutputStream(f1);

            String s = "Scaler Topics";
            char[] arr = s.toCharArray();
            // initializing x to 0
            int x = 0;
            // while loop untill the end of the string.
            while (x < s.length()) {
                // writing a byte into "output.txt" file
                f2.write(arr[x++]);
            }
            // closing a file
            f2.close();
            f1.close();
        } catch (Exception e) {
            // printing exception
            e.printStackTrace();
        }
    }
}