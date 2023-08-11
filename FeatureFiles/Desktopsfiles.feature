Feature: OpenCart project

  Background: DeskTops Options
    Given User Launch The Application

  @Testcase1
  Scenario Outline: Verify User is able to see the Desktops Option on  OpenCart Page
    When User Identify the Desktops "<Option>"
    Then User is Able to See the Desktops Option

    Examples: 
      | Option   |
      | PC       |
      | MAC      |
      | Show All |

  @Testcase2
  Scenario: Verify User is able to select  the iMac Option on Desktops Page
    When User Select the iMac from MAC Option
    Then User is able to see the iMac Page

  @Testcase3
  Scenario Outline: validating Sorting Feature
    When User search for the desktops products
    And User sort with "<Sort Option>"
    Then User is able to sort the products

    Examples: 
      | Sort Option        |
      | Name (A - Z)       |
      | Name (Z - A)       |
      | Price (Low > High) |
      | Price (High > Low) |
      | Rating (Highest)   |
      | Rating (Lowest)    |
      | Model (A - Z)      |
      | Model (Z - A)      |

  @Testcase4
  Scenario Outline: validating Sorting Feature
    When User search for the desktops products
    And User sort with "<Show Option>"
    Then User is able to sort the products

    Examples: 
      | Show Option |
      |          10 |
      |          25 |
      |          50 |
      |          75 |
      |         100 |

  @TestCase5
  Scenario Outline: Validating the Product List Features
    When User Select the Desktop Options
    And User select the "<ProductList>"
    Then User is able select the Product List

    Examples: 
      | ProductList              |
      | Apple Cinema 30"         |
      | Canon EOS 5D             |
      | HP LP3065                |
      | HTC Touch HD             |
      | iPhone                   |
      | iPod Classic             |
      | MacBook                  |
      | MacBook Air              |
      | Palm Treo Pro            |
      | Product 8                |
      | Samsung SyncMaster 941BW |
      | Sony VAIO                |
