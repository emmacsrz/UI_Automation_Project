package com.cydeo.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        } else {
            System.err.println("given string doesnt represent any browser");
            System.err.println("either browser doesnt exist or is not supported");
            System.err.println("driver = null");
            return null;
        }

    }


    public static void compareTitle(WebDriver driver, String expectedTitle) {
        String actualTitle = driver.getTitle();
        boolean isSameTitle;

        if (actualTitle.contains(expectedTitle)) {
            isSameTitle = true;
        } else {
            isSameTitle = false;
        }

        System.out.println("expected Title = " + expectedTitle);
        System.out.println("actual Title = " + driver.getTitle());
        System.out.println("title matches? " + isSameTitle);
    }

    public static void compareURL(WebDriver driver, String expectedURL) {
        String actualURL = driver.getCurrentUrl();
        boolean isSameURL;

        if (actualURL.contains(expectedURL)) {
            isSameURL = true;
        } else {
            isSameURL = false;
        }

        System.out.println("expected In URL  = " + expectedURL);
        System.out.println("actual URL  = " + driver.getCurrentUrl());
        System.out.println("URL matches? " + isSameURL);
    }

    public static void lineBreak() {
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println();
    }
}
