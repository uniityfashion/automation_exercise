package Testing_xperts.Pages.Utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    // Static block executes once when class is loaded
    static {
        try {
            // Load config.properties from src/test/resources
            InputStream is = ConfigReader.class.getClassLoader()
                    .getResourceAsStream("config.properties");

            if (is == null) {
                throw new RuntimeException("config.properties file not found in resources folder");
            }

            // Load key-value pairs into Properties object
            prop.load(is);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties");
        }
    }

    // Method to get value by key
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
