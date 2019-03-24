Feature: Selenium class
	Background:
		Given Opened Browser
	
	Scenario: test case 01
		Given I am in Amazon Home Page
		Then I am in Search Field
		When iphones displayed
		And Close Browser
		
	Scenario: test case 02
		Given I am in Amazon Home
		Then I am Selecting Amazon Pay 
		When Display Amazon Pay Page
		And Executed successfully
		
	Scenario: test case 03
		Given I am in Amazon
		Then I am selecting Electronics
		When Select Dropdown text is Electronics
		And Test case executed 