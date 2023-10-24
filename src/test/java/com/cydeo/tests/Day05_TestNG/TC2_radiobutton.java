package com.cydeo.tests.Day05_TestNG;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC2_radiobutton {
    public static void main(String[] args) {

//        TC #2: Radiobutton handling
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();

//        4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyButton.isSelected()){
            System.out.println("button is selected, verification passed");
        }else {
            System.out.println("button is not selected, verification failed");
        }

driver.quit();
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }
}
