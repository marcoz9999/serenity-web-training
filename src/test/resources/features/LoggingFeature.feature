Feature: Logging Feature
  Scenario: Logging with valid credentials
    Given valid credentials and environment
    When  Logging in with correct user name and password and click on logging button
    Then Homepage is shown
