@searchtwo
Feature: Make My Trip

  Scenario: Serarch Flights
    Given user at Make My trip portal
    When user hover on "More" and print all the items
    And user select "Deals" from the drop down
    And user select a date
    Then user switch to home page
    
