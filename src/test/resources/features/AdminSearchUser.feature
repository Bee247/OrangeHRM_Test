Feature: Creating a valid login

  Background: Common steps
    Given I am on application page

  Scenario: I want to login with valid credentials

    When I input valid Username to text boxes
    And I input valid Password to text boxes
    When I click on the login button
    Then I should be logged in successfully