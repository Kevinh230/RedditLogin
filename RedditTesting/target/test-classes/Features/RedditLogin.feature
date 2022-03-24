Feature: Reddit login testing

  Scenario: Checking login functionality

    Given user is on the main page
    And user clicks the login button
    Then user enters username and password
    And user clicks on login button
    Then user is redirected to home page

