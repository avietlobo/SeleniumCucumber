Feature: Launch FLipkart and click on cart
 
     @smoke
  Scenario: Launch FLipkart and click on cart 1
    Given user is on Home page
    And I click on close popup window
    And I click on shopping cart
    Then shopping cart page should be visible

