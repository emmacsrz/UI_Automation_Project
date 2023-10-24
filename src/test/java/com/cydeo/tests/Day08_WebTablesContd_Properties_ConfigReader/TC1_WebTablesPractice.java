package com.cydeo.tests.Day08_WebTablesContd_Properties_ConfigReader;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC1_WebTablesPractice {
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
    public void orderVerifyNameTest (){
//1. Go to:https://practice.cydeo.com/web-tables
//2. Verify Bob’s name is listed as expected.
//Expected: “Bob Martin”
//the following finds bob martin by locating its exact place:
    //table[@class='SampleTable']/tbody/tr[7]/td[2]
    WebElement bobsCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

    System.out.println("bobsCell = " + bobsCell.getText());

    String expectedName = "Bob Martin";
    String actualName = bobsCell.getText();


//3. VerifyBobMartin’s order date is as expected
// can use: //table[@class='SampleTable']/tbody/tr[7]/td[5]]
    //or:
    WebElement bobsOrderDate =
            driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

    String expectedDate = "12/31/2021";
    String actualDate = bobsOrderDate.getText();

    Assert.assertTrue(expectedDate.equals(actualDate));

//Expected: 12/31/2021

    }
}
