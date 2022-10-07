@Ignore
Feature: As a potential client i need to search in google to find a web site
Background:
  Given The client is in google page

  Scenario Outline: The client search by "crowdar"
    When The client search for word <word>
    Then The client verify that results are shown properly

Examples:
  | word       |
  | crowdar    |
  | Docker     |
  | Automation |
  | Lippia     |