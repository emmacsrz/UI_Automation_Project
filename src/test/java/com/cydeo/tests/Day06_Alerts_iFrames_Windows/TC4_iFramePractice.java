package com.cydeo.tests.Day06_Alerts_iFrames_Windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4_iFramePractice {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        //        1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

//        2. Go to https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }


    @Test
    public void iFramePractice() {
//    TC #4: Iframe practice
//1. Create a new class called: T4_Iframes
//2. Create new test and make set ups

//4. Assert: “Your content goes here.” Text is displayed.
        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraphText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));

        Assert.assertTrue(paragraphText.isDisplayed());

//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().parentFrame();
        WebElement h3 =driver.findElement(By.tagName("h3"));
        Assert.assertTrue(h3.isDisplayed());

    }
}
