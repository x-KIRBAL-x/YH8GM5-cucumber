Feature: cartempty

  Background:
    Given Open Home Page

    Scenario:
      Given Click Dress Button
      Given Click Add to cart Button
      Given Click On Cross
      Given Cart Button On Click
      When Click delete
      Given Open Home Page
      Given Cart Button On Click
      Then "Your shopping cart is empty." message is show