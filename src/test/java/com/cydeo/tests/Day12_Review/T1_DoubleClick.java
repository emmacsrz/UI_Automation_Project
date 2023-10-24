package com.cydeo.tests.Day12_Review;

import com.cydeo.Utilities.Driver;
import com.cydeo.pages.W3Page;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void doubleClickTest() {
//https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

//2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

//3. Double-click on the text “Double-click me to change my text color.”
        W3Page w3Page = new W3Page();
        Actions actions = new Actions(Driver.getDriver());
        //   w3Page.paragraph.click(); we need to use actions class isntead because double click is an advanced action

        actions.doubleClick(w3Page.paragraph).perform();

//4. Assert: Text’s “style” attribute value contains “red”.
        String actualStyleAttributeValue = w3Page.paragraph.getAttribute("style");
        String expectedInAttributeValue = "red";

        Assert.assertTrue(actualStyleAttributeValue.contains(expectedInAttributeValue));


        Driver.closeDriver();

    }

}
