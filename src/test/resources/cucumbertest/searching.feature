Feature: searching

  Background:
    Given Open Home Page

    Scenario Outline:
      Given Fill Search With '<searching>'
      When Click On Search Button
      Then Result Show '<result>'
      And Search Reset
      Examples:
      | searching | result |
      | printed   | 5 results have been found. |
      | short     | 4 results have been found. |
      | faded     | 1 result has been found. |
      | yellow    | 3 results have been found. |
      | dress     | 7 results have been found. |
      |           | 0 results have been found. |
