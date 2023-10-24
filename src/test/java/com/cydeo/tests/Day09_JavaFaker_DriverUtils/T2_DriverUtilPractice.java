package com.cydeo.tests.Day09_JavaFaker_DriverUtils;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T2_DriverUtilPractice {

    //TC #1: Bing search

    WebDriver driver;

    @AfterMethod

    public void tearDownMethod(){
        Driver.getDriver().quit();

    }

    @Test
    public void bing_search_test() throws InterruptedException {
        //3- Write “apple” in search box
        //2- Go to: https://bing.com

        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        //locate the search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        Thread.sleep(2000);
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        //Expected: flowers - Search
        String actualTitle = driver.getTitle();

        //String expectedTitle = "apple - Search";
        //We are just making the expectedTitle dynamic based on the text we are searching.
        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }


    @Test
    public void bing_search_test2() throws InterruptedException {
        //3- Write “apple” in search box
        //2- Go to: https://bing.com

        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        //locate the search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        Thread.sleep(2000);
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        //Expected: flowers - Search
        String actualTitle = driver.getTitle();

        //String expectedTitle = "apple - Search";
        //We are just making the expectedTitle dynamic based on the text we are searching.
        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";

        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }
}

