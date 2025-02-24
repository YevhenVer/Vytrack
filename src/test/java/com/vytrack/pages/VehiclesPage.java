package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage extends BasePage {

    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * Vehicle page locators
     */
    @FindBy(xpath = "//input[@tabindex ='-1']")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']//input[@type='checkbox']")
    public WebElement checkAllBoxes;


    /**
     * Vehicle Costs page locators
     */


    @FindBy(xpath = "//thead[@class='grid-header']//span[1]")
    public List<WebElement> tableColumns;


    /**
     * Vehicle Contracts page locators
     */


    @FindBy(xpath = "//div[@class='message' and contains(text(),'permission')]")
    public WebElement message;


}