Feature: Test Login functionality

  Scenario: Check login i ssuccusful
    Given browser is open
    And user is on login page
    When user is enters username and password
    And user clicks on login
    Then user is navigated to home page
    And user able to search flights