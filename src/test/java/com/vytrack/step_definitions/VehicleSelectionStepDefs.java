package com.vytrack.step_definitions;

import com.vytrack.pages.VehicleSelectionPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class VehicleSelectionStepDefs {
    VehicleSelectionPage vehiclePage = new VehicleSelectionPage();

    WebElement selectedCheckbox;

    @Given("the user in on the Vehicles page")
    public void the_user_in_on_the_vehicles_page() {
        vehiclePage.waitUntilLoaderScreenDisappear();
        vehiclePage.navigateToModule("Fleet", "Vehicles");
        vehiclePage.waitUntilLoaderScreenDisappear();

    }

    @When("all vehicle checkboxes should be unchecked")
    public void all_vehicle_checkboxes_should_be_unchecked() {
        List<WebElement> checkboxes = vehiclePage.checkBoxes;

        for (WebElement checkbox : checkboxes) {
            Assert.assertFalse(checkbox.isSelected());
        }
    }


    @When("the user checks the first checkbox")
    public void the_user_checks_the_first_checkbox() {
        vehiclePage.checkAllBoxes.click();
    }

    @Then("all vehicle checkboxes should be checked")
    public void all_vehicle_checkboxes_should_be_checked() {

        List<WebElement> checkboxes = vehiclePage.checkBoxes;

        for (WebElement eachCheckBox : checkboxes) {
            Assert.assertTrue(eachCheckBox.isSelected());
        }
    }


    @When("the user checks a specific vehicle checkbox")
    public void the_user_checks_a_specific_vehicle_checkbox() {
        List<WebElement> checkboxes = vehiclePage.checkBoxes;

        Random random = new Random();
        int randomIndex = random.nextInt(checkboxes.size());
        selectedCheckbox = checkboxes.get(randomIndex);

        if (!selectedCheckbox.isSelected()) {
            try {
                selectedCheckbox.click();
            } catch (Exception e) {
                // if normal click fails
                ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", selectedCheckbox);
            }

        }
    }

    @Then("only that vehicle checkbox should be checked")
    public void only_that_vehicle_checkbox_should_be_checked() {

        List<WebElement> checkboxes = vehiclePage.checkBoxes;

        for (WebElement eachCheckBox : checkboxes) {
            if (eachCheckBox.equals(selectedCheckbox)) {
                Assert.assertTrue(eachCheckBox.isSelected());
            } else {
                Assert.assertFalse(eachCheckBox.isSelected());
            }
        }
    }

    @Then("other unchecked checkboxes should remain unchanged")
    public void other_unchecked_checkboxes_should_remain_unchanged() {

        List<WebElement> checkboxes = vehiclePage.checkBoxes;

        for (WebElement eachCheckBox : checkboxes) {
            if (!eachCheckBox.equals(selectedCheckbox)) {
                Assert.assertFalse(eachCheckBox.isSelected());
            }
        }

    }
}
