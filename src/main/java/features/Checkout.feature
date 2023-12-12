Feature: Proceed to Checkout 

Scenario: Checkout Test Scenario
Given user is in home page to checkout
And user adds an item to the cart to checkout
And user navigate to cart to checkout
And user navigates to checkout page
And user complete the informations
And user clicks on continue
And user clicks in finish 
Then order should be completed  

