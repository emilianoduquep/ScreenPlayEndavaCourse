@inProgress
Feature: Login to Sauce home page
  Scenario: Success login to Sauce page
    Given Emiliano is a Sauce Customer
    When He tries to login
    Then He should see the product list