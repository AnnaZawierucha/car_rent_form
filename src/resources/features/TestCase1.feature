Feature: Car rent form

  @CarRent
  Scenario: Check system behaviour when user provides all the necessary data and fill in all the required steps
    Given I open the page "http://qalab.pl.tivixlabs.com/"
    And   I choose country "Poland", city "Wroclaw", model "abc", pick up date "14.02.2020" and drop off date "16.02.2020"
    And   I submit my choice
    And   I choose car from company "Charles-Alvarez"
    And   The summary for the chosen car "Toyota RAV4" is presented
    When  I click the rent button
    And   I provide necessary information: name "Anna", last name "Zawierucha", card number "12345", email "zawierucha.ania@gmail.com"
    Then  The rent button is clickable
    And   No error is displayed
