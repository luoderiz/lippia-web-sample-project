@Smoke
Feature: Registration
  Background:
    Given I am in automationtesting site

    Scenario:
      When I click on My Account Menu
      And I enter "mail@google.com" in email address textbox
      And I enter "myPassword" in password textbox
      And I click on Register Button
      Then I will be navigated to the Home Page