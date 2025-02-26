package com.vytrack.step_definitions;

import com.vytrack.pages.VehiclesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;

public class VehicleOdometerStepDefs {

    VehiclesPage vehicleOdometerPage = new VehiclesPage();

    @When("user can click the Vehicle Odometer module.")
    public void user_can_click_the_vehicle_odometer_module() {

        vehicleOdometerPage.waitUntilLoaderScreenDisappear();
        vehicleOdometerPage.navigateToModule("Fleet", "Vehicle Odometer");
    }

    @Then("user should see error message {string}")
    public void user_should_see_error_message(String expectedErrorMessage) {

        Assert.assertEquals(expectedErrorMessage, vehicleOdometerPage.message.getText());

    }

    @When("the user is on the Vehicle Odometer page")
    public void the_user_is_on_the_vehicle_odometer_page() {

        vehicleOdometerPage.waitUntilLoaderScreenDisappear();
        vehicleOdometerPage.navigateToModule("Fleet", "Vehicle Odometer");

    }

    @Then("user should see the default page as {int}.")
    public void user_should_see_the_default_page_as(Integer expectedDefaultNum) {

//        Integer actualDefaultNum = new Integer();
//        System.out.println(actualDefaultNum);
//
//        Thread.sleep(3);
//        Assert.assertEquals((int) expectedDefaultNum, (int) actualDefaultNum );
        Integer actualDefaultNum = Integer.parseInt(vehicleOdometerPage.defaultPage.getDomAttribute("value"));

        Assert.assertEquals(  expectedDefaultNum, actualDefaultNum);
    }

    @Then("user should see the View Per Page as {int} by default.")
    public void user_should_see_the_view_per_page_as_by_default(Integer expectedPerPageNum) {

//        vehicleOdometerPage.waitUntilLoaderScreenDisappear();
//        Integer actualPerPageNum = Integer.valueOf(25);
//
//        Assert.assertEquals((int) expectedPerPageNum, (int) actualPerPageNum);

        System.out.println(expectedPerPageNum);

        Integer actualViewPerPageNum = Integer.parseInt(vehicleOdometerPage.viewPerPage.getText());
        Assert.assertEquals( expectedPerPageNum, actualViewPerPageNum);


          }


}
