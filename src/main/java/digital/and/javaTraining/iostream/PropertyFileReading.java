package digital.and.javaTraining.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("PropertyFileReading ----------");

        Properties prop = new Properties();
        try {
            // load a properties file for reading
            prop.load(new FileInputStream("./testData/myConfig.properties"));
            // get the properties and print
            prop.list(System.out);
            System.out.println("----");

            //Reading each property value
            System.out.println(prop.getProperty("FileName"));
            System.out.println(prop.getProperty("Author_Name"));
            System.out.println(prop.getProperty("Website"));
            System.out.println(prop.getProperty("TOPIC"));
            System.out.println("----");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}