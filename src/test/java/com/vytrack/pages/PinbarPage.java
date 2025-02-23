package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage extends BasePage {
    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[.='Learn how to use this space']")
    public WebElement pinbarLink ;


    @FindBy(xpath = "(//h3)[2]")
    public WebElement header;

    @FindBy( xpath = "(//p)[1]")
    public WebElement text;

    @FindBy (tagName = "img")
    public WebElement image;

}
