Feature: Board
  Scenario Outline: Add List
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click on add list
    And Input list name as "<listname>"
    When User click on create
    Then Successfully Create message should be displayed

    Examples:
      | email                      | password | listname |
      | muhammadazis6767@gmail.com | azis1234 | Testing10  |

    Scenario Outline: Archive List Testing 40
      Given User is on Login Page
      And Click on Login with Google Account
      And Input email as "<email>"
      And Click on Berikutnya button
      And Input password as "<password>"
      And User Click on Berikutnya button
      And Click On Paket Soal B
      And Click On Board
      And Click on point three on card Testing5
      When Click on Archive this list
      Then Success Archiving Message as "<message>" should be displayed

      Examples:
        | email                      | password | message                                  |
        | muhammadazis6767@gmail.com | azis1234 | Testing40 list has been moved to archived |

  Scenario Outline: Restore List Testing 10
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click on Archive Item
    And Click on button Switch to lists
    When User click On restore Testing 40
    Then Success Unarchiving Message as "<message>" should be displayed

    Examples:
      | email                      | password | message                                |
      | muhammadazis6767@gmail.com | azis1234 | Unarchiving list with cards is success |

  Scenario Outline: Add Card on List Testing10
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click add card On Testing10
    And Input CardName as "<cardname>"
    When User click on Add Card
    Then Success Add card Message as "<message>" should be displayed

    Examples:
      | email                      | password | cardname  | message                                |
      | muhammadazis6767@gmail.com | azis1234 | Testing30 | Creating card is success |

  Scenario Outline: Change Card name Testing20 on List Testing10
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click on edit on card Testing20
    And Click On label change name
    And Text card name as "<cardname>"
    When User click on Save
    Then Success save Message as "<message>" should be displayed

    Examples:
      | email                      | password | cardname  | message                |
      | muhammadazis6767@gmail.com | azis1234 | Testing20 | Update card is success |

  Scenario Outline: Quick Comment on Card Testing20 on List Testing10
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click on edit on card Testing20
    And Click On label Quick Comment
    And Click on box comment
    And Text Quick comment as "<comment>"
    When User click on Save Quick Comment
    Then Success Comment Message as "<message>" should be displayed

    Examples:
      | email                      | password | comment  | message                |
      | muhammadazis6767@gmail.com | azis1234 | Testing20 | Create comment is success |


  Scenario Outline: Edit Notes on Card Testing20 on List Testing10
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click on edit on card Testing20
    And Click On label Edit Notes
    And Text Notes as "<notes>"
    When User click on Save Notes
    Then Success Save Notes Message as "<message>" should be displayed

    Examples:
      | email                      | password | notes  | message                |
      | muhammadazis6767@gmail.com | azis1234 | Testing20 | Update card is success |

  Scenario Outline: attach file on Card Testing20 on List Testing10
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click on edit on card Testing20
    When Attach file
    Then Success attached Message as "<message>" should be displayed

    Examples:
      | email                      | password  | message                |
      | muhammadazis6767@gmail.com | azis1234 | Upload attachments is success |

  Scenario Outline: Change Member on Card Testing20 on List Testing10
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Board
    And Click on edit on card Testing20
    And Click on change member on card Testing20
    When User Select name muhammad azis
    Then Success Toggle Member Message as "<message>" should be displayed

    Examples:
      | email                      | password  | message                |
      | muhammadazis6767@gmail.com | azis1234 | toggle member card is success |








