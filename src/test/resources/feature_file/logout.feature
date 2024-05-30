@logout
Feature:logout Functionality

Scenario: Successful logout from application 
Given user navigates to LoginPage
When user logs out from application 
Then Message displayed logout successfully 
And Browser quit by driver