package com.vytrack.step_definitions;

import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehicleContractsStepDefs {
    VehiclesPage vehicleContractsPage = new VehiclesPage();

    @Then("the user should be able to access to the Vehicles Contracts page")
    public void the_user_should_be_able_to_access_to_the_vehicles_contracts_page() {

        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        vehicleContractsPage.navigateToModule("Fleet", "Vehicle Contracts");

    }

    @Then("user should see {string} URL")
    public void user_should_see_url(String expectedUrl) {

        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.verifyURLContains(expectedUrl);

    }

    @Then("user should see {string} title")
    public void user_should_see_title(String expectedTitle) {

        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @Then("the user should not be able to access to the Vehicles Contracts page")
    public void the_user_should_not_be_able_to_access_to_the_vehicles_contracts_page() {

        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        vehicleContractsPage.navigateToModule("Fleet", "Vehicle Contracts");


    }

    @Then("app should display {string} message")
    public void app_should_display_message(String expectedMessage) throws InterruptedException {

        vehicleContractsPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(expectedMessage, vehicleContractsPage.message.getText());

        Thread.sleep(1000);
    }

}
