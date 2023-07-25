package digital.and.javaTraining.iostream;

// Java code to illustrate standard
// input output streams

import java.io.*;

public class StandardIOStreams {
    public static void main(String[] args) throws IOException {
        System.out.println("StandardIOStreams ----------");

        // InputStreamReader class to read input
        InputStreamReader inp;

        // Storing the input in inp
        inp = new InputStreamReader(System.in);

        System.err.println("Enter characters, "
                + " and '0' to quit:");
        char c;
        do {
            c = (char)inp.read();
            System.out.println(" - " + c);
        } while (c != '0');
    }
}