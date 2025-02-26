@US01
Feature: Main Modules features
  USO1: As a user, I should be accessing all the main modules of the app

  Background: User is already in the log in page
    Given the user is on the login page

  @US01_AC01_TC01  @regression @smoke1
  Scenario Outline: Verify that users can access all the main modules of the app
    Given the user logged in with username as "<userType>" and password as "<password>"
    And user should be able to see all 8 main modules
    Then user should be able to access the following modules in the main menu
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | userType        | password    |
      | storemanager85  | UserUser123 |
      | salesmanager101 | UserUser123 |


  @US01_AC02_TC01 @regression
  Scenario: Verify that driver can see and access 4 modules
    Given the user logged in as "driver"
    And user can see all 4 modules
    Then user can access the following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |







