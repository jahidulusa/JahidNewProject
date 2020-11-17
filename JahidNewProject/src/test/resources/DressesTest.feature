@smokeTest
Feature: Smarttech automation project 

Scenario: Login to the website and add a dress to the cart 
	Given user go to the automation practice homepage 
	When user click on the log in button 
	And user enter valid email address and password 
	And user click on the submit button 
	And user verify the  website title as "My account - My Store" 
	Then user click on the dress button 
	And user print all the prices values in decending order 
	And user select the second dress on that list 
	And user verify the total price with shipping 
	And user logout and close the browser