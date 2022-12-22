Feature: Login to startsharp
  Create a business unit
  Schedule a meeting using the business unit created.

  Scenario: Access the page to create a business unit and schedule a meeting
    Given the user accesses the login page and login successfully with credentials
    When create a business unit
    And schedule a new meeting
    Then check if the meeting was created successfully