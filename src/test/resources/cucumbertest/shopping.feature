Feature: shop

  Background:
    Given Open Home Page

    Scenario Outline:
      Given On click menu '<menu_css>'
      And Click On Subcat '<subc>'
      And Click On '<clickonproduct>'
      And Click On Quantity
      And Quantity Field Reset
      And Filled piece '<piece>'
      And Add To Cart
      And Back Shopping
      When Cart Button Click
      Then Total Price '<totalprice>'
      Examples:
     | menu_css | subc | clickonproduct | piece | totalprice |
     | #block_top_menu > ul > li:nth-child(2) > a | #subcategories > ul > li:nth-child(2) > div.subcategory-image > a | #center_column > ul > li > div > div.left-block > div > a.product_img_link                                                                                                                                             | 3  | $154.97 |
     | #block_top_menu > ul > li:nth-child(2) > a | #subcategories > ul > li:nth-child(3) > div.subcategory-image > a | #center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.last-line.first-item-of-tablet-line.last-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link   | 2  | $187.77 |
     | #block_top_menu > ul > li:nth-child(2) > a | #subcategories > ul > li:nth-child(1) > div.subcategory-image > a | #center_column > ul > li > div > div.left-block > div > a.product_img_link                                                                                                                                             | 1  | $213.77 |
     | #block_top_menu > ul > li:nth-child(1) > a | #subcategories > ul > li:nth-child(1) > div.subcategory-image > a | #center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.last-item-of-tablet-line.last-mobile-line > div > div.left-block > div > a.product_img_link                                          | 10 | $483.77 |
     | #block_top_menu > ul > li:nth-child(3) > a | #block_top_menu > ul > li:nth-child(3) > a                        | #center_column > ul > li > div > div.left-block > div > a.product_img_link                                                                                                                                             | 5  | $566.32 |
     | #block_top_menu > ul > li:nth-child(2) > a | #subcategories > ul > li:nth-child(3) > div.subcategory-image > a | #center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link | 7  | $769.18 |
