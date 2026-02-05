@activity2
Feature: Basic Syntax
  Scenario: Opening a webpage using Selenium
    Given user is on the login page
    When the user enters the username and the password
    And clicks the submit button
    Then they get confirmation message and verify