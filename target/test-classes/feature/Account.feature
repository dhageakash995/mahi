Feature: portal Login

Background:
Given validate the browser
When Browser is triggered
Then check if browser is started

@portalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@portalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password  "4321"
Then Error message should be displayed
And cards displayed are "false"

@portalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| akash | abcd | akash@gmail.com | pune | 7721005119 |
Then Error message should be displayed
And cards displayed are "false"


@portalTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login into application with <Username> and password <Password>
Then Home page is populated
And cards displayed are "True"

Examples:
|Username |Password |
|user1    |pass1    |
|user2    |pass2    |
|user3    |pass3    |