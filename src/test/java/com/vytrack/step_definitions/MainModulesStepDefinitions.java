package com.vytrack.step_definitions;


import com.vytrack.pages.MainModulesPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainModulesStepDefinitions{

    MainModulesPage mainModulesPage = new MainModulesPage();

    @And("user should be able to see all {int} main modules")
    public void user_should_be_able_to_see_all_main_modules(Integer expectedModules) {

        mainModulesPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals((int)expectedModules, mainModulesPage.allModules.size());
        mainModulesPage.waitUntilLoaderScreenDisappear();
    }


    @Then("user should be able to access the following modules in the main menu")
    public void user_should_be_able_to_access_the_following_modules_in_the_main_menu(List<String> expectedModules) {

        List<String> actualModules = BrowserUtils.getElementsText(mainModulesPage.allModules);
        Assert.assertEquals(expectedModules,actualModules);


    }



    @And("user can see all {int} modules")
    public void userCanSeeAllModules(int expectedModules) {

        mainModulesPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(expectedModules, mainModulesPage.allModules.size());
        mainModulesPage.waitUntilLoaderScreenDisappear();
    }


    @Then("user can access the following modules")
    public void userCanAccessTheFollowingModules(List<String> expectedModules) {

        List<String> actualModules = BrowserUtils.getElementsText(mainModulesPage.allModules);
        Assert.assertEquals(expectedModules, actualModules);
    }
}



