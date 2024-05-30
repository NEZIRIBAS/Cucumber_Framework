@register
Feature: User Registration

@ValidCredentials
Scenario: Register with valid credentials
Given user navigates to RegisterPage
When user enters valid email "seleniumpanda@gmail.com" into email textbox field
And user enters valid password "Selenium@123" into password textbox field
And user clicks on Register button
Then user should be registered successfully