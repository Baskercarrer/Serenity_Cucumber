package com.name.demo.web.api;

import org.assertj.core.api.Assertions;

public class DemoApi {

    public void loginPage() {
        System.out.println("Loading the Fb landing page");
    }

    public void setUsernameAndPassword(String username, String password) {
        System.out.println("User entering the username " + username);
        System.out.println("User entering the password " + password);
    }

    public void verifyHomePageDisplayed() {
        Assertions.assertThat("Fb home page has been displayed").contains("has been");

    }
}
