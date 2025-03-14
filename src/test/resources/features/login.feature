@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    #Given the user logged in with username as "User1" and password as "UserUser123"

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

  Scenario: Verify login with different user types
    Given the user logged in with username as "User1" and password as "UserUser123"


