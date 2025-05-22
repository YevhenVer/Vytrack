@US05
Feature: View columns on the Vehicles Model page.
  User Story 05:  As a user, I want to view columns on the Vehicles Model page. (web-table)


  Background: User is already in the log in page
    Given the user is on the login page

  @US05_AC01_TC01
Scenario Outline:Verify that the Store manager and Sales manager can see 10 columns on the
  Vehicles Model page.
    Given the user logged in with username as "<userType>" and password as "<password>"
    When the user is on the Vehicle Model page
    Then user should see 10 Column names

  |MODEL NAME|
  |MAKE|
  |CAN BE REQUESTED|
  |CVVI|
  |CO2 FEE (/MONTH)|
  |COST (DEPRECIATED)|
  |TOTAL COST (DEPRECIATED)|
  |CO2 EMISSIONS|
  |FUEL TYPE|
  |VENDORS  |

    Examples:
      |   userType    |  password  |
      |storemanager55 | UserUser123|
      #|salesmanager105| UserUser123|

  @US05_AC02_TC01
  Scenario: Verify that Drivers cannot access the Vehicles Model page and see “You do not
  have permission to perform this action.” message on the screen.

