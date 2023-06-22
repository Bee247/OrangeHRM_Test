@ignore
Feature: Invalid Login

  Scenario Outline: Login with invalid credentials

    Given I am on the homepage
    When I enter "<username>" in the username field
    And I enter "<password>" in the password field
    When I click the login button
    Then I should get the correct errorMessage

    Examples:
        |username   |password    |errorMessage       |
        |Johnson    |admin123    |Invalid credentials|
        |Admin      |wrong123    |Invalid credentials|
        |Mathew     |admin342    |Invalid credentials|

