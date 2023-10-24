package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1-setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2 - create instance of chrome driver
        WebDriver driver = new ChromeDriver();
        //this will open a new chrome browser everytime you run your code


        //3 - test if driver and browser are working as expected
        driver.get("https://www.google.com");


    }

}
