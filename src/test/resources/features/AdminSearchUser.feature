Feature: Admin User

  Background:
    Given I am on the application home page
    And I log in

  Scenario: Verify that admin can search user panel by filter
    When I click the Admin menu
    And I should see the user page
    When I enter user data
    And I click on the search button
    Then Search result should return the current user