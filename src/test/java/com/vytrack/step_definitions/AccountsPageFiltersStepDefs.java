package com.vytrack.step_definitions;

import com.vytrack.pages.AccountsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsPageFiltersStepDefs {

    AccountsPage accountsPage = new AccountsPage();


    @When("the user navigates to the Accounts page")
    public void the_user_navigates_to_the_accounts_page() {

        accountsPage.waitUntilLoaderScreenDisappear();
        accountsPage.navigateToModule("Customers","Accounts");


    }
    @Then("the user should see {int} filter items with following names:")
    public void the_user_should_see_filter_items_with_following_names(Integer expectedCount, List<String> expectedName) {

        accountsPage.filterButton.click();


        List<String> actual = new ArrayList<>();

        for (WebElement each : accountsPage.filterItems) {
            actual.add(each.getDomAttribute("title"));
        }


        Assert.assertEquals(expectedName,actual);
        Assert.assertEquals((int)expectedCount, accountsPage.filterItems.size());


    }


}
