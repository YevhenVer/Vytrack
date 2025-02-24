package com.vytrack.step_definitions;

import com.vytrack.pages.VehiclesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VehicleCostsFiltersStepDefs {

    VehiclesPage vehicleCost = new VehiclesPage();


    @Given("the user is on the Vehicle Costs page")
    public void the_user_is_on_the_vehicle_costs_page() {
        vehicleCost.waitUntilLoaderScreenDisappear();
        vehicleCost.navigateToModule("Fleet", "Vehicle Costs");
        vehicleCost.waitUntilLoaderScreenDisappear();
    }

    @Then("the user should see a table with exactly {int} columns named:")
    public void the_user_should_see_a_table_with_exactly_columns_named(Integer numOfColumns, List<String> expectedColumnName) {
// TODO:
        List<String> actualColumnName = new ArrayList<>();

        for (WebElement each : vehicleCost.tableColumns) {
            if (!each.getText().isEmpty()) {
                actualColumnName.add(each.getText());
            }
        }

        System.out.println(actualColumnName);


        Assert.assertEquals(expectedColumnName, actualColumnName);
        Assert.assertEquals((int) numOfColumns, vehicleCost.tableColumns.size());


    }


}