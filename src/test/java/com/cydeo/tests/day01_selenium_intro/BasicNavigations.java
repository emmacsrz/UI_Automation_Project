package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //setup browser driver:
        WebDriverManager.chromedriver().setup();

        //create instance of browser driver:
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //go to tesla.com
        driver.get("https://tesla.com");
        //what happens if you delete https? it will not work.  It will work without www. but not without https
        System.out.println("Tesla URL = " + driver.getCurrentUrl());

        String teslaTitle = driver.getTitle(); //gets tesla title

        //use navigate back()  to go back
        //stop execution
        Thread.sleep(1000);

        driver.navigate().back();

        //stop execution
        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        //user refreshes the page using navigate.refresh()
        driver.navigate().refresh();

        //navigate to google.com using navigate . to method
        driver.navigate().to("https://google.com");

        String googleTitle = driver.getTitle();  //gets google title

        System.out.println("Google URL: " + driver.getCurrentUrl());

        System.out.println("tesla title =  " + teslaTitle + "\nGoogle title = " + googleTitle);

        driver.close();
        driver.quit();

    }
}
