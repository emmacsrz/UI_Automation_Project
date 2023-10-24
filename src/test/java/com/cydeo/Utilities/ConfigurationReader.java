package com.cydeo.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader { //1- Create the Properties object (create object)
    //make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else.


    //1 - Create properties object
    private static Properties properties = new Properties();
    //made it private so we are limiting access to the objec
    //static is to make sure it is created and loaded before everything else

    static {

        try {
            //2 - Open file using file input stream
            FileInputStream file = new FileInputStream("configuration.properties");
            //3 - Load properties object with file
            properties.load(file);

            //close file in the memory
            file.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }

    //create a method to use the object to read:
    //4 - use properties object to read from the file
    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
