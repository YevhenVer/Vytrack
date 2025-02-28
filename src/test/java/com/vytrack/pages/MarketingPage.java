package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MarketingPage extends BasePage{
    public MarketingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterButton;

    @FindBy(xpath = "//button[@class='ui-multiselect ui-corner-all select-filter-widget']")
    public WebElement manageFilters;


    @FindBy(xpath = "//a[.='Manage filters']/span[@class='caret']")
    public WebElement dropdownButton;

    @FindBy(xpath = "//input[@name='multiselect_0']")
    public List<WebElement> multiselectCheckbox;


    public void filterOptionsCanBeUnselected() {
        for (int i = 1; i <= 5; i++) {
            String element = "(//input[starts-with(@name,'multiselect')])[" + i + "]";
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            filterCheckBoxes.click();
            BrowserUtils.sleep(1);
            filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));//not to get stale element reference exception
            Assert.assertFalse(filterCheckBoxes.isSelected());
        }

    }
}
