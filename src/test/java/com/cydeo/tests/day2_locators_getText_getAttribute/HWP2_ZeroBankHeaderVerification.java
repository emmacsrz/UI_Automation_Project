package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_ZeroBankHeaderVerification {
    public static void main(String[] args) {


//    HWP #2: Zero Bank header verification
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


//2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

//            3. Verify header text
//    Expected: “Log in to ZeroBank”
        String expectedHeader = "Log in to ZeroBank";

        WebElement header = driver.findElement(By.tagName("h3"));
        String actualHeader = header.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("header verification passed");
        }else{
            System.err.println("header verification failed!!");
        }

        driver.close();
        driver.quit();

    }

}