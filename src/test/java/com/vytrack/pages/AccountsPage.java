package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage extends BasePage{

    public AccountsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='filter-container']/select/option")
    public List<WebElement> filterItems;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterButton;







}
