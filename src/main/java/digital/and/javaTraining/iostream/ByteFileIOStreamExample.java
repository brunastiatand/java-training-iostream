package digital.and.javaTraining.iostream;

import java.io.*;
public class ByteFileIOStreamExample {

    public static void main(String[] args) {
        System.out.println("ByteFileIOStreamExample ----------");

        try {
            byte[] bWrite = {11,21,3,40,5,52,50,12,80,65,79,76,79};
            OutputStream os = new FileOutputStream("./testData/test.txt");
            for(int x = 0; x < bWrite.length ; x++) {
                os.write( bWrite[x] );   // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("./testData/test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++) {
                System.out.print(" [" + (char)is.read() + "] ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}