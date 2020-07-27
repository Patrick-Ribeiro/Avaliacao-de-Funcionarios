package avaliacao.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author usuario
 */
public class Manipulador {

    public static Properties getProperties() throws IOException {
        String pastaRaiz = new File("").getCanonicalPath();

        Properties properties = new Properties();
        FileInputStream fileInput = new FileInputStream(pastaRaiz + "\\config.properties");
        properties.load(fileInput);
        return properties;
    }
}
