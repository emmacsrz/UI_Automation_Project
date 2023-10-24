package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.cydeo.Utilities.WebDriverFactory.compareTitle;

public class HWP1_EtsySearchTitle {
    public static void main(String[] args) {


//              1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//              2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");


//              3. Search for “wooden spoon”
        WebElement etsySearchBox = driver.findElement(By.id("global-enhancements-search-query"));
etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

//              4. Verify title:
//              Expected: “Wooden spoon - Etsy”
        String expectedTitle = "Wooden spoon - Etsy";

        compareTitle(driver, expectedTitle);

        driver.close();
        driver.quit();


    }



}
