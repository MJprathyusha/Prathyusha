#Author
#Date
#Descrition


Feature: feature for login functionality

  Scenario: Login test scenario
    Given User is already on loginpgae
    When title of login page is displayed
    And user enters "<username>" and "<password>"
    Then user clicks on login button
    And user is in home page
    Then close the browser
Examples:
|UserName                |Password    |
|955076115                |NewNew    |
|unkonow@gmail.com    |New   |