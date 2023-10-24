package com.cydeo.tests.Day10_Upload_Actions_JSExecutor;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test() {
// TC #3: Hover Test
//1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        //locating all images by index numbers:
        WebElement image1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locating all the user headers:
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));


        //to be able to hover on images we need to create actions class object and pass "driver " in constructor
        Actions actions = new Actions(Driver.getDriver());

//2. Hover over to first image
        BrowserUtils.sleep(2); //for display purposes only to see the hovering happen
        actions.moveToElement(image1).perform(); //mouse will hover over image 1 web element

//3. Assert: “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());

// 4. Hover over to second image
        BrowserUtils.sleep(2); //for display purposes only to see the hovering happen
        actions.moveToElement(image2).perform(); //mouse will hover over image 1 web element

//5. Assert: “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

// 6. Hover over to third image
        BrowserUtils.sleep(2); //for display purposes only to see the hovering happen
        actions.moveToElement(image3).perform(); //mouse will hover over image 1 web element

//7. Confirm: “name: user3” is displayed
        actions.moveToElement(image3).perform(); //mouse will hover over image 1 web element

        Driver.closeDriver();
    }
}
