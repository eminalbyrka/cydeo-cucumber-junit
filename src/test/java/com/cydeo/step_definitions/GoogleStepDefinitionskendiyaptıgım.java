package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinitionskendiyaptıgım {
    @When("user is on google search page.")
    public void user_is_on_google_search_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();// bu iki satırı çalıştırıp hata aldı ve alt satırı yazdı.
        //System.out.println("user is on google search page.");//sonra bunu da sildi. alttakini yaptı.
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google.")
    public void user_should_see_title_is_google() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user should see title is Google.");
        String expectedTitle="Google";
        String actualtitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualtitle,expectedTitle);

        Driver.closeDriver();
    }

}
