/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class TesteProperties {

    public TesteProperties() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void caminho() {
        try {
            Properties props = getProperties();
            System.out.println("SERVER HOST: " + props.getProperty("prop.server.host"));
        } catch (IOException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }

    }

    public static Properties getProperties() throws IOException {
        String pastaRaiz = new File("").getCanonicalPath();

        Properties properties = new Properties();
        FileInputStream fileInput = new FileInputStream(pastaRaiz + "\\config.properties");
        properties.load(fileInput);
        return properties;
    }

}
