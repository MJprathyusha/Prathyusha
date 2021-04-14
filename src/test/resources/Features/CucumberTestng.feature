Feature: Lumens website functionality

  @Overall
  Scenario: Check Lumens website
    Given Google browser is openC
    When Verify user is able to Login Lumens  applicationC
    And Verify title of the Lumens applicationC
    Then Verify user is able to select Ceiling Lights from lightning TabC
    And Verify  user is able to select  the specific product by applying  filterC
   

  @Skip
  Scenario: Check Lumens website
    Given Verify  user is able to add the selected product to the cartC
    Then Verify  user is able to add the selected product to the cartC
    And Verify  user is able to view  the added product in the cartC
    Then Verify user is able to search the productC
    And Verify user is able to login Live chat by entering valid credentialsC
    Then Verify user is not  able login View chat by entering invalid credentialsC
    And Verify the product able to remove from cartC
    Then Verify user able to apply coupon codeC
    And Verify scroll up, scroll down actionC
    Then Verify the home pageC
    And Verify ZIP codeC
    Then Verify QuantityC
    And Verify Logout pageC
