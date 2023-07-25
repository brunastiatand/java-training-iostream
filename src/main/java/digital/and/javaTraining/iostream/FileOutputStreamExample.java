package digital.and.javaTraining.iostream;

// In order to create an OutputStream, import the java.io.OutputStream package first.
//
// We create an object of output stream using FileOutputStream.
// This because OutputStream is an abstract class, so we cannot create an object of OutputStream.

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamExample {

    public static void main(String args[]) {

        String data = """
sorcefile.txt
Example of data in a file
                
                """;

        try {
            OutputStream out = new FileOutputStream("./testData/sourcefile.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}