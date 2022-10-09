Feature: Registration
  Background:
    Given I am in automationtesting site

  @Ignore
    #Funciona la primera vez, con un mail y contraseña nuevos
  Scenario: Registration success
    When I click on My Account Menu
    And I enter the valid email "newMailAddress@google.com" in the Register TextBox
    And I enter the valid password "newPassword223b" in the Register Textbox
    And I click on Register Button
    Then I am registered and logged in

  @Smoke
  Scenario Outline: Registration failure
    When I click on My Account Menu
    And I enter <Email> in Register EmailAddress TextBox
    And I enter <Password> in Register Password Textbox
    And I click on Register Button
    Then An error message will announce Registration failure

    Examples:
      | Email               | Password         |
      | raffaellacarra.com  | Raffaella0303456 |
      |                     | Raffaella0303456 |
      | raffaella@carra.com |                  |
      |                     |                  |