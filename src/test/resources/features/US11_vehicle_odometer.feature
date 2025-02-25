Feature: View car odometer info on the Vehicles Odometers page.
  User Story 11: As a user, I want to view car odometer info on the Vehicles Odometers page.

  Background: Background: User is already in the log in page
    Given the user is on the login page

    Scenario Outline: Verify that user can see Vehicle Odometer page
       Given the user logged in with username as "<userType>" and password as "<password>"
       When user can click the Vehicle Odometer module.
       Then user should see error message "You do not have permission to perform this action."

       Examples:

        |   userType    |  password  |
        |storemanager77 | UserUser123|
        |salesmanager107| UserUser123|


  Scenario: Verify that Drivers see the default page as 1.
    Given the user logged in as "driver"
    When the user is on the Vehicle Odometer page
    Then user should see the default page as 1.

  Scenario: Verify that Drivers see the View Per Page as 25 by default.
    Given the user logged in as "driver"
    When the user is on the Vehicle Odometer page
    Then user should see the View Per Page as 25 by default.
