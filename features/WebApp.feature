@WEB

Feature: Web applicaiton automation


@WebApp1
Scenario Outline: PHP app launching


#When Launch "https://phptravels.net/"
Given Launch "https://phptravels.net/"

#Given Launch "https://phptravels.net/" in chrome browser

#When Launch "$AppUrl"
#When login to app with <user>
When click on <module> tab
And Search One Way Route:
	|from			|<From>			|
	|to				|<to>				|
	|date			|<date>			|
	|adult		|1					|
	|children	|0					|
	|infant		|0					|
	
And test Action
	
And Wait for 5 seconds

Examples:
|TC_Name				|browser name|module	|From	|to		|date				|
#|Book from asia	|chrome|flights|DXB	|DEL	|10-04-2022	|
|Book from asia	|ff|flights|DXB	|DEL	|10-04-2022	|
#|Book for europ	|flights|MAA	|DEL	|15-05-2022	|

#@login
#Scenario Outline: <Sl> - <TCName> : PHP travels
#	Given Launch "https://phptravels.net/" 
#	When Click on btnLogin object 
#	And Wait for 5 seconds
#
#Examples:
#	|Sl	|TCName									|Url|
#	|1	|Login with valid cred	|https://test.com|
