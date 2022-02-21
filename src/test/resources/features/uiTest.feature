@test
Feature: Automate Booking

  Scenario: 1. Create new account on Xara homepage
    Given User in on Create an account page
    And Verify that FirstName, LastName, Email and Password is visible
    And Verify that Create an account button is disabled
    When User enter invalid details like 1234 4567 ab@gmail 123 values
    Then Verify that error message is displayed


