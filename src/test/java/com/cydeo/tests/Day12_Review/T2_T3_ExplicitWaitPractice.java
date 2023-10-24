package com.cydeo.tests.Day12_Review;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import com.cydeo.pages.DynamicControlsPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_T3_ExplicitWaitPractice {

    DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();


@BeforeMethod
public void setupMethod(){
    Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
    dynamicControlsPage =new DynamicControlsPage();

}

    @Test
    public void T2removeCheckboxTest() {
//   TC #2: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls
// 3- Click to “Remove” button

        dynamicControlsPage.removeButton.click();

//4- Wait until “loading bar disappears”

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar)); //waiting until loading bar disappears

        //using custom utility method instead of above lines of code:

        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

//5- Verify:
//a. Checkbox is not displayed
        try {
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed()); //assert false waits for a false boolean condition
        } catch (NoSuchElementException n) {
            System.out.println("no such element exception was thrown, it means the checkbox is no longer on the page.");
            Assert.assertTrue(true);
        }

//b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        Driver.closeDriver();
    }


    @Test
    public void t3ExplicitWaitPractice() {
//   TC #3: Explicit wait practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/dynamic_controls

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

// 3- Click to “Enable” button
dynamicControlsPage.enableButton.click();

//4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

//5- Verify:
//a. Input box is enabled.
Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled(), "input box is not enabled");

//b. “It’s enabled!” message is displayed.
Assert.assertTrue(dynamicControlsPage.message.isDisplayed(), "message is not displayed");
    }
}
