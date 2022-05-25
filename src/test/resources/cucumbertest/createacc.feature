Feature: create acc

  Background:
    Given Open Home Page
    And Click Sign in button
    And Fill Email Address field with "valami@sdfsdg.com"
    And Click Create Acc Button

    Scenario Outline:
      Given Fill First Name field with '<firstname>'
      And Fill Last Name field with '<lastname>'
      And Fill Password field with '<password>'
      And Fill Address field with "cimem"
      And Fill City field with '<city>'
      And click state
      And select state
      And Fill Postcode field with "12345"
      And Fill Phone field with "012345678910"
      When Click Acc Submit Button
      Then the '<error_message>' error message is shown
      Examples:
      |firstname|lastname|password|city |    error_message     |
      |         | Kiraly | jelszo |varos|firstname is required.|
      | Balazs  |        | jelszo |varos|lastname is required. |
      | Balazs  | Kiraly |        |varos|passwd is required.   |
      | Balazs  | Kiraly | jelszo |     |city is required.     |
