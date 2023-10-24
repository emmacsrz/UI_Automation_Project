package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.cydeo.Utilities.WebDriverFactory.compareTitle;
import static com.cydeo.Utilities.WebDriverFactory.compareURL;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
/*
TC #1: Cydeo practice tool verifications

 */


        WebDriverManager.chromedriver().setup();
//        1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

//        2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");


//        3. Verify URL contains
//        Expected: cydeo

        String expectedURL = "cydeo";
        compareURL(driver, expectedURL);

        System.out.println("-----------------------------------------------------");
        System.out.println();


//        4. Verify title:
//        Expected: Practice
        String expectedTitle = "Practice";
        compareTitle(driver, expectedTitle);


        driver.close();
        driver.quit();


    }
}
