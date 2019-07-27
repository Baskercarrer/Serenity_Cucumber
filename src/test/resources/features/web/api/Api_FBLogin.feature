@regression
    
Feature: API - Verify the Fb login functionality
  In order to verify Fb login page
  As a user
  I want to be to check login page is working

Scenario: validate the login page is able to access with valid credentials
Given fb landing page
When user enters basker and test1233
Then home page displayed