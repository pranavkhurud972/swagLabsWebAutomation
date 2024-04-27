Feature: Automated Testing for Scenario

  Scenario: Validate end-to-end flow
    Given I am on the Sauce Demo login page
    When I log in with username "standard_user" and password "secret_sauce"
    And I click on the Open Menu button
    And I select 'About'
    Then I should be redirected to the Sauce Labs website
    When I navigate back
    Then I should be on the saucedemo PRODUCTS page
    When I select the highest priced item
    And I click on the Cart button
    Then I should be on the YOUR CART page
    When I proceed to checkout
    Then I should be on the CHECKOUT: YOUR INFORMATION page
    When I enter my details and click continue
    Then I should be on the CHECKOUT: OVERVIEW & Total Price is shown in $xx.yy format
