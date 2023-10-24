package com.cydeo.tests.Day07_Webtables_Utilities;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TC1_WindowHandlePractice {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        //        1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

//        2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void WindowHandlePractice() {

//1-3 already handled
//4. Create a logic to switch to the tab where Etsy.com is open
// 5. Assert:Titlecontains“Etsy”
//Lines to be pasted:
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");  //javascript code that opens new tab and goes to google.com

        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");

        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");


//These lines will simply open new tabs using something called JavascriptExecutor and get those pages. We will learn JavascriptExecutor later as well.

        //return and store all window handles in a set"

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) { //will go through each one of the window handles
            driver.switchTo().window(each);
            System.out.println("current  url: " + driver.getCurrentUrl()); //switches between different window handles with each iteration

            if (driver.getCurrentUrl().contains("etsy")) {//breaks the loop if it finds etsy, making etsy the final url we are seeking
                break;
            }
        }


        String actualTitle = driver.getTitle();
        String expectedTitle = "Etsy";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
