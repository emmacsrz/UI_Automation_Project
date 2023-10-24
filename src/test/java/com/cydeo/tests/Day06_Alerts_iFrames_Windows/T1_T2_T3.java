package com.cydeo.tests.Day06_Alerts_iFrames_Windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_T2_T3 {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        //        1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

//        2. Go to http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }


    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void tc1_informationAlertPractice() throws InterruptedException {
//  1,2 before method handled

// 3. Click to “Click for JS Alert” button
        WebElement informationButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationButton.click(); //gets JS alert to popup

//4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

//5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();
    }


    @Test
    public void confirmationAlertPractice() throws InterruptedException {
        //TC #2: Confirmation alert practice

        //3. Click to “Click for JS Confirm” button
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmationAlert.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        //Thread.sleep(1000);
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());
    }


    @Test
    public void tc3_informationAlertPractice() {
//1, 2 handled by beforemethod

// 3. Click to “Click for JS Prompt” button

//4. Send “hello” text to alert
//5. Click to OK button from the alert
//6. Verify “You entered: hello” text is displayed.
    }
}
