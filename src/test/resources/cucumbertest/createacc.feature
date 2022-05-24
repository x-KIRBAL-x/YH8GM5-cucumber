Feature: create acc

  Background:
    Given Open Home Page

    Scenario:
      Given Click Sign in button
      Given Fill Email Address field with "valami@es.com"
      Given Click Create Acc Button
      Given Fill First Name field with "Balazs"
      Given Fill Last Name field with "kiraly"
      Given Fill Password field with "123456"
      Given Fill Address field with "cimem"
      Given Fill City field with "varos"
      Given Fill Postcode field with "12345"
      Given Fill Phone field with "012345678910"
      Given Click Acc Submit Button
      Then the "This country requires you to choose a State." error message is shown
      