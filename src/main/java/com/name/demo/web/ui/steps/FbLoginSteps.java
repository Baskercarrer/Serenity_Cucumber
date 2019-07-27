package com.name.demo.web.ui.steps;

import com.name.demo.web.ui.pages.FBLandingPage;
import net.thucydides.core.annotations.Step;

public class FbLoginSteps {

    private FBLandingPage fbLandingPage;

    @Step
    public void openFbLandingPage() {
        fbLandingPage.openApplication();
    }

    @Step
    public void setUsernameAndPassword(String username, String password) {
            fbLandingPage.enterUserName(username);
            fbLandingPage.enterPassword(password);
    }
    @Step
    public void login() {
        fbLandingPage.login();
    }

}
