@addtocart
Feature: Addtocart Functionality

Scenario: Add an item to the shopping cart
Given user on the product page for a cameras
 And user selects the items
 When user clicks the add to cart button
 Then user should see a notification that says cameras added to cart
  
