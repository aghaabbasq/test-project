Feature: Sighup
	In order to use Campaign Monitor
	As a user
	I want to be able to signup


Scenario: Signup
Given Open Chrome and go to  https://www.campaignmonitor.com/signup/
Then User signup as "Qazvini" "PracticeCampMang" "abbas201@campmang.com" "Testing@110" and create an account
Then User will provide account type details by selecting options from dropdown and continue
Then User has successfully signed up