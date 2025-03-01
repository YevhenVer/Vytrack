package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage extends BasePage {
    public CalendarEventsPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath =  "//a[@class='btn main-group btn-primary pull-right ']")
    //@FindBy(xpath = "//a[@href='/calendar/event/create']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckbox;

   //@FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
   // @FindBy(xpath = "(//input[@class='recurrence-subview-control__number' and @value='1'])[1]")
   //@FindBy(xpath = "//input[@class='recurrence-subview-control__number'][1]")
   //@FindBy(xpath = "(//input[@data-related-field='interval' and @value='1'])[1]")
   //  @FindBy(xpath = "//*[@id='oro_calendar_event_form-uid-67c25458c9fa7']//input[3]")
   @FindBy(xpath = "(//label//input[@value='1'])[1]")
    public WebElement defaultRepeatNum;


    @FindBy(xpath = "//span[text()='This value should not be blank.']")
    public WebElement errorMessage;

}
