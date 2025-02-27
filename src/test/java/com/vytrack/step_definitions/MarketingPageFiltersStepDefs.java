package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.MarketingPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class MarketingPageFiltersStepDefs {

    MarketingPage marketingPage = new MarketingPage();
//    WebElement selectedCheckbox;
//
//    @When("the user navigates to the Campaigns page")
//    public void theUserNavigatesToTheCampaignsPage() {
//
//        marketingPage.waitUntilLoaderScreenDisappear();
//        marketingPage.navigateToModule("Marketing", "Campaigns");
//
//    }
//
//    @Then("the user should see all filter options checked by default under {string} dropdown.")
//    public void the_user_should_see_all_filter_options_checked_by_default_under_dropdown(String expectedText) {
//
//        marketingPage.filterButton.click(); //click if button is not clicked yet, otherwise
//        // it will close Manage Filters option
//
//        Assert.assertEquals(expectedText, marketingPage.manageFilters.getText());
//        marketingPage.dropdownButton.click();
//        //marketingPage.multiselectCheckbox.isSelected();
//        for (WebElement eachCheckbox : marketingPage.multiselectCheckbox) {
//            Assert.assertTrue(eachCheckbox.isSelected());
//
//        }
//    }
//
//    @When("the user checks multiple checkbox")
//    public void the_user_checks_multiple_checkbox() {
//        marketingPage.filterButton.click();
//        marketingPage.dropdownButton.click();
//        List<WebElement> checkboxes = marketingPage.multiselectCheckbox;
//        // Randomly select a checkbox and unselect others
//       Random random = new Random();
//        int randomIndex = random.nextInt(marketingPage.multiselectCheckbox.size());
//        selectedCheckbox = checkboxes.get(randomIndex);
//       // marketingPage.waitUntilLoaderScreenDisappear();
//
//        for (int i = 0; i < marketingPage.multiselectCheckbox.size(); i++) {
//            if (i == randomIndex) {
//                if (!marketingPage.multiselectCheckbox.get(i).isSelected()) {
//                    BrowserUtils.sleep(1);
//                    marketingPage.waitUntilLoaderScreenDisappear();
//                    marketingPage.multiselectCheckbox.get(i).click(); // Select one checkbox
//                }
//            } else {
//                if (marketingPage.multiselectCheckbox.get(i).isSelected()) {
//                    BrowserUtils.sleep(1);
//                    marketingPage.waitUntilLoaderScreenDisappear();
//                    marketingPage.multiselectCheckbox.get(i).click(); // Unselect others
//                }
//            }
//        }
//    }
//
//
//    @Then("other checkboxes should remain unchanged")
//    public void other_unchecked_checkboxes_should_remain_unchanged() {
//
////        List<WebElement> checkboxes = marketingPage.multiselectCheckbox;
////
////        for (WebElement eachCheckBox : checkboxes) {
////            if (!eachCheckBox.equals(selectedCheckbox)) {
////                Assert.assertFalse(eachCheckBox.isSelected());
////            }
////        }
//    }

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
            BrowserUtils.sleep(3);
            //ul[@class='ui-multiselect-checkboxes ui-helper-reset fixed-li']/li//input[1]
            WebElement filterCheckBoxes = Driver.getDriver().findElement(By.xpath(element));
            Assert.assertTrue(filterCheckBoxes.isSelected());
            BrowserUtils.sleep(3);
        }

    }
    @Then("user is able to uncheck any amount of boxes")
    public void user_is_able_to_uncheck_any_amount_of_boxes() {
        marketingPage.filterOptionsCanBeUnselected();

    }


}




