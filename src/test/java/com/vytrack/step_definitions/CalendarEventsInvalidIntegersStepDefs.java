package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarEventsInvalidIntegersStepDefs {

    CalendarEventsPage calendarEventsInvalidIntegersStepDefs = new CalendarEventsPage();

    @When("user enter less than {int}  integer in the Repeat Every input.")
    public void user_enter_less_than_integer_in_the_repeat_every_input(Integer expectedNegativeInt) {
//        calendarEventsInvalidIntegersStepDefs.defaultRepeatNum.clear();
//        calendarEventsInvalidIntegersStepDefs.defaultRepeatNum.sendKeys("-1");
//        calendarEventsInvalidIntegersStepDefs.negativeInt = calendarEventsInvalidIntegersStepDefs.defaultRepeatNum;
//      //  Assert.assertEquals(expectedNegativeInt, calendarEventsInvalidIntegersStepDefs.defaultRepeatNum.getDomAttribute("value"));
//    //    Integer actualDefaultRepeatNum = Integer.parseUnsignedInt(calendarEventsInvalidIntegersStepDefs.negativeInt.getDomAttribute("value"));
//        System.out.println("calendarEventsInvalidIntegersStepDefs.defaultRepeatNum = " + calendarEventsInvalidIntegersStepDefs.defaultRepeatNum);
//
//        Integer actualDefaultRepeatNum = Integer.parseUnsignedInt( calendarEventsInvalidIntegersStepDefs.negativeInt.getDomAttribute("value"));
//        System.out.println("actual " + actualDefaultRepeatNum);
//
//        Assert.assertEquals(expectedNegativeInt, actualDefaultRepeatNum);

        calendarEventsInvalidIntegersStepDefs.waitUntilLoaderScreenDisappear();

        BrowserUtils.sleep(1);
        calendarEventsInvalidIntegersStepDefs.negativeInt.clear();
        BrowserUtils.sleep(1);
        calendarEventsInvalidIntegersStepDefs.negativeInt.sendKeys("-1");
       // String actualInputNegValue = calendarEventsInvalidIntegersStepDefs.negativeInt.getDomAttribute("value");

//        //Assert.assertEquals("-1", inputNegValue, "-1");
//        Assert.assertEquals(expectedNegativeInt, inputNegValue);
//        System.out.println("expectedRepeatNum = " + expectedRepeatNum);
//        calendarEventsPage.waitUntilLoaderScreenDisappear();
//        Thread.sleep(1000);
//        Integer actualDefaultRepeatNum = Integer.parseUnsignedInt(calendarEventsPage.defaultRepeatNum.getDomAttribute("value"));
//
//        System.out.println("actualDefaultRepeatNum = " + actualDefaultRepeatNum);
//
//        Assert.assertEquals( expectedRepeatNum, actualDefaultRepeatNum);
//

    }

    @Then("user should see error message for negative int {string}")
    public void user_should_see_error_message_for_negative_int(String expectedNegativeIntMessage) {

       // Assert.assertEquals(expectedNegativeIntMessage, calendarEventsInvalidIntegersStepDefs.errorNegativeIntMessage);

      Assert.assertEquals(expectedNegativeIntMessage, calendarEventsInvalidIntegersStepDefs.errorNegativeIntMessage.getText());
    }

    @When("user enter more than {int} integer in the Repeat Every input.")
    public void user_enter_more_than_integer_in_the_repeat_every_input(Integer expectedGreaterInt) {

        calendarEventsInvalidIntegersStepDefs.waitUntilLoaderScreenDisappear();
        calendarEventsInvalidIntegersStepDefs.defaultRepeatNum.clear();
        calendarEventsInvalidIntegersStepDefs.defaultRepeatNum.sendKeys( "107");
        Assert.assertEquals(expectedGreaterInt, calendarEventsInvalidIntegersStepDefs.defaultRepeatNum.getDomAttribute("value"));
        System.out.println("Defs.defaultRepeatNum = " + calendarEventsInvalidIntegersStepDefs.defaultRepeatNum);

    }

    @Then("user should see error message for greater int {string}")
    public void user_should_see_error_message_for_greater_int(String expectedGreaterIntMessage) {

      //  Assert.assertEquals(expectedGreaterIntMessage, calendarEventsInvalidIntegersStepDefs.errorGreaterIntMessage);

        Integer actualNegRepeatNum = Integer.parseUnsignedInt( calendarEventsInvalidIntegersStepDefs.greaterInt.getDomAttribute("value"));
        System.out.println("actual " + actualNegRepeatNum);

        Assert.assertEquals(expectedGreaterIntMessage, actualNegRepeatNum);
        // Assert.assertEquals(expectedGreaterIntMessage, calendarEventsInvalidIntegersStepDefs.errorGreaterIntMessage.getText());
    }


}
