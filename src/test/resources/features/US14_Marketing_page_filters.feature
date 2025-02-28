@US14
Feature: managing filters on Marketing page.
  US14: As a user, I want to manage filters on the Marketing page.

  Background: User is already in the log in page
    Given the user is on the login page

  @US14_AC01_TC01
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When the user navigate to "Marketing" and to "Campaigns" page
    And user should wait 1 seconds
    And the user will click the filter message
    And the user will click the manage filter
    Then user can see all checkboxes as checked by default
    Examples:

      | userType      |
      | Store Manager |
      | Sales Manager |

  @US14_AC02_TC01
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    When the user navigate to "Marketing" and to "Campaigns" page
    And user should wait 1 seconds
    And the user will click the filter message
    And the user will click the manage filter
    And user should wait 1 seconds
    Then user is able to uncheck any amount of boxes
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |