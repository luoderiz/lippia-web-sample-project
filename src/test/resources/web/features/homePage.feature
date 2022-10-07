@Smoke
  Feature: HomePage
    Background:
    Given I am in automationtesting site

    Scenario Outline:  Home Page with a number of elements
    When I click on Shop Menu
    And I click on Home Menu Button
    Then I can verify that the Home Page has a <Quantity> of an <Element> only

    Examples:
      | Quantity | Element |
      | 3        | Slider  |
      | 3        | Arrival |