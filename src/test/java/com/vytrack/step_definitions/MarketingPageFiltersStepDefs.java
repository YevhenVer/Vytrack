package com.vytrack.step_definitions;

import com.vytrack.pages.MarketingPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MarketingPageFiltersStepDefs {

    MarketingPage marketingPage = new MarketingPage();
    @When("the user navigate to {string} and to {string} page")
    public void the_user_navigate_to_and_to_page(String tab, String module) {
        marketingPage.navigateToModule(tab,module);

    }
    @When("user should wait {int} seconds")
    public void user_should_wait_seconds(Integer second) {
        BrowserUtils.sleep(second);

    }
    @When("the user will click the filter message")
    public void the_user_will_click_the_filter_message() {
        marketingPage.filterButton.click();

    }
    @When("the user will click the manage filter")
    public void the_user_will_click_the_manage_filter() {
        marketingPage.manageFilters.click();

    }
    @Then("user can see all checkboxes as checked by default")
    public void user_can_see_all_checkboxes_as_checked_by_default() {
        //Assert.assertTrue(marketingPage.CheckBoxList);
        //for (WebElement each : marketingPage.CheckBoxList) {
        // Assert.assertTrue("Checkbox is not selected by default: " + each.getText(),each.isSelected());
        for (int i = 1; i <= 5; i++) {
            String element = "(//input[@name='multiselect_0'])[" + i + "]";
            //BrowserUtils.sleep(3);
            //ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li//input[1]
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(filterCheckBoxes.isSelected());
            //BrowserUtils.sleep(3);
        }

    }
    @Then("user is able to uncheck any amount of boxes")
    public void user_is_able_to_uncheck_any_amount_of_boxes() {
        marketingPage.filterOptionsCanBeUnselected();

    }
}
