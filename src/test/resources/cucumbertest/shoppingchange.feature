Feature: change

  Background:
    Given Open Home Page

    Scenario Outline:
      Given Click Cart Button
      And Click On '<click_button>' Button
      And Click On '<click_field>' Field
      And Fill '<fill_quantity_field>' New Quantity '<fill_quantity_piece>'
      Given Open Home Page
      Given Click Cart Button
      Then '<show_products_piece>' Product Is Show
      Examples:
      | click_button | click_field | fill_quantity_field | fill_quantity_piece | show_products_piece |
      | #cart_quantity_down_4_16_0_0.cart_quantity_down | #product_7_34_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | #product_7_34_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | 10 | 35 Products |
      | #cart_quantity_up_5_19_0_0.cart_quantity_up     | #product_7_34_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | #product_7_34_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | 5  | 31 Products |
      | #\31 _1_0_0.cart_quantity_delete                | #product_4_16_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | #product_4_16_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | 6  | 30 Products |
      | #cart_quantity_up_3_13_0_0.cart_quantity_up     | #product_2_7_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey  | #product_2_7_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey  | 0  | 21 Products |
      | #\34 _16_0_0.cart_quantity_delete               | #product_7_34_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | #product_7_34_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | 15 | 25 Products |
      | #cart_quantity_down_7_34_0_0.cart_quantity_down | #product_3_13_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | #product_3_13_0_0 > td.cart_quantity.text-center > input.cart_quantity_input.form-control.grey | 12 | 34 Products |