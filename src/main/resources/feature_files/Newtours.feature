@Newtours
Feature:
  Background:
    Given I am on the Newtours website
    Then I Verify that home page is visible

  Scenario Outline: Register by entring only User Information
#Given I am on the Newtours website
#Then I Verify that home page is visible
    When I click on the Register link
    Then I Verify that "Register" page is visible
    And I populate all the the mandatory field "<FirstName>","<LastName>","<Email>","<TelephoneNumb>","<Address>","<City>","<State>","<PostCode>"
    And I select "<CountryName>"
    And I enter "<UserName>", password and confirm as "<Password>"
    And I click submit button
    Then confirmation page is displayed with my "<UserName>"
    Examples:
      | UserName | Password | CountryName | FirstName | LastName | Email            | TelephoneNumb |Address   | City     | State | PostCode    |
      | odex77     | Yahoo77     | IRELAND | Sheyi    | Odele    |odexsol77@gmail.com| 0899736888 |60 brega    | Balbriggan | Dublin | K32FK1   |
      | odex78     | Yahoo78     | IRELAND | Sheyi    | Odele    |odexsol78@gmail.com| 0899736888 |60 brega    | Balbriggan | Dublin | K32FK1   |
      | odex79     | Yahoo79     | IRELAND | Sheyi    | Odele    |odexsol79@gmail.com| 0899736888 |60 brega    | Balbriggan | Dublin | K32FK1   |
      | odex80     | Yahoo80     | IRELAND | Sheyi    | Odele    |odexsol80@gmail.com| 0899736888 |60 brega    | Balbriggan | Dublin | K32FK1   |


  Scenario: 2 Flight finder Page
#    Given I am on the Newtours website
#    Then I Verify that home page is visible
    When I click on the Flights link on the left side menu
    Then The Flight Finder Page should be displayed
    And "RoundTrip" Flight details type is selected by default
    And "July 12" should be displayed by default for On and returning
    And "Economy Class" should be selected as default for the Service class