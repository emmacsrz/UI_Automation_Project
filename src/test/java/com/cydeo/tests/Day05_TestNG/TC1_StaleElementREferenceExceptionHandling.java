package com.cydeo.tests.Day05_TestNG;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC1_StaleElementREferenceExceptionHandling {
    public static void main(String[] args) throws InterruptedException {
//        XPATH PRACTICES
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.

//        1. Open Chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();


//        4. Verify “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed(), expecting true = " +  deleteButton.isDisplayed());
//        5. Click to “Delete” button.
        deleteButton.click();

//        6. Verify “Delete” button is NOT displayed after clicking
        Thread.sleep(2000);

        try{
            System.out.println("deleteButton.isDisplayed(), expecting false = " +  deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException Happened due to element being deleted from the page.");
            System.out.println("which concludes our test case has passed");

        }


        driver.quit();
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
