package digital.and.javaTraining.iostream;

// In order to create an InputStream, we must import the java.io.InputStream package first.
//
// Once we import the package, we create an input stream using FileInputStream.
// It is because InputStream is an abstract class, that we cannot create an object of InputStream.


import java.io.FileInputStream;
import java.io.InputStream;

class FileInputStreamExample {
    public static void main(String args[]) {

        byte[] array = new byte[20];

        try {
            InputStream input = new FileInputStream("./testData/sourcefile.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream (only the first 20)
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println("[" + data + "]");

            // Close the input stream
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}