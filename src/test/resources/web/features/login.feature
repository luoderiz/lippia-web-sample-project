@Smoke
Feature: Login
  Background:
    Given I am in automationtesting site
    And I click on My Account Menu

  Scenario: Login success
    When I enter my valid existing username "raffaella@carra.com" in the Login Textbox
    And I enter my valid password "Raffaella0303456" in the Login Textbox
    And I click on Login Button
    Then I am redirected to My Account Home Page

  Scenario Outline: Login failure
    When I enter <Email> in Login User TextBox
    And I enter <Password> in Login Password Textbox
    And I click on Login Button
    Then An error message will announce Login failure

    Examples:
      | Email                   | Password              |
      | rraffaella@carra.com.ar | Raffaella0303456Carra |
      | raffaella@carra.com     |                       |
      |                         | Raffaella0303456      |
      |                         |                       |
      | RAFFAELLA@CARRA.COM     | RAFFAELLA0303456      |
