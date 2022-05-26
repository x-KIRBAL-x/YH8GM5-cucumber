Feature: cartempty

  Background:
    Given Open Home Page

    Scenario:
      Given Click Dress Button
      And Click Add to cart Button
      And Click On Cross
      And Cart Button On Click
      And Click delete
      Given Open Home Page
      Given Cart Button On Click
      Then "Your shopping cart is empty." message is show