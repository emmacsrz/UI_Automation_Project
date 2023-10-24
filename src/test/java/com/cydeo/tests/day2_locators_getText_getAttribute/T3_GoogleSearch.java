package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

//        TC#3: Google search
//1- Open a chrome browser
        WebDriver driver = new ChromeDriver();

//2- Go to: https://google.com
        driver.get("https://google.com");

//3- Write “apple” in search box

        //a. locate search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        //b.  enter "apple" keyword and press enter
        googleSearchBox.sendKeys("apple" + Keys.ENTER); //SIMULUATES typingand then pressing enter button

//4- Press ENTER to search

         //combined  in above step

//5- Verify title:
        Thread.sleep(2000);

        String expectedTitle = "apple";

        if (expectedTitle.startsWith("apple")){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }

        driver.close();
        driver.quit();


//Expected: Title should start with “apple” word








    }
}
