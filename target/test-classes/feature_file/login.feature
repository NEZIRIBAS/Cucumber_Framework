#Author: Nez Iribas
@TutorialsNinjaLogin
Feature: Login functionality of TutorialsNinja Application

@ValidCredentials
Scenario: Login with valid credentials
Given user navigates to LoginPage
When user enters valid email "seleniumpanda@gmail.com" into email textbox field
And user enters valid password "Selenium@123" into password textbox field
And user clicks on Login button
Then user is navigated to AccountPage 