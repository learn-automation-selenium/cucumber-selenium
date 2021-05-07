Feature: User Login Testing feature

Background:
	Given the browser is installed in machine
	When user click on browser icon to invoke the browser
	Then browser is invoked
	
@regression 
Scenario: Default login user for regression testing
  Given user is on landing page
  When user login into application with username "tom" and password "1234"
  Then application welcome page is opened after successful login
  And all cards are displayed "true"
  
@smoke
Scenario: Default login user for negative scenario for smoke testing
  Given user is on landing page
  When user login into application with username "jerry" and password "4321"
  Then application welcome page is opened after successful login
  And all cards are displayed "false"
  
@regression
Scenario: Default user signup for regression testing
  Given user is on landing page
  When user signup by using the following details
  | tom | pass@1234 | tom@gmail.com | NewYork | 91111111111 | 34532 |
  Then user successfully signed up
  And verify the new user details
  
@sanity
Scenario Outline: Login into application for different users for sanity testing
  Given user is on landing page
  When user login into application with username <username> and password <password> for below users
  Then user successfully signed up
  And verify the new user details
  
  Examples:
	| username | password |
	| uname1   | pass1    |
	| uname2   | pass2    |
	| uname3   | pass3    |
	| uname4   | pass4    |
	| uname5   | pass5    |