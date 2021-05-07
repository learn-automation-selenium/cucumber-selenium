Feature: User Login Testing feature

@MobilePlatform 
Scenario: Default login user for mobile platform
  Given user is on landing page
  When user login into application with username "tom" and password "1234"
  Then application welcome page is opened after successful login
  And all cards are displayed "true"
  
@WebPlatform
Scenario: Default login user for negative scenario for web platform
  Given user is on landing page
  When user login into application with username "jerry" and password "4321"
  Then application welcome page is opened after successful login
  And all cards are displayed "false"
  
@MobilePlatform
Scenario: Default user signup for mobile platform
  Given user is on landing page
  When user signup by using the following details
  | tom | pass@1234 | tom@gmail.com | NewYork | 91111111111 | 34532 |
  Then user successfully signed up
  And verify the new user details
  
@WebPlatform
Scenario Outline: Login into application for web platform
  Given user is on landing page
 When user login into application with username "mobileuser" and password "mobile@1234"
  Then user successfully signed up
  And verify the new user details