Feature: Test Campaign Monitor signup scenario

Scenario: Step-1: Test enter valid credentials
Given Open Chrome V-68 and go to  https://www.campaignmonitor.com/signup/
When User input "AbbasTester" "Practice" "abbastester201@gmail.com" and "Test@201"
Then User should be navigated to Step-2

Scenario: Step-2: Test user can selecet options from dropdown
Given: User have successfully finished Step-1
When: User can select options form dropdown
Then: User should be navigated to Step-3