package com.cydeo.tests.Day03_CssSelector_Xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_GetText {
    public static void main(String[] args) {

//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


//        3- Enter incorrect username: “incorrect”
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrectUserName");

//        4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputUserName.sendKeys("incorrectPassword");

//        5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

//        6- Verify error message text is as expected:
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Incorrect login or password";

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("error message Verification passed");
        }else{
            System.err.println("Error message verification FAILED!!!!!!!!!!!!!");
        }

//        Expected: Incorrect login or password
//        PS: Inspect and decide which locator you should be using to locate web elements.

        driver.close();
        driver.quit();
    }
}
