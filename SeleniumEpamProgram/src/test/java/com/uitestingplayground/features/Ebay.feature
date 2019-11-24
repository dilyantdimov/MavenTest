Feature: Cucumber BDD homework - module 6

  Scenario Outline: Ebay cart test
    Given I am on the Ebay homepage
    And I search for "<Item>"
    Then I click on the firs result
    And I get the first item title
    And I check for option dropdown
    Then I add the item to the cart
    Then I verify that the item is in shopping cart

    Examples:
    |         Item          |
    |    GoPro              |
    |    GoPro Hero7 White  |
    |    Brain              |
