Feature: Sample App tests

  Scenario: Sample App Page is available
    Given I am on the Homepage
    When I open Sample app page
    Then I assert that the page is loaded

  Scenario: Login to Sample App
    Given I am on the Homepage
    When I open Sample app page
#    Added thread sleep in previous step, because explicit wait does not work - TODO discuss with mentor
#    When I wait full load
    When I fill username
    When I fill password
    When I click the submit button
    Then I assert successful login

  Scenario: Unsuccessful login to Sample App
    Given I am on the Homepage
    When I open Sample app page
    When I fill username
    When I fill wrong password
    When I click the submit button
    Then I assert unsuccessful login