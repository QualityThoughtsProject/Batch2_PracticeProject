Feature: OpenCart project

  Background: DeskTops Options
    Given User Launch The Application

  @Testcase1
  Scenario: Verify User is able to see the Desktops Option on  OpenCart Page
    When User Identify the Desktops Option
    Then User is Able to See the Desktops Option

  @Testcase2
  Scenario: Verify User is able to select the PC Option on Desktops Page
    When User Select the Desktops Option
    And User select the PC Option
    Then User is able to see the PC Page

  @Testcase3
  Scenario: Verify User is able to select the MAC Option on DesktopsPage
    When User Select the Desktops Option
    And User select the MAC Option
    Then User is able to see the MAC Page

  @Testcase4
  Scenario: Verify User is able to select  the iMac Option on Desktops Page
    When User Select the Desktops Option
    And User select  iMac from MAC Option
    Then User is able to see the iMac Page

  @testcase5
  Scenario: Verify User is able to select  the Show All Desktops Option on Desktop Page
    When User select the Show All Desktops from Desktops Option
    Then User is able to see the Desktops Page

  @testcase6
  Scenario: Verify User is able to select the List Option on Desktops Page
    When User select on the List Option from Show All Desktop Option
    Then Products should be displayed in LIST format

  @testcase7
  Scenario: Verify User is able to select the Grid Option on Desktops Page
    When User Select the Show All Desktops from Desktops Option
    And select on the Grid Option
    Then Products should be displayed in Grid Format

  @testcase8
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

  @testcase9
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

  @testcase10
  Scenario: Verify User is able to select Apple Cinema 30&quot Option on Desktops Page
    When  select  Apple Cinema 30&quot Button from Show All Desktops Option
    Then User is able to see the Apple Cinema 30&quot Page

  @testcase11
  Scenario: Verify User is able to select Canon EOS 5D Option on Desktop Page
    When User select  the Canon EOS 5D from Show All Desktops Option
    Then User is able to see the Canon EOS 5D Page

  @testcase12
  Scenario: Verify User is able to Select the HP LP3065 Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select HP LP3065 Option
    Then User is able to see the HP LP3065 Page

  @testcase13
  Scenario: Verify User is able to Select the HTC Touch HD Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select HTC Touch HD Option
    Then User is able to see the HTC Touch HD Page

  @testcase14
  Scenario: Verify User is able to select iPhone Option on Desktops Page
    When User select the Show All Desktops from Desktops Option
    And select  iPhone Option
    Then User is able to see the iPhone Page

  @testcase15
  Scenario: Verify User is able to select iPod Classic Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the iPod Classic Option
    Then User is able to see the iPod Classic Page

  @testcase16
  Scenario: Verify User is able to select the MacBook Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the MacBook Option
    Then User is able to see the MacBook Page

  @testcase17
  Scenario: Verify User is able to select the MacBook Air Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the MacBook Air Option
    Then User is able to see the MacBook Air Page

  @testcase18
  Scenario: Verify User is able to select the Palm Treo Pro Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Palm Treo Pro Air Option
    Then User is able to see the Palm Treo Pro Page

  @testcase19
  Scenario: Verify User is able to select the  Product 8 Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Product 8 Option
    Then User is able to see the Product 8 Page

  @testcase20
  Scenario: Verify User is able to select the Samsung SyncMaster 941BW Option on Desktop Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Samsung SyncMaster 941BW Option
    Then User is able to see the Samsung SyncMaster 941BW Page

  @testcase21
  Scenario: Verify User is able to select  the Sony VAIO Option on Desktop Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Sony VAIO Option
    Then User is able to see the Sony VAIO Page
