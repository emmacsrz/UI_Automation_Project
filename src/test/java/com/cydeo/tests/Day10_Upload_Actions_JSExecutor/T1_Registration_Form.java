package com.cydeo.tests.Day10_Upload_Actions_JSExecutor;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form() {
//   TC#1: Registration form confirmation
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

//3. Enter first name
        Faker faker = new Faker();

        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

//4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());


//5. Enter username

        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        inputUsername.sendKeys("emmaemma58");


//6. Enter email address
        WebElement inputEmailAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmailAddress.sendKeys(faker.name().firstName().toLowerCase() + "@gmail.com");

//7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys("password");

//8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));

//9. Select a gender from radio buttons
        WebElement radioButtonFemale = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        radioButtonFemale.click();

//10.Enter date of birth

        WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputDateOfBirth.sendKeys("06/14/1993");

//11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.name("department")));
        departmentDropdown.selectByValue("DE");

//12.Select Job Title
        Select jobTitleDropDown = new Select(Driver.getDriver().findElement(By.name("job_title")));
        jobTitleDropDown.selectByVisibleText("SDET");

//13.Select programming language from checkboxes
        WebElement javaCheckbox = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        javaCheckbox.click();

//14.Click to sign up button
        WebElement signUpButton = Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpButton.click();

//15.Verify success message “You’ve successfully completed registration.” is displayed.
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
        Assert.assertTrue(successMessage.isDisplayed());



    }
}
