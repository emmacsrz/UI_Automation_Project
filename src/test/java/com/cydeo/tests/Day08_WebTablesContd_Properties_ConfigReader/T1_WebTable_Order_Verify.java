package com.cydeo.tests.Day08_WebTablesContd_Properties_ConfigReader;

import com.cydeo.Utilities.WebDriverFactory;
import com.cydeo.Utilities.WebOrderUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_WebTable_Order_Verify {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //        1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

//        2. Go to https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void tes2_use_order_verify_method() {
        String alexandraGray = WebOrderUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println("alexandraGray = " + alexandraGray);
    }

    @Test
    public void test3(){

        WebOrderUtils.orderVerify(driver, "Bob Martin", "12/31/2021");

    }


}
