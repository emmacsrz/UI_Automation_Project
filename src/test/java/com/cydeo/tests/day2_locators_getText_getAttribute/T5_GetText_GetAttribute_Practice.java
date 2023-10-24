package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute_Practice {
    public static void main(String[] args) {

//        TC #5: getText() and getAttribute() method practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");


//        3- Verify header text is as expected:
//        Expected: Registration form
        WebElement header = driver.findElement(By.tagName("h2"));
        String expectedHeaderText="Registration Form";
        String actualHeaderText=  header.getText(); //returns text of the header as a string
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verification passed");
        }else{
            System.err.println("header verification failed");
        }



//        4- Locate “First name” input box
        WebElement fristNameInput = driver.findElement(By.className("form-control"));


//        5- Verify placeholder attribute’s value is as expected:
//        Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = fristNameInput.getAttribute("placeholder");

        System.out.println("actualPlaceHolder = " + actualPlaceHolder);

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("place holder attribute  verification passed");
        }else{
            System.err.println("place holder attribute verifiaction failed");
        }

    }
}
