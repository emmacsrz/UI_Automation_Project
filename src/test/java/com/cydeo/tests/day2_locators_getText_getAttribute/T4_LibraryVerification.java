package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {
    public static void main(String[] args) {


//        TC #4: Library verifications
//        1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

//        2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");

//        3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

//        4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.className("form-control"));
               passwordInput.sendKeys("incorrect password");

//        5. Verify: visually “Sorry, Wrong Email or Password”   displayed

//        PS: Locate username input box using “className” locator

//        Locate password input box using “id” locator

//        Locate Sign in button using “tagName” locator



    }
}
