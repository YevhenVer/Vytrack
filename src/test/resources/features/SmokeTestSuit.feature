@smoke
  Feature: Smoke Test suit


    Background: User is already in the log in page
      Given the user is on the login page

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

    Scenario: Verify that users are able to see the image on the pinbar page
      Given the user logged in as "driver"
      When user click on the Learn how to use this space link
      Then user should see the image with source: "/bundles/oronavigation/images/pinbar-location.jpg"

    Scenario Outline: Verify that users see 3 columns on the Vehicle Costs page
      Given the user logged in as "<userType>"
      And the user is on the Vehicle Costs page
      Then the user should see a table with exactly 3 columns named:
        | TYPE        |
        | TOTAL PRICE |
        | DATE        |

      Examples:
        | userType      |
        | Store Manager |
        | Sales Manager |