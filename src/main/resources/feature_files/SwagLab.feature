@SWAG
Feature:
  Scenario: Happy path to purchase an item on SwagLab
    Given I am on the swaglab home page
    Then I Verify that home page is displayed
    When I enter valid username and valid password
    And I click on Login button
    Then verify that Product page is displayed
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I complete all the required fields
    And I clicked on Continue button
    And I click on Finish button
#Then "Thank you for your order!" message is displayed on the order confirmation page


  Scenario: 2. Error msg should displayed if postcode is not populated on the checkout page
    Given I am on the swaglab home page
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I enter details for only firstname and lastname
    And I clicked on Continue button
    Then "Error: Postal Code is required" is displayed under Postcode field


  Scenario: 3. Error msg Should be displayed if Firstname
    Given I am on the swaglab home page
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I enter details for only lastname and postcode
    And I clicked on Continue button
    Then error msg "Error: First Name is required" is displayed under firstname field