@AutoExe2

Feature:
  Scenario Outline: TEST CASES 4:
    Given I am on autoexercise home page
    Then I Verify that home page is visible successfully
    And Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And Enter "<name>", "<email>", "<subject>" and "<message>"
    And Click Submit button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click Home button
    Then I Verify that home page is visible successfully
    Examples:
      | name | email                 | subject      | message                             |
      | solo | odexsolo007@gmail.com | Order Issues | Please unable to place my order with the payment gateway |