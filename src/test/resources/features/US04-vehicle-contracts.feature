@US044
Feature: Access to Vehicle Contracts page.
  User Story 4: As a user, I want to access to Vehicle Contracts page.

  Background: Background: User is already in the log in page
    Given the user is on the login page

    @US04_AC01_TC01
    Scenario Outline: Verify that Store managers and Sales managers can access to the page
    page
      Given the user logged in with username as "<userType>" and password as "<password>"
      #When the user click on "Fleet" module
      Then the user should be able to access to the Vehicles Contracts page
      And user should see "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract" URL
      And user should see "All - Vehicle Contract - Entities - System - Car - Entities - System" title

      Examples:
      |   userType    |  password  |
      |storemanager77 | UserUser123|
      |salesmanager107| UserUser123|


      @US04_AC02_TC01
      Scenario:Verify that Drivers can not access to the page
      page
        Given the user logged in as "driver"
        #When use click on "Fleet" module
        Then the user should not be able to access to the Vehicles Contracts page
        And app should display "You do not have permission to perform this action." message


