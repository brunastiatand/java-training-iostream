package digital.and.javaTraining.iostream;

import java.io.*;

class _Global_Main {

    public static void main(String[] args) throws IOException {
        StandardIOStreams.main(args);

        FileOutputStreamExample.main(args);
        FileReaderExample.main(args);
        ByteStreamExample.main(args);
        FileInputStreamExample.main(args);
        ByteFileIOStreamExample.main(args);

        BufferedOutputStreamExample.main(args);
        SequenceInputStreamExample.main(args);

        PropertyFileReading.main(args);
        PropertyFileWriting.main(args);

        FileReadingJava7Way.main(args);

        System.out.println();
        System.out.println();
    }
}
