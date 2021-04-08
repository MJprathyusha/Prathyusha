Feature: Lumens website functionality

  Scenario: Check Lumens website
    Given Google browser is open
    And Verify  User is able to Create an account in Lumens application
    When Verify user is able to Login Lumens  application
    And Verify title of the Lumens application
    Then Verify user is able to select Ceiling Lights from lightning Tab
    And Verify  user is able to select  the specific product by applying  filter
    Then Verify  user is able to add the selected product to the cart
    And Verify  user is able to view  the added product in the cart
    Then Verify user is able to search the product
    And Verify user is able to login Live chat by entering valid credentials
    Then Verify user is not  able login View chat by entering invalid credentials
    And Verify the product able to remove from cart
    Then Verify user able to apply coupon code
    And Verify scroll up, scroll down action
    Then Verify the home page
    And Verify ZIP code
    Then Verify Quantity
    And Verify Logout page
