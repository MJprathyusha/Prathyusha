Feature: Lumens website Testing

  @Signin @titlechecking
  Scenario: Check Lumens_website
    Given Google browser is_open
    When Verify user is able to Login Lumens _application
    And Verify title of the Lumens_application
    
    @Search
   Scenario: Product selection and adding into_cart 
    Given Verify user is able to select Ceiling Lights from lightning_Tab
    When Verify  user is able to select  the specific product by applying_filter
   

  @Skip
  Scenario: Check Lumenss     
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
