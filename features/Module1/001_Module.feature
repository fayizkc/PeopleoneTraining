@Module1 @Application
Feature: Feature for Module 1



  @Smoke @Sanity

Scenario: Test case 01
Given Open "http://google.com" Application
When Do actions 
Then Verify results as 5

@DataDriven
Scenario Outline: Test case 02
	Given Open <AppName> Application
	When Do actions 
	And Register User:
	|user name| John|
	|Password	|	qwerty|
	|reenter	|qwerty|
	|DOB			|<Value>	|
		
	Then Verify results as <Value>

@Sanity @Regression @Smoke
Examples:
 |TC|AppName						|Value	|
 |1	|http://google.com	|1			|
 |2	|http://msn.com		|2			|
 
 
 @Smoke  @Regreesion
 Examples:
 |TC|ppName						|Value	|
 |3	|http://google.com	|3			|
 |4	|http://msn.com		|4			|
 
 @Regression 
 Examples:
 |AppName						|Value	|
 |http://google.com	|5			|
 |http://msn.com		|6		|
 



