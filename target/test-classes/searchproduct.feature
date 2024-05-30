@searchproduct
Feature: Search Product Functionality

Scenario: Search with valid product
Given user opens the application
When user enters the valid product "HP"
And user clicks on the search button
Then user gets valid product info display in the searchpage
Then user gets warning message



Scenario: Search with invalid product
Given user opens the application
When user enters the valid product "DELL"
And user clicks on the search button
Then user gets valid product info display in the searchpage


Scenario: Search without any product
Given user opens the application
And user clicks on the search button
Then user gets warning message