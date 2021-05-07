Feature: Account details testing feature

@sanity  
Scenario: Default login user for sanity testing
  Given user is on landing page
  When user login into application with username "tom" and password "1234"
  Then application welcome page is opened after successful login
  And all cards are displayed "true"
  
@sanity
Scenario: Default login user for negative scenario for smoke testing
  Given user is on landing page
  When user login into application with username "jerry" and password "4321"
  Then application welcome page is opened after successful login
  And all cards are displayed "false"