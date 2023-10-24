package com.cydeo.tests.Day03_CssSelector_Xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_NextBaseCRM_Locators_GetTExt_GetAtrtribute {
    public static void main(String[] args) {

//        TC #2: NextBaseCRM, locators, getText(), getAttribute() practice 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer

        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMe = "Remember me on this computer";
        String actualRememberMe = rememberMe.getText();

        if (actualRememberMe.equals(expectedRememberMe)){
            System.out.println( "remember be verification passed" );
        }else{
            System.err.println("remember me verification failed");
        }

//        4- Verify “forgot password” link text is as expected:
//        Expected: Forgot your password?

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedforgotPassswordLink = "FORGOT YOUR PASSWORD?";
        String ActualForgotPasswordLink = forgotPasswordLink.getText();

        if (ActualForgotPasswordLink.equals(expectedforgotPassswordLink)){
            System.out.println( "password link text verification passed" );
        }else{
            System.err.println("password link text verification failed");
        }

//                5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes

        String expectedInHref= "forgot_password=yes";
        String actualHrefValue = forgotPasswordLink.getAttribute("href");
        if (actualHrefValue.contains(expectedInHref)){
            System.out.println("href verification passed");
        }else{
            System.out.println("it did not pass. quit your job your code is awful ");
        }
        driver.quit();

    }
}
