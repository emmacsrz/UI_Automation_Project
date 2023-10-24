package com.cydeo.tests.Day08_WebTablesContd_Properties_ConfigReader;

import org.testng.annotations.Test;

public class LearningProperties {
    //java is tracking some information about our computer, our project and username, etc.
    //we will print them out:


    @Test
    public void java_properties_reading_test(){
        //key=value
        //we pass the key and it returns the value
        System.out.println("OS name= " + System.getProperty("os.name"));
        System.out.println("User nam= " + System.getProperty("user.name"));
    }

}
