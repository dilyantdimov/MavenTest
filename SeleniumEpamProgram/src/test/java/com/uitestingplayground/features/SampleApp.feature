Feature: Sample App tests

  Background:
  Given I am on the Homepage
  When I open Sample app page

  Scenario: Sample App Page is available
    Then I assert that the page is loaded

  Scenario: Login to Sample App
    When I wait full load
    When I fill username
    When I fill password
    When I click the submit button
    Then I assert successful login

  Scenario: Unsuccessful login to Sample App
    When I fill username
    When I fill wrong password
    When I click the submit button
    Then I assert unsuccessful login