Feature: Sighup
	In order to use Campaign Monitor
	As a user
	I want to be able to signup


Scenario: Signup
Given Open Chrome and go to homepage
When User fill form
And User click on button to create an account
Then User will provide account type details by selecting options from dropdown
Then User has successfully signed up