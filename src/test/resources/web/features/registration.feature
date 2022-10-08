@Smoke
Feature: Registration
  Background:
    Given I am in automationtesting site

  Scenario: Registration success
    When I click on My Account Menu
    And I enter "13578032mail@google.com" in email address textbox
    And I enter "my123456Password0303456" in password textbox
    And I click on Register Button
    Then I will be navigated to the Home Page