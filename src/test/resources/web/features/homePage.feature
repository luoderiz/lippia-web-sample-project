Feature: Home Page

  @Smoke
  Scenario: Home Page with three Sliders only
    Given The client is in AT Home Page
    When The client clicks on Shop Menu
    And click on Home menu button
    Then The client verifies that Home page contain only three sliders