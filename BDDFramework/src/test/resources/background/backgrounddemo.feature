Feature: This is background demo


Background: User is logged in to saucedemo app
Given User is accessing saucedemo login page
When User enters valid usernam and password
Then User should be able to navigate to Home Page

Scenario: Test Menu Items
And Click on breadcrum icon
Then User should be able to see the menu items


Scenario: Verify add to cart functionality
And Click on Add to cart button
Then Item should be added to cart