package com.cydeo.tests.Day10_Upload_Actions_JSExecutor;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC6_Scroll_Using_JSExecutor {

    @Test
    public void scrollUsingJavascriptExecutor(){

// 1- Open a chrome browser
// 2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll ");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

// 3- Use below JavaScript method and scroll

// a. 750 pixels down 10 times.
        BrowserUtils.sleep(2);
        //  js.executeScript("window.scrollBy(0, 750)"); //scrolling by (x,y) axis

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");
        }

// b. 750 pixels up 10 times

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, -750)"); //negative numbers scroll upwards
        }

// JavaScript method to use : window.scrollBy(0,0)

        Driver.closeDriver();


    }
}
