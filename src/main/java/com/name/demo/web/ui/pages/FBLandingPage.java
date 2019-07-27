package com.name.demo.web.ui.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.facebook.com")
public class FBLandingPage extends PageObject {

    @WhenPageOpens
    public void maximizeWindow() {
    getDriver().manage().window().maximize();
    }

    // Selectors
    @FindBy(id = "email", timeoutInSeconds = "5")
    private WebElementFacade username;

    @FindBy(id = "pass", timeoutInSeconds = "5")
    private WebElementFacade password;

    @FindBy(id = "loginbutton", timeoutInSeconds = "5")
    private WebElementFacade button_login;


    public void openApplication() {
        open();
        waitForTheApplicationToLoad();
    }

    private void waitForTheApplicationToLoad() {
        withTimeoutOf(Duration.ofMinutes(1)).waitFor(username);
    }

    public void enterUserName(String userName) {
        username.type(userName);
    }

    public void enterPassword(String password) {
        this.password.type(password);
    }

    public void login() {
        button_login.click();
    }




}
