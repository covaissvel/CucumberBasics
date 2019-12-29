Feature: Validation of car search page
  In order to validate car search
  as a buyer
  I navigate to www.cars.com

  Scenario: Search for cars
    Given I am in https://www.cars.com/shopping/
    Then I select Make as "Honda"
    Then I select model as "CRV"
    Then I select max price as "$15000"
    Then I select distance as "40 miles from"
    Then I enter pincode as "19018"
    And click on Search
