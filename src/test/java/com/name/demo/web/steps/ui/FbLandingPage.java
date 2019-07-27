package com.name.demo.web.steps.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.name.demo.web.ui.steps.FbLoginSteps;
import net.thucydides.core.annotations.Steps;

public class FbLandingPage {

    @Steps
   private FbLoginSteps fbLoginSteps;


    @Given("the fb landing page")
    public void loginPage() {
        fbLoginSteps.openFbLandingPage();
    }

    @When(value = "the user enters (.*) and (.*)")
    public void setUsernameAndPassword(String username, String password) {
       fbLoginSteps.setUsernameAndPassword(username, password);
    }

    @Then(value = "the home page displayed")
    public void verifyHomePageDisplayed() {
        System.out.println("Home Page Displayed");
    }
    @When(value="click login button")
    public void clickLogin() {
        fbLoginSteps.login();
    }

}
