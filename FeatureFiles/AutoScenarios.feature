Feature: Auto feature files

@SampleSecondCase
  Scenario Outline: Issue Auto policy with Two Vehicle and Two Rated Drivers with Twelve months Policy term
  Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue Auto policy with onw PPA and one  Drivers
 Examples:
 |TestCase Number	| Browser Name|
 |AutoTestCase_001| Chrome|
 
 @Parellel@Demo
  Scenario Outline: Issue Auto policy with Two Vehicle and Two Rated Drivers with Twelve months Policy term
  Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue Auto policy with Two PPA and Two Rated Drivers with Twelve months Policy term
 Examples:
 |TestCase Number	| Browser Name|
 |AutoTestCase_002| Chrome|

 @Parellel
  Scenario Outline: Issue Auto policy with Two Vehicle and Two Drivers, One Rated Driver and One ListOnly Driver with Twelve months Policy term
  Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue Auto policy with Two Vehicle and Two Drivers, One Rated Driver and One ListOnly Driver with Twelve months Policy term
 Examples:
 |TestCase Number	| Browser Name|
 |AutoTestCase_003| Chrome|
 
  @SampleFourthCase
  Scenario Outline: Issue Auto policy with Three Vehicles and Three Drivers, Two Rated Drivers and One ListOnly Driver
  Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue Auto policy with Three Vehicles and Three Drivers, Two Rated Drivers and One ListOnly Driver
 Examples:
 |TestCase Number	| Browser Name|
 |AutoTestCase_004	| Chrome|
 
 @AutoFifth
  Scenario Outline: Issue Auto policy with Multiple Vehicles , One PPA One Motorcycle and Multiple Rated Drivers
  Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue Auto policy with Multiple Vehicles , One PPA One Motorcycle and Multiple Rated Drivers
 Examples:
 |TestCase Number	| Browser Name|
 |AutoTestCase_005| Chrome|
