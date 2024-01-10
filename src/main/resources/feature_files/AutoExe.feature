@AutoExe

Feature:

  Background:
    Given I am on autoexercise home page
    Then I Verify that home page is visible successfully
    And Click on 'Signup / Login' button
    Then I Verify 'New User Signup!' is visible

  Scenario Outline: Test Case 1: Register User
#      Given I am on autoexercise home page
#      Then I Verify that home page is visible successfully
#      And Click on 'Signup / Login' button
#      Then I Verify 'New User Signup!' is visible
    And  I Enter "<name>" and "<email address>"
    And  Click 'Signup' button
    Then I Verify that 'ENTER ACCOUNT INFORMATION' is visible
    When Fill details: Title, "<Password>" and "<Date of birth>"
#      And Select checkbox 'Sign up for our newsletter!'
#      And Select checkbox 'Receive special offers from our partners!'
    And Fill details: "<First name>", "<Last name>", "<Company>", "<Address>", "<Country>", "<State>", "<City>", "<Zipcode>", "<Mobile Number>"
    And Click 'Create Account button'
    Then Verify that 'ACCOUNT CREATED!' is visible
    And Click Continue button
    Then Verify that 'Logged in as username' is visible

    Examples:
      | name | email address        | Password |Date of birth| First name | Last name | Company    | Address  | Country | State  | City       | Zipcode | Mobile Number |
      | solo | odexsolo77@gmail.com | Yahoo77  |15/02/1990 |solomon    | odele     | eledavibes | 60 brega | Canada  | Dublin | Balbriggan | k32     | 0899736888    |



#  @AutoExe
#  Scenario Outline: Test Case 2: Login User with correct email and password
#    Given I am on auto-exercise home page
#    Then I Verify that home page is visible successfully
#    And Click on 'Signup / Login' button
#    Then I Verify 'Login to your account' is visible
#    And I Enter correct "<email address>" and "<password>"
#    And I Click login button
#    Examples:
#      | email address         | password |
#      | odexsolo007@gmail.com | Yahoo777 |


#  Scenario Outline: Test Case 3: Login User with incorrect email and password
#    Given I am on autoexercise home page
#    Then I Verify that home page is visible successfully
#    And Click on 'Signup / Login' button
#    Then I Verify 'Login to your account' is visible
#    When Enter incorrect "<email address>" and "<password>"
#    And I Click login button
#    Then Verify error 'Your email or password is incorrect!' is visible
#    Examples:
#      | email address | password |
#      | odexsol77@gmail.com |Yahoo70 |



#  Scenario Outline: TEST CASES 6:
#    Given I am on autoexercise home page
#    Then I Verify that home page is visible successfully
#    And Click on Contact Us button
#    And Verify GET IN TOUCH is visible
#    And Enter "<name>", "<email>", "<subject>" and "<message>"
#    And Click Submit button
#    And Click OK button
#    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
#    And Click Home button
#    Then verify that landed to home page successfully
#    Examples:
#      | name | email                 | subject      | message                             |
#      | solo | odexsolo007@gmail.com | Order Issues | Please unable to place my order with the payment gateway |