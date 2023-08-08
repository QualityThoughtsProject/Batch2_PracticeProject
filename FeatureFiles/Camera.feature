Feature: camera option

  Background: i launch the brosewar
    Given i launch the application

  @TestCase1
  Scenario: Verfy the cameras option
    When i select the Camera option
    Then i able to see the camera page

  @TestCase2
  Scenario: Verfy the Canon EOS 5D option
    When i select the Camera option
    And i select the canon option
    Then i able to see the canon page option

  @TestCase3
  Scenario: Verfy the Nikon D300 option
    When i select the Camera option
    And i select the Nikon option
    Then i able to see the Nikon page option

  @TestCase4
  Scenario: Verfy the Ceamera product compare option
    When i select the Camera option
    And i select the compare option
    Then i able to see the compare option page

  @TestCase5
  Scenario: Verfy the Reviews option
    When i select the Camera option
    And i select the Nikon and Reviews option
    Then i able to see the Reviews page option

  @TestCase6
  Scenario: Verfy the Reviews Wrote a EnterData Rating continue option
    When i select the Camera option
    And i select the Nikon option
    And i select the Reviews  and enter a data and also select the continue button option
    Then i able to updated the data

  @TestCase7
  Scenario: Verfy the Add to Cart option
    When i select the Camera option
    And i select the Nikon  and Add to cart button option
    Then i able to se the update the add to cart option

  @TestCase8
  Scenario: Verfy the Get Quotes option
    When i select the Camera option
    And i select the block dropdown and view cart and Get Quotes option
    Then i able to update the Get Quotes buttonss

  @TestCase9
  Scenario: Verfy the Apply Coupon option
    When i select the Camera option
    And i select the block dropdown view cart and Coupon option
    Then i able to update the Coupon button

  @TestCase10
  Scenario: Verfy the Apply Gift Certificate option
    When i select the Camera option
    And i select the block dropdown and view cart Gift Certificate option
    Then i able to update the Gift Certificate button

  @TestCase11
  Scenario: Verfy the Checkout option
    When i select the Camera option
    And i select the block dropdown and select Checkout option
    Then i able to see the checkout option page

  @TestCase12
  Scenario: Verfy the list option
    When i select the camera option
    And i select the list button
    Then i able to see the list option page

  @TestCase13
  Scenario: Verfy the next Right arrpw key option
    When i select the camera option
    And i select the Nikon and thumbnail and Next Right arrow key option
    Then i able to see on Next Right arrow key option

  @TestCase14
  Scenario: Verfy the previous Left arrow key option
    When i select the camera option
    And i select the Nikon and thumbnail and Previous Left arrow key option
    Then i able to see on Previous Left arrow key option

  @TestCase15
  Scenario Outline: Verfy the Sorting option
    When i sort with "<Sort Option>" frome Sorting button
    Then i is able to Sort the prodect

    Examples: 
      | Sort Option        |
      | Name (A - Z)       |
      | Name (Z - A)       |
      | Price (Low > High) |
      | Price (High > Low) |
      | Rating (Highest)   |
      | Model (A - Z)      |
      | Model (Z - A)      |

  @TestCase16
  Scenario Outline: Verfy the show option
    When i select the camera option frome sort with "<Show Option>"
     Then i able to sort the prodect

    Examples: 
      | Show |
      |   10 |
      |   25 |
      |   50 |
      |   75 |
      |  100 |

  @TestCase17
  Scenario: Verfy the image option
    When i select the camera option
    And i select the image option
    Then i able to see on image option

  @TestCase18
  Scenario: Verfy the redio button option
    When i select the camera option
    And i select the block dropdown and checkout and select the redio button option
    Then i able to see the redio button option

  @TestCase19
  Scenario: Verfy the redio logian option
    When i select the camera option
    And i select the block dropdown and checkout and select the logian option
    Then i able to see the logian button option

  @TestCase20
  Scenario: Verfy the chick box option
    When i select the camera option
    And i select the block dropdown and checkout and select the chick box option
    Then i able to see the chick box button option

  @TestCase21
  Scenario: Verfy the Checkout Continue button Option
    When i select the camera option
    And i select the block dropdown and checkout and enter the requrement data option
    And i select the Checkout Continue button Option
    Then i able to uploded the Checkout Continue button Option
