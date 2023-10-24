
package com.cydeo.tests.Day04_FindElements_Checkbox_RadioButton;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_StaleElementReferenceException {
    public static void main(String[] args) {
//        This is a simple StaleElementReferenceException to understand what is this exception and how to handle it.

//        TC #4: StaleElementReferenceException Task
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

//        3- Locate “CYDEO” link, verify it is displayed. 4- Refresh the page.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("Before refresh: cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();
        System.out.println("Refreshing the page...");

        //5- Verify it is displayed, again.
        cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']")); //relocates the element and reassigns it to the same variable
        System.out.println("After refresh: cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        driver.quit();

    }
}
