Feature: Schedule
  Scenario Outline: Create Event
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Schedule
    And Click On Create Event
    And Input title event as "<title>"
    And Input start date as "<startDate>"
    And Input end date as "<endDate>"
    And Select Repeat as "<Repeat>"
    And Select member with as "<with>"
    And Select private mode as "<privateMode>"
    And Input Notes as "<notes>"
    When User click on Post Event
    Then Success post event message as "<message>" should be displayed

    Examples:
      | email                      | password | title | startDate | endDate  | Repeat      | with          | privateMode | notes                 | message                                |
      | muhammadazis6767@gmail.com | azis1234 |       | 20220411  | 20220411 | Dont Repeat |               | No Private  | test                  | Event title cannot be empty            |
      | muhammadazis6767@gmail.com | azis1234 | Test  | 20220411  | 20220411 | Dont Repeat |               | No Private  | test                  | Create event successful                |
      | muhammadazis6767@gmail.com | azis1234 | Test  | 20220411  | 20220411 | Every Day   | Muhammad Azis | Private     | test                  | Create recurring occurrence successful |
      | muhammadazis6767@gmail.com | azis1234 | Test  | 20220411  | 20220411 | Dont Repeat |               | No Private  | Mention Muhammad Azis | Create event successful                |

  Scenario Outline: Cancel While Create Event
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Schedule
    And Click On Create Event
    When User click on cancel
    Then User should be on schedule page

    Examples:
      | email                      | password |
      | muhammadazis6767@gmail.com | azis1234 |

  Scenario Outline: Verify if Error Message is not displayed after clear Ends of date
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Schedule
    And Click On Create Event
    And Input title event as "<title>"
    And Input start date as "<startDate>"
    When The Ends date is cleared
    Then Error Message as "<message>" must be not displayed

    Examples:
      | email                      | password | title | startDate   |  message |
      | muhammadazis6767@gmail.com | azis1234 |   test    | 20220411   | Cannot choose end date time before start date time |

  Scenario Outline: Verify Ends Date not changed after ends time has changed
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Schedule
    And Click On Create Event
    And Input end date as "<endsDate>"
    When Input Ends Time as "<endsTime>"
    Then Verify ends Date same with "<endsDate>"

    Examples:
      | email                      | password | endsDate  | endsTime |
      | muhammadazis6767@gmail.com | azis1234 |  2022/04/19 | 11:39 PM |






