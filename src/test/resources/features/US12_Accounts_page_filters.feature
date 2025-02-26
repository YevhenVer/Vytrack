Feature: Filter customers' info on the Accounts page

  US12: As a store and sales manager,
  I want to filter customers’ info on the Accounts page,
  So that I can view specific customer details based on different filters.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that users see 8 filter items on the Accounts page
    Given the user logged in as "<userType>"
    When the user navigates to the Accounts page
    Then the user should see 8 filter items with following names:
      | Account name  |
      | Contact name  |
      | Contact email |
      | Contact phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |