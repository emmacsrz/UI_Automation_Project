package com.cydeo.tests.Day10_Upload_Actions_JSExecutor;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_FileUploadPractice {

    @Test
    public void file_upload_test(){
// TC #2 Upload Test
//1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

//2. Find some small file from your computer, and get the path of it.
        String path = "/Users/emmapalmieri/Desktop/file.txt";
// 3. Upload the file.
        WebElement chooseFileButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        chooseFileButton.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadButton.click();


//4. Assert:  -File uploaded text is displayed on the page
        WebElement fileUploadHeader = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadHeader.isDisplayed(), "header text is not displayed");

Driver.closeDriver();

    }
}
