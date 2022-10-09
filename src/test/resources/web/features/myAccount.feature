@Smoke
Feature: MyAccount
  Background:
    Given I am in automationtesting site
    And I click on My Account Menu
    And I enter my valid existing username "raffaella@carra.com" in the Login Textbox
    And I enter my valid password "Raffaella0303456" in the Login Textbox
    And I click on Login Button
    And I am redirected to My Account Home Page

  Scenario:  My Account Dashboard
    When I click on Dashboard
    Then I can see the Dashboard of the site
