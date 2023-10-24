package com.cydeo.tests.Day03_CssSelector_Xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_NextBaseCRM_Locators_GetText_GetAttribute {
    public static void main(String[] args) {
//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
//        3- Verify “Log in” button text is as expected:
//        Expected: Log In
        String expectedLoginText = "Log In";

        //locating using attribute value:
        // WebElement loginButton = driver.findElement(By.ByClassName"login-btn");

        //locating loginbutton using CSS selector using type attribute's value (submit) :
        //   WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //Locating loginButton using class attribute's value
        //WebElement loginButton = driver.findElement(By.className("login-btn"));

        //                                  tagName[attribute='value']

        //Locating loginButton using cssSelector using type attribute's value
        //WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        //Locating loginButton using cssSelector using class attribute's value
        //WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        //Locating loginButton using cssSelector using value attribute's value
        //WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        //Locating loginButton using cssSelector using class attribute's value
        //                                        tagName.classValue
        WebElement loginButton = driver.findElement(By.cssSelector("input.login-btn"));


        String actualLoginText = loginButton.getAttribute("value");
        if (actualLoginText.equals(expectedLoginText)) {
            System.out.println("login button verification passed");
        } else {
            System.out.println(" logn butn ver. failed");
        }


//        PS: Inspect and decide which locator you should be using to locate web elements.
//                PS2: Pay attention to where to get the text of this button from

        driver.quit();
    }
}
