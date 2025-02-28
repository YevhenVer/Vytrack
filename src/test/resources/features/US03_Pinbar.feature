Feature: Learn how to use the pinbar.
  User Story 3: As a user, I want to learn how to use the pinbar.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Verify that users see description text for the pinbar
    Given the user logged in as "driver"
    When user click on the Learn how to use this space link
    Then user should see "How To Use Pinbar" header
    And user should see "Use pin icon on the right top corner of page to create fast access link in the pinbar." text

  Scenario: Verify that users are able to see the image on the pinbar page
    Given the user logged in as "driver"
    When user click on the Learn how to use this space link
    Then user should see the image with source: "/bundles/oronavigation/images/pinbar-location.jpg"