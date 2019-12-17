Feature: Class Attribute Page tests

  Scenario: Popup close test
    Given I am on the Homepage
    When I open Class Attribute page
    And I wait for page to be fully loaded
    And I press the button to trigger the alert
    Then I close the alert
