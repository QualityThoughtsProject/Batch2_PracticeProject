Feature: Create Client and issue Home policy

  @HO3@Regression@Parellel@Demo
  Scenario Outline: Issue Home policy of HO3
  Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO3 with Primary usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC001	| Chrome	  |
 
 @HO4@Regression@Parellel
 Scenario Outline: Issue Home policy of HO4
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO4 with Primary usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC002| Chrome|
 
 @HO6@Regression
  Scenario Outline: Issue Home policy of HO6
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO6 with Primary usage type and Residence type House and homemaster plus package
  Examples:
 |TestCase Number	| Browser Name|
 |Property_TC003| Chrome|
 
  @HO3@Regression
  Scenario Outline: Issue Home policy of HO3
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO3 with Secondary usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC004| Chrome|

 @HO4@Regression
  Scenario Outline: Issue Home policy of HO4
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO4 with Secondary usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC005| Chrome|
 
  @HO6@Regression
  Scenario Outline: Issue Home policy of HO6
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO6 with Secondary usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC006| Chrome|
 
 @HO3@Regression
  Scenario Outline: Issue Home policy of HO3
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
 When i create a new client
  Then i issue a Home policy of HO3 with Seasonal usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC007| Chrome|
 
  @HO4@Regression
  Scenario Outline: Issue Home policy of HO4
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO4 with Seasonal usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC008| Chrome|
 
   @HO6@Regression
  Scenario Outline: Issue Home policy of HO6
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO6 with Seasonal usage type and Residence type House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC009| Chrome|
 
 @HO3@Regression
  Scenario Outline: Issue Home policy of HO3
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
 When i create a new client
  Then i issue a Home policy of HO3 with Primary usage type and Residence type Row House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC010| Chrome|

 @HO4@Regression
  Scenario Outline: Issue Home policy of HO4
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO4 with Primary usage type and Residence type Row House and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC011| Chrome|
 
   @HO6@Regression
  Scenario Outline: Issue Home policy of HO6
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO6 with Primary usage type and Residence type Row House and homemaster plus packageExamples:
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC012| Chrome|
 
 @HO3@Regression
  Scenario Outline: Issue Home policy of HO3
 	 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
	 When i create a new client
 	 Then i issue a Home policy of HO3 with Primary usage type and Residence type TownHouse and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC013	| Chrome|
 
 @HO4@Regression
  Scenario Outline: Issue Home policy of HO4
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
 When i create a new client
  Then i issue a Home policy of HO4 with Primary usage type and Residence type TownHouse and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC014| Chrome|
 
   @HO6@Regression
  Scenario Outline: Issue Home policy of HO6
 Given i launch Agency portal application with valid credentials for testcase "<TestCase Number>" in "<Browser Name>"
  When i create a new client
  Then i issue a Home policy of HO6 with Primary usage type and Residence type TownHouse and homemaster plus package
 Examples:
 |TestCase Number	| Browser Name|
 |Property_TC015	| Chrome|
