@Smoke
Feature: Access MyAccount Success
  Background:
    Given I am in automationtesting site
    And I click on My Account Menu
    And I enter my valid existing username "raffaella@carra.com" in the Login Textbox
    And I enter my valid password "Raffaella0303456" in the Login Textbox
    And I click on Login Button
    And I am redirected to My Account Home Page

  Scenario:  Access Dashboard Success
    When I click on Dashboard
    Then I can see the Dashboard of the site

  Scenario: Access Orders Success
    When I click on Orders Button
    Then I can see my Orders Page