Feature: Cucumber BDD homework - module 6

  Scenario: Ebay cart test
    Given I am on the Ebay homepage
    And I search for "GoPro"
    Then I click on the firs result
    And I get the first item title
    Then I add the item to the cart
    Then I verify that the item is in shopping cart
#    When I open the cart
