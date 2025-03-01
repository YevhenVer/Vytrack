@US08
  Feature: Creating a recurring (repetitive) calendar event..
    User Story 08: As a user, I want to create a recurring (repetitive) calendar event.

    Background: Background: User is already in the log in page
      Given the user is on the login page

    @US08_AC01_TC01
    Scenario Outline: Verify that users see the number “1” by default in the Repeat Every input option.
      Given the user logged in with username as "<userType>" and password as "<password>"
      When the user is in the Calendar Events
      Then user should be able to click Create Calendar Event
      And user should be able to click on the repeat checkbox
      And user should see the number 1 by default in the Repeat Every input.


      Examples:

        |   userType      |  password   |
        |    user17       | UserUser123 |
        | storemanager77  | UserUser123 |
        | salesmanager107 | UserUser123 |


    @US08_AC02_TC01
    Scenario Outline: Verify that users see the error
      Given the user logged in with username as "<userType>" and password as "<password>"
      When the user is in the Calendar Events
      Then user should be able to click Create Calendar Event
      And user should be able to click on the repeat checkbox
      When user clears Calendar event Repeat Every field
      Then users should see error message "This value should not be blank."


      Examples:

        |   userType      |  password   |
        |    user17       | UserUser123 |
        | storemanager77  | UserUser123 |
         | salesmanager107 | UserUser123 |
