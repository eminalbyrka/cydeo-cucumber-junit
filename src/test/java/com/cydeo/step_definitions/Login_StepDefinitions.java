package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_StepDefinitions {

    @When("user enters librarian username")
    public void user_enters_librarian_username() {




    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
        //TODO:fix this later
    }
    //aşağıda when, then, and bunları check etmiyor.yanındaki metin uyuşuyor mu onu check ediyor.o yüzden mesela then
    // tekrar edilmiyor. ya da when, then gibi isimler değişince sorun olmuyor.ancak text birebir aynı olmalı.
    //my annotation is not the important part here.(@when, @then)
    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("user is on the library login page");

    }


}
