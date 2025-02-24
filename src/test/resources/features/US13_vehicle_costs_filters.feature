Feature: Manage Filters on Vehicle Costs Page
  US13 : As a user, (Store and Sales managers)
  I want to manage filters on the Vehicle Costs page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that users see 3 columns on the Vehicle Costs page
    Given the user logged in with username as "<userType>" and password as "<password>"
    And the user is on the Vehicle Costs page
    Then the user should see a table with exactly 3 columns named:
      | TYPE         |
      | TOTAL PRICE  |
      | DATE         |
    Examples:
      | userType        | password    |
      | storemanager51  | UserUser123 |
#      | salesmanager101 | UserUser123 |


  Scenario Outline: Verify selecting the first checkbox selects all cars
    Given the user logged in with username as "<userType>" and password as "<password>"
    And the user is on the Vehicle Costs page
    When the user checks the first checkbox
    Then all vehicle checkboxes should be checked
    Examples:
      | userType        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |