package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleSelectionPage extends BasePage{

    public VehicleSelectionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@tabindex ='-1']")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement checkAllBoxes;

}
