#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login	
  
  Validate whether user is able to login in the website
  

Scenario: Login using valid credentials
    Given the user is in the login page
    When the user validates the title of the page
    Then the user enters the "username" username
    And the user enters the "password" password
    And user enters the age category
    |age|location|
    |below 5|USA|
    |above 10|India|
    Then the user is "status" to login successfully