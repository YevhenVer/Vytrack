package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage extends BasePage{

    public MainModulesPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "main-menu")
    public WebElement mainModules;

    @FindBy(xpath = "//div[@id='main-menu']/ul/li")
    public List<WebElement>allModules;

}
