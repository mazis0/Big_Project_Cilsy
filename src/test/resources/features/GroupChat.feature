Feature: Group Chat
  @Testting
  Scenario Outline: Send Message
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Group Chat
    And Send message as "<message>"
    When User Click on send button
    Then Verify that message "<message>" successfully sended
    Examples:
      | email                      | password | message |
      | muhammadazis6767@gmail.com | azis1234 | test    |
      | muhammadazis6767@gmail.com | azis1234 | <p>Konten Website</p>    |
      | muhammadazis6767@gmail.com | azis1234 | 1234567891012345678910123456789101234567891012345678910123456789101234567891012345678910    |

    @schedule
  Scenario Outline: Attach File
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Group Chat
    When Attach file name as "<filename>"
    Then Success attached message as "<message>" should be displayed
    Examples:
      | email                      | password | filename     | message                       |
      | muhammadazis6767@gmail.com | azis1234 | download.png | Upload attachments is success |
      | muhammadazis6767@gmail.com | azis1234 | download.exe | Format file not allowed.      |


  Scenario Outline: Delete text message
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Group Chat
    And Send message as "<message>"
    And User Click on send button
    And Click On message option
    And Click On Label Delete Message
    When Click On Delete Button
    Then Verify that delete message as "<deleteMessage>" is displayed

    Examples:
      | email                        | password | message | deleteMessage |
      | muhammadazis6767@gmail.com | azis1234 | test | This message was deleted |

  Scenario Outline: Delete attached file
    Given User is on Login Page
    And Click on Login with Google Account
    And Input email as "<email>"
    And Click on Berikutnya button
    And Input password as "<password>"
    And User Click on Berikutnya button
    And Click On Paket Soal B
    And Click On Group Chat
    And Attach file name as "<filename>"
    And Click On message option
    And Click On Label Delete Message
    When Click On Delete Button
    Then Verify that delete message as "<deleteMessage>" is displayed

    Examples:
      | email                      | password | filename     | deleteMessage            |
      | muhammadazis6767@gmail.com | azis1234 | download.png | This message was deleted |