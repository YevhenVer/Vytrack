Feature: Vehicle Selection on Vehicles Page
  US07 As a Sales and Store Manager,
  I want to be able to select any vehicle from the Vehicles page
  So that I can manage vehicle selections effectively.


  Background: User is already in the log in page
    Given the user is on the login page



  Scenario Outline: Verify all checkboxes are unchecked by default
    Given the user logged in as "<userType>"
    And the user in on the Vehicles page
    When all vehicle checkboxes should be unchecked
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |



  Scenario Outline: Verify selecting the first checkbox selects all cars
    Given the user logged in as "<userType>"
    And the user in on the Vehicles page
    When the user checks the first checkbox
    Then all vehicle checkboxes should be checked
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |



  Scenario Outline: Verify user can select any individual car
    Given the user logged in as "<userType>"
    And the user in on the Vehicles page
    When the user checks a specific vehicle checkbox
    Then only that vehicle checkbox should be checked
    And other unchecked checkboxes should remain unchanged

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |