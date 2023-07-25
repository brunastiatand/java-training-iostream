package digital.and.javaTraining.iostream;

// Java Program illustrating the
// Byte Stream to copy
// contents of one file to another file.

import java.io.*;
public class ByteStreamExample {
    public static void main(
            String[] args) throws IOException
    {
        System.out.println();
        System.out.println();
        System.out.println("ByteStreamExample ----------");

        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream
                    = new FileInputStream("./testData/sourcefile.txt");
            targetStream
                    = new FileOutputStream("./testData/targetfile.txt");

            // Reading source file and writing
            // content to target file byte by byte
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}