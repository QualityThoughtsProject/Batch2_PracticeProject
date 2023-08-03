Feature: Opencart Laptops&Notebooks page

  @Testcase11
  Scenario: Verify the LaptopsNotebooks Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    Then Shows All LaptopsNotebooks products

  @Testcase12
  Scenario: Verify the all LaptopsNotebooks  Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    Then Shows All LaptopsNotebooks products

  @Testcase13
  Scenario: Verify the mac Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the mac option
    Then Shows All mac products

  @Testcase14
  Scenario: Verify the mac Items Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the mac option
    And click on the continue button
    Then User return the main application

  @Testcase15
  Scenario: Verify the windows Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the windows Option
    Then Shows All windows products

  @Testcase16
  Scenario: Verify the WindowsItems Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the windows Option
    And Shows All windows products
    And click on the continue button
    Then User return the main application

  @Testcase17
  Scenario: Verify the Product compare Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    Then Users elect the product compare option
    Then Shows All Product Compare options

  @Testcase18
  Scenario: Verify the list Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the list option
    Then Shows All list products

  @Testcase19
  Scenario: Verify the Grid Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the Grid Option
    Then Shows All LaptopsNotebooks products

  @Testcase20
  Scenario: Verify the Sort by Option From Dropdown
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the sort by option
    Then Shows name(a-z) options

  @Testcase21
  Scenario: Verify the Show Option from dropdown
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the Show value of 10
    Then Shows 10 varities show options

  @Testcase22
  Scenario: Verify the HP LP3065 Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the HP LP3065 Option
    Then Shows All Details of HP LP3065 options

  @Testcase23
  Scenario: Verify the Add to cart Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the Add to cart option
    Then product will be moved into the Add to cart page

  @Testcase24
  Scenario: Verify the Add to whishlist Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the Add to whishlist option
    Then product will be moved into the Add to whishlist page

  @Testcase25
  Scenario: Verify the Description Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the HP LP3065 Option
    And Shows All Details of HP LP3065 options
    Then User select the Description option

  @Testcase26
  Scenario: Verify the Specifications Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    When User select the HP LP3065 Option
    And Shows All Details of HP LP3065 options
    Then User select the Specifications option

  @Testcase27
  Scenario: Verify the Reviews Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the HP LP3065 Option
    And Shows All Details of HP LP3065 options
    Then User select the Reviews option

  @Testcase28
  Scenario: Verify the Delivery date Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the HP LP3065 Option
    And Shows All Details of HP LP3065 options
    Then User select the Delivery date option

  @Testcase29
  Scenario: Verify the MacBook Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the macBook Option
    Then Shows All Details of MacBook options

  @Testcase30
  Scenario: Verify the TopView in MacBook Option
    Given User launch the application
    When User Select the LaptopsNotebooks Option
    When User select the show all the Laptops&Notebooks option
    And User select the macBook Option
    Then Users sleect the TopView of MacBook option
