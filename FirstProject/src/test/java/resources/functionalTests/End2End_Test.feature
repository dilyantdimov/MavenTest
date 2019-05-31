Feature: ToolsQA Tutorial

  Scenario: End2End Scenario
    Given I am on the Homepage
    When I search for "dress"
    Then I choose the first one
    Then I select colour from the dropdown
    And I select size from the dropdown
    Then I verify the chosen product