@US09
Feature: Invalid Integer numbers in Repeat Every input box
User Story 9: As a user, I should see error messages when I enter an invalid integer number
into the calendar Repeat Every input box.

  Background: Background: User is already in the log in page
    Given the user is on the login page

  @US09_AC01_TC01
  Scenario Outline:Verify that users see error messages when enter invalid integers.
    Given the user logged in with username as "<userType>" and password as "<password>"
    When the user is in the Calendar Events
    Then user should be able to click Create Calendar Event
    And user should be able to click on the repeat checkbox
    When user enter less than 1  integer in the Repeat Every input.
    Then user should see error message for negative int "The value have not to be less than 1."
    When user enter more than 99 integer in the Repeat Every input.
    Then user should see error message for greater int "The value have not to be more than 99."

    Examples:

      |   userType      |  password   |
      |    user17       | UserUser123 |
       # | storemanager77  | UserUser123 |
        #| salesmanager107 | UserUser123 |


#Note: no need to test valid number, data type, etc. in this user story.