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
    When User Select the Show All Desktops from Desktops Option
    And select on the List Option
    Then Products should be displayed in LIST format

  @testcase7
  Scenario: Verify User is able to select the Grid Option on Desktops Page
    When User Select the Show All Desktops from Desktops Option
    And select on the Grid Option
    Then Products should be displayed in Grid Format

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

  Scenario Outline: validating Sorting Feature
    When User search for the desktops products
    And User sort with <Show Option>
    Then User is able to sort the products

    Examples: 
      | Show Option |
      |          10 |
      |          25 |
      |          50 |
      |          75 |
      |         100 |

  @testcase8
  Scenario: Verify User is able to sort with Name (A - Z) Option on Desktops Page
    When User select the Show All Desktops from Desktops Option
    And Select the Name (A - Z)  Option from Sort By
    Then User is able to sort based on Name (A - Z)

  @testcase9
  Scenario: Verify User is able to sort with Name (Z - A) Option on Desktops Page
    When User select the Show All Desktops from Desktops Option
    And select the Name (Z - A) Option from the sort By
    Then User is able to sort based on Name (Z - A)

  @testcase10
  Scenario: Verify User is able to sort with Price (Low > High) Option on the Desktops Page
    When User select the Show All Desktops from Desktops Option
    And Select the Price (Low > High) Option from the Sort By
    Then User is able to sort based on Price (Low > High)

  @testcase11
  Scenario: Verify  User is able to sort with Price (High > Low) Option on Desktops Page
    When User select the Show All Desktops from Desktops Option
    And Select the Price (High > Low) Option from the Sort By
    Then User is able to sort based on Price (High > Low)

  @testcase12
  Scenario: Verify User is able to sort with Rating (Highest) Option on Desktops Page
    When User select the Show All Desktops from Desktops Option
    And Select the Rating (Highest) Option from the sort By
    Then User is able to sort based on Rating (Highest)

  @testcase13
  Scenario: Verify User is able to sort with Rating (Lowest) Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And Select the Rating (Lowest) Option from the Sort By
    Then User is able to sort based on Rating (Lowest)

  @testcase14
  Scenario: Verify User is able to sort with Model (A - Z) Option on Desktops Page
    When User select the Show All Desktops from Desktops Option
    And Select the Model (A - Z) Option from the sort By
    Then User is able to sort based on Model (A - Z)

  @testcase15
  Scenario: Verify  User is able to sort with Model (Z - A) Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And Select the Model (Z - A) Option from Sort By
    Then User is able to Sort based on Model (Z - A)

  @testcase16
  Scenario: Verify User is able to get items details based on the search
    When User select the Show All Desktops from Desktops Option
    And select 10 from the Show dropdown
    Then User is able to see 10 products

  @testcase17
  Scenario: Verify User is able to get items details based on the search
    When User select  the Show All Desktops from Desktops Option
    And Select 25 from the Show Dropdown
    Then User is able to see 25 products

  @testcase18
  Scenario: Verify User is able to get items details based on the search
    When User select  the Show All Desktops from Desktops Option
    And Select 50 from the show Dropdown
    Then User is able to see 50 products

  @testcase19
  Scenario: Verify User is able to get items details based on the search
    When User select the Show All Desktops from Desktops Option
    And Select 75 from the show dropdown
    Then User is able to see 75 products

  @testcase21
  Scenario: Verify User is able to get the item details based on the search
    When User select the Show All Desktops from Desktops Option
    And Select 100 from the Show Dropdown
    Then User is able to see 100 products

  @testcase22
  Scenario: Verify User is able to select Apple Cinema 30&quot Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select  Apple Cinema 30&quot Button
    Then User is able to see the Apple Cinema 30&quot Page

  @testcase23
  Scenario: Verify User is able to select Canon EOS 5D Option on Desktop Page
    When User select  the Show All Desktops from Desktops Option
    And select Canon EOS 5D Option
    Then User is able to see the Canon EOS 5D Page

  @testcase24
  Scenario: Verify User is able to Select the HP LP3065 Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select HP LP3065 Option
    Then User is able to see the HP LP3065 Page

  @testcase25
  Scenario: Verify User is able to Select the HTC Touch HD Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select HTC Touch HD Option
    Then User is able to see the HTC Touch HD Page

  @testcase26
  Scenario: Verify User is able to select iPhone Option on Desktops Page
    When User select the Show All Desktops from Desktops Option
    And select  iPhone Option
    Then User is able to see the iPhone Page

  @testcase27
  Scenario: Verify User is able to select iPod Classic Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the iPod Classic Option
    Then User is able to see the iPod Classic Page

  @testcase28
  Scenario: Verify User is able to select the MacBook Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the MacBook Option
    Then User is able to see the MacBook Page

  @testcase29
  Scenario: Verify User is able to select the MacBook Air Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the MacBook Air Option
    Then User is able to see the MacBook Air Page

  @testcase30
  Scenario: Verify User is able to select the Palm Treo Pro Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Palm Treo Pro Air Option
    Then User is able to see the Palm Treo Pro Page

  @testcase31
  Scenario: Verify User is able to select the  Product 8 Option on Desktops Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Product 8 Option
    Then User is able to see the Product 8 Page

  @testcase32
  Scenario: Verify User is able to select the Samsung SyncMaster 941BW Option on Desktop Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Samsung SyncMaster 941BW Option
    Then User is able to see the Samsung SyncMaster 941BW Page

  @testcase33
  Scenario: Verify User is able to select  the Sony VAIO Option on Desktop Page
    When User select  the Show All Desktops from Desktops Option
    And select on the Sony VAIO Option
    Then User is able to see the Sony VAIO Page
