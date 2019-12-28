@tag
Feature: Login	
  
  Validate whether user is able to login in the website
  

Scenario: Login using valid credentials
    Given the user is in the login page
    When the user validates the title of the page
    Then the user enters the "username" username
    And the user enters the "password" password
    And user enters the age
    |Age|
    |5|
    |10|
    Then the user is "status" to login successfully