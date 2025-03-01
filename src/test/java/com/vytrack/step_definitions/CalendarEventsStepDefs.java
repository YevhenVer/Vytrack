package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CalendarEventsStepDefs {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

//    @When("the user is in the Calendar Events")
//    public void the_user_is_in_the_calendar_events() {
//
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//        calendarEventsPage.navigateToModule("Activities", "Calendar Events");
//
//    }
//
//    @Then("user should be able to create Calendar Event")
//    public void user_should_be_able_to_create_calendar_event() {
//
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//        calendarEventsPage.createCalendarEvent.click();
//
//    }
//
//    @And("user should be able to click on the repeat checkbox")
//    public void user_should_be_able_to_click_on_the_repeat_checkbox() {
//
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//        calendarEventsPage.repeatCheckbox.click();
//
//    }
//
//    @And ("user should see the default page as {int}.")
//    public void user_should_see_the_default_page_as(Integer expectedDefaultNum){
//
//        Assert.assertEquals(expectedDefaultNum, calendarEventsPage.defaultRepeatNum);
//    }
//
//
//    @When("user clears Calendar event Repeat Every field")
//    public void user_clears_calendar_event_repeat_every_field() {
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//        calendarEventsPage.defaultRepeatNum.click();
//
//    }
//
//    @Then("user should see error message {string}")
//    public void user_should_see_error_message(String expectedError) {
//
//        Assert.assertEquals(expectedError, calendarEventsPage.errorMessage);
//
//    }
//
//
@When("the user is in the Calendar Events")
public void the_user_is_in_the_calendar_events() {

    calendarEventsPage.waitUntilLoaderScreenDisappear();
    calendarEventsPage.navigateToModule("Activities", "Calendar Events");
}


    @Then("user should be able to click Create Calendar Event")
    public void user_should_be_able_to_click_create_calendar_event() {
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.createCalendarEvent.click();

    }


    @Then("user should be able to click on the repeat checkbox")
    public void user_should_be_able_to_click_on_the_repeat_checkbox() {

    calendarEventsPage.waitUntilLoaderScreenDisappear();
    calendarEventsPage.repeatCheckbox.click();

    }

    @Then("user should see the number {int} by default in the Repeat Every input.")
    public void user_should_see_the_number_by_default_in_the_repeat_every_input(Integer expectedRepeatNum) throws InterruptedException {

        System.out.println("expectedRepeatNum = " + expectedRepeatNum);
    calendarEventsPage.waitUntilLoaderScreenDisappear();
    Thread.sleep(1000);
        Integer actualDefaultRepeatNum = Integer.parseUnsignedInt(calendarEventsPage.defaultRepeatNum.getDomAttribute("value"));

        System.out.println("actualDefaultRepeatNum = " + actualDefaultRepeatNum);

        Assert.assertEquals( expectedRepeatNum, actualDefaultRepeatNum);


    }




    @When("user clears Calendar event Repeat Every field")
    public void user_clears_calendar_event_repeat_every_field() {

    calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.defaultRepeatNum.clear();

    }

    @Then("users should see error message {string}")
    public void users_should_see_error_message(String expectedMessage) {

    Assert.assertEquals(expectedMessage, calendarEventsPage.errorMessage.getText());

        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("errorMessage = " + calendarEventsPage.errorMessage);
    }

}
