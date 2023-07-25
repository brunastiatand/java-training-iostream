package digital.and.javaTraining.iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileWriting {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("PropertyFileWriting ----------");

        Properties prop = new Properties();
        try {
            // set the properties value
            prop.setProperty("Italia", "Roma");
            prop.setProperty("Netherlands", "Amsterdam");
            prop.setProperty("England", "London");
            prop.setProperty("Japan", "Tokio");
            // save properties to project root folder
            prop.store(new FileOutputStream("./testData/capitals.properties"), null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}