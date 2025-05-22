package com.vytrack.step_definitions;

import com.vytrack.pages.VehiclesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VehicleModelStepDefs {
    VehiclesPage vehicleModel = new VehiclesPage();

    @When("the user is on the Vehicle Model page")
    public void the_user_is_on_the_vehicle_model_page() {

        vehicleModel.waitUntilLoaderScreenDisappear();
        vehicleModel.navigateToModule("Fleet", "Vehicle Model");
    }

    @Then("user should see {int} Column names")
    public void user_should_see_column_names(Integer numOfColumns, List<String> expectedColumnName) {

        List<String> actualTableModelColumns = new ArrayList<>();

        for (WebElement eachColumn : vehicleModel.tableColumns) {
            if (!eachColumn.getText().isEmpty()) {
                actualTableModelColumns.add(eachColumn.getText());
            }}
        Assert.assertEquals( expectedColumnName, actualTableModelColumns);
    }




}
