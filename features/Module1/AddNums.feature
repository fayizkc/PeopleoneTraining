Feature: Scenario context test

@Test1
Scenario: Test

When Add 1 and 2 and put result to @result
And Add below ites to @Map:
|Name|John|
|Place	| chennai|
|age	|30|

Then verify @result as 5
#And display @Map