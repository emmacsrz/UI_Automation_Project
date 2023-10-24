package com.cydeo.tests.Day06_Alerts_iFrames_Windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdownds_T6_T7_T8 {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        //        1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

//        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void dropdowns_Task6() throws InterruptedException {
        //1,2 is being executed by before method.

//        3. Select “December 1st, 1933” and verify it is selected.
//       Select year using : visible text Select month using : value attribute Select day using : index number
        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        yearDropDown.selectByVisibleText("1933");
        Thread.sleep(2000);

        monthDropDown.selectByValue("11");
        Thread.sleep(2000);

        dayDropDown.selectByIndex(0);
        Thread.sleep(2000);

        //verify are selected:
        String expectedYear = "1933";
        String expectedDay = "1";
        String expectedMonth = "December";

        String actualYear = yearDropDown.getFirstSelectedOption().getText();
        String actualDay = dayDropDown.getFirstSelectedOption().getText();
        String actualMonth = monthDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedDay, actualDay);
        Assert.assertEquals(expectedMonth, actualMonth);
        Assert.assertEquals(expectedYear, actualYear);

    }


    @Test
    public void dropdown_Task7() {
//    TC #7: Selecting state from State dropdown and verifying result
        //steps 1,2 is being executed by before method.
Select stateDropdown = new Select(driver.findElement(By.xpath("//Select[@id='state']")));

//3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");

//4. Select Virginia
        stateDropdown.selectByValue("VA");

//5. Select California
        stateDropdown.selectByIndex(5);

//6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();


        //assertion
        Assert.assertEquals(actualOptionText, expectedOptionText, "STATE DROPDOWN VALUE IS NOT AS EXPECTED!");

//Use all Select options. (visible text, value, index)


    }

    @Test
    public void dropdown_task8(){
            //TC #8: Selecting value from non-select dropdown

            //3. Click to non-select dropdown
            //locate the non-select dropdown
            WebElement websiteDropdown = driver.findElement(By.linkText("Dropdown link"));
            //Thread.sleep(1000);
            websiteDropdown.click();
            //Thread.sleep(1000);

            //4. Select Facebook from dropdown
            WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
            //Thread.sleep(1000);
            facebookLink.click();

            //5. Verify title is  "Facebook - log in or sign up"
            String expectedTitle = "Facebook - log in or sign up";
            String actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitle, "Titles are not equal!");

        }


}
