package com.name.demo.web.steps.api;

import com.name.demo.web.api.DemoApi;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FbLandingApi {

    @Steps
    private DemoApi demoApi;

    @Given("fb landing page")
    public void loginPage() {
        demoApi.loginPage();
    }

    @When(value = "user enters (.*) and (.*)")
    public void setUsernameAndPassword(String username, String password) {
       demoApi.setUsernameAndPassword(username, password);
    }

    @Then(value = "home page displayed")
    public void verifyHomePageDisplayed() {
        demoApi.verifyHomePageDisplayed();
    }


}
