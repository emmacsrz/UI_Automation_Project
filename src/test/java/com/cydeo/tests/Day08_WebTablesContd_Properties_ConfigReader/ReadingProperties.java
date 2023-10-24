package com.cydeo.tests.Day08_WebTablesContd_Properties_ConfigReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {


    @Test

    public void reading_from_properties_test() throws IOException {
//STEPS TO READ FROM PROPERTIES TYPE OF FILE

        //1-create object of properties
        Properties properties = new Properties();

        //2- open the file in the java memory
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- load properties file in properties object
        properties.load(file); //USED ioEXCEPTION because it is the super

        //4- use the "properties" object to read value from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));


    }
}
