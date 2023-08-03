Feature: 

  Background: 
    Given User launch the application

  @Testcases1
  Scenario: Verify the Tablets
    When User select the Tablets option
    Then All tablets products is displayed

  @Testcases2
  Scenario: Verify the Product compare option
    When User select the Tablets option
    And User select the Product compare option
    Then All tablets product compare is displayed

  @Testcases3
  Scenario: Verify the List option
    When User select the Tablets option
    And User select the List option
    Then All List products is displayed

  @Testcases4
  Scenario: Verify the Grid option
    When User select the Tablets option
    And User select the Grid option
    Then All Grid products is displayed

  @Testcases5
  Scenario: Verify the Sort by option
    When User select the Tablets option
    And User select the Sort by option
    Then All Sort by options is displayed

  @Testcases6
  Scenario: Verify the Show option
    When User select the Tablets option
    And User select the Show option
    Then All Show options is displayed

  @Testcases7
  Scenario: Verify the Samsung Galxy Tab 10.1
    When User select the Tablets option
    And User select the Samsung Galxy Tab 10.1
    Then All Samsung Galxy Tab 10.1 products is displayed

  @Testcases8
  Scenario: Verify the Add cart option
    When User select the Tablets option
    And User select the Add cart option
    Then All Add cart products is displayed

  @Testcases9
  Scenario: Verify the Add wish list option
    When User select the Tablets option
    And User select the Add wish list option
    Then All Add wish list products is displayed

  @Testcases10
  Scenario: Verify the Comper this products option
    When User select the Tablets option
    And User select the Comper this products option
    Then All Comper this products detels is displayed
