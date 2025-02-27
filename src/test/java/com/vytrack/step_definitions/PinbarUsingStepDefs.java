package com.vytrack.step_definitions;

import com.vytrack.pages.PinbarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PinbarUsingStepDefs {

    PinbarPage pinbarPage = new PinbarPage();


    @When("user click on the Learn how to use this space link")
    public void user_click_on_the_learn_how_to_use_this_space_link() {
        pinbarPage.waitUntilLoaderScreenDisappear();
        pinbarPage.pinbarLink.click();
        pinbarPage.waitUntilLoaderScreenDisappear();
    }

    @Then("user should see {string} text")
    public void user_should_see_text(String expectedText) {

        Assert.assertEquals("ERROR, text doesnt match",expectedText,pinbarPage.text.getText());

    }

    @Then("user should see {string} header")
    public void user_should_see_header(String expectedText) {


        Assert.assertEquals(expectedText, pinbarPage.header.getText());

    }


    @Then("user should see the image with source: {string}")
    public void user_should_see_the_image_with_source(String expectedSource) {

        Assert.assertEquals(expectedSource,pinbarPage.image.getDomAttribute("src"));


    }


}
