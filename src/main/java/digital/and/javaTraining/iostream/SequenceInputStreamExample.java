package digital.and.javaTraining.iostream;

import java.io.*;

class SequenceInputStreamExample {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("SequenceInputStreamExample ----------");

        try {
            FileInputStream input1 = new FileInputStream("./testData/sourcefile.txt");
            FileInputStream input2 = new FileInputStream("./testData/test.txt");
            SequenceInputStream inst = new SequenceInputStream(input1, input2);
            int j;
            while ((j = inst.read()) != -1) {
                System.out.print((char) j);
            }
            inst.close();
            input1.close();
            input2.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
