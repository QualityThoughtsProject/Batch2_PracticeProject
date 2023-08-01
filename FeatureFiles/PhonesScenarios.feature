Feature: Phone feature files

  Background: User Launch the Application
  Given User Launch the Application 
 
  @Testcases1
  Scenario: Phones & PDAs feature
    When User select the Phones & PDAs feature
    Then Phones Should be displayed
    

  @Testcases2
  Scenario: Phones & PDAs feature
    When User select the Phones & PDAs(Htc) from the menu
    Then HTC Touch HD phone Should be displayed

  @Testcases3
  Scenario: Phones & PDAs feature
    When User select the Phones & PDAs(iphone) from the menu
    Then iphone Should be displayed

  @Testcases4
  Scenario: Phones & PDAs feature
    When User select the Phones & PDAs(plam)  from the menu
    Then Palm Treo Pro Should be displayed

  @Testcases5
  Scenario: Phones & PDAs feature
    When User select the Product Comparison option
    Then Product Compare Should be displayed

  @Testcases6
  Scenario: Phones & PDAs feature
    When User select the List option
    Then Phones Should be displayed in list method

  @Testcases7
  Scenario: Phones & PDAs feature
    When User select the grid option
    Then Phones Should be displayed in grid method

  @Testcases8
  Scenario: Phones & PDAs feature 
    When User select the Add To Cart option for HTC phone
    Then Cart Scucess message Should be displayed

  @Testcases9
  Scenario: Phones & PDAs feature
    When User select the Wishlist option for HTC phone
    Then WishList Scucess message Should be displayed

  @Testcases10
  Scenario: Phones & PDAs feature
    When User select the Exechange Alert option for HTC phone
    Then Exechange Scucess message Should be displayed 

  @Testcases11
  Scenario: Phones & PDAs feature
    When User select the SortBy option
    Then sorting should be happen

  @Testcases12
  Scenario: Phones & PDAs feature
    When User select the Dropdown option
    Then Default value should be displayed

  @Testcases13
  Scenario: Phones & PDAs feature
    When User select the Name(A - Z) value in Dropdown option
    Then Name (A - Z) value should be displayed

  @Testcases14
  Scenario: Phones & PDAs feature
    When User select the Name(Z-A) value in Dropdown option
    Then Name (Z - A) value should be displayed

  @Testcases15
  Scenario: Phones & PDAs feature
    When User select the  Price(Low>High) value in Dropdown option
    Then Price (Low > High) value should be displayed

  @Testcases16
  Scenario: Phones & PDAs feature
    When User select the Price(High>Low) value in Dropdown option
    Then Price (High > Low) value should be displayed

  @Testcases17
  Scenario: Phones & PDAs feature
    When User select the Rating(Highest) value in Dropdown option
    Then Rating (Highest) value should be displayed

  @Testcases18
  Scenario: Phones & PDAs feature
    When User select the Rating(Lowest) value in Dropdown option
    Then Rating (Lowest) value should be displayed

  @Testcases19
  Scenario: Phones & PDAs feature
    When User select the  Model(A - Z) value in Dropdown option
    Then Model (A - Z) value should be displayed

  @Testcases20
  Scenario: Phones & PDAs feature
    When User select the Model(Z - A) value in Dropdown option
    Then Model (Z - A) value should be displayed

  @Testcases21
  Scenario: Phones & PDAs feature 
    When User select the Show option
    Then value should be displayed

  @Testcases22
  Scenario: Phones & PDAs feature
    When User select the value Ten in Dropdown option
    Then Ten should be displayed

  @Testcases23
  Scenario: Phones & PDAs feature
    When User select the value TwentyFive in Dropdown option
    Then TwentyFive should be displayed

  @Testcases24
  Scenario: Phones & PDAs feature
    When User select the value FIfty in Dropdown option
    Then FIfty should be displayed

  @Testcases25
  Scenario: Phones & PDAs feature
    When User select the value Seventyfive in Dropdown option
    Then Seventyfive should be displayed

  @Testcases26
  Scenario: Phones & PDAs feature
    When User select the value Hundred in Dropdown option
    Then Hundred should be displayed
