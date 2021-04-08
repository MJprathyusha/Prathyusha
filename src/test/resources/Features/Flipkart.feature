Feature: Test Login functionality

  Scenario: Check login is ssuccusful
    Given google browser is open
    And user is on flipkart loginpage
    When user is enters username  password
    And user clicks on login
    Then user is navigated to home page
    And user able to search products