@activity5
Feature: Basic Syntax
  Scenario: Opening a webpage using Selenium
    Given user is on the user login page
    When the user enters both the username and the password
    And clicks submit button
    Then they get confirmation message and verify message as Invalid credentials