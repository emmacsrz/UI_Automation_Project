package com.cydeo.tests.Day09_JavaFaker_DriverUtils;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_bing_search {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigurationReader.getProperty("bingURL"));
    }

    @Test
    public void bingSearchTest() throws InterruptedException {
        //3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));

        Thread.sleep(2000);

        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        // 4- Verify title:  //Expected: apple - Search
        String actualTitle = driver.getTitle();
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Search";
        Assert.assertEquals(actualTitle, expectedTitle);
    }


}
