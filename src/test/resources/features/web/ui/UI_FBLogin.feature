@regression
    
Feature: UI - Verify the Fb login functionality
  In order to verify Fb login page
  As a user
  I want to be to check login page is working

Scenario: validate the login page is able to access with valid credentials
Given the fb landing page
When the user enters banker and test1233
  And click login button
  Then the home page displayed

  @manual
  @manual-result:failed
  Scenario: Negative - validate the login page is able to access with invalid credentials
    Given the fb landing page
    When the user enters xxxx and xxxx
    Then the home page displayed

  @manual
  @manual-result:passed
  Scenario: Positive - validate the login page is able to access with invalid credentials
    Given the fb landing page
    When the user enters baskercarrer and temp1234
    Then the home page displayed

