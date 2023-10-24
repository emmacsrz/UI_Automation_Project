package com.cydeo.tests.Day11_POM_ExplicitWaits;

import com.cydeo.Utilities.Driver;
import org.testng.annotations.Test;

public class Understanding_closeDriver_method {
    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");
        Driver.closeDriver();
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://google.com");
        Driver.closeDriver();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://google.com");
        Driver.closeDriver();
    }

}
