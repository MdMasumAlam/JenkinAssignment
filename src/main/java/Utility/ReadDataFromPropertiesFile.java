package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

    public static String readPropertiesFile(String value) throws IOException {
        Properties prop = new Properties();

        FileInputStream file = new FileInputStream("C:\\Users\\mdalam01\\eclipse-workspace\\Jenkins_Assingnment\\TestData\\config.properties");
        prop.load(file);

        return prop.getProperty(value);

    }

}
