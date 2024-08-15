Feature: Login page automation of automation exercise

Scenario Outline: Check login in successful with valid credintials

Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on Login button
Then User should navigate to homepage
And Close the browser

Examples:
|	username	| password	|
| standard_user	| secret_sauce	|
