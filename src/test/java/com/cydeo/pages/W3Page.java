package com.cydeo.pages;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//#1 create constructor and initialize the driver instance and object of the current class
public class W3Page {

    public W3Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //#2 find webelement and use findby annotation to find it
    @FindBy(id = "demo")
    public WebElement paragraph;



}
