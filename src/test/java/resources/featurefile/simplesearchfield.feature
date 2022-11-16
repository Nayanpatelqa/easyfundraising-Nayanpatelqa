Feature: Simple Search Field

  Scenario: User should be able to search a cause
    Given I am on Home Page
    When I click on cookies button
    And I click on Find a cause button
    And I enter three Character in the Search Field "sav"
    And I select Third causes from the suggested list
    And I click on Search cause button
    Then I Confirm with a message that the selected Third "cause" exists in the Search results
    

