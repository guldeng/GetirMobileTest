Feature: Getir E2E Test

Feature: Getir E2E Test
  #Go to Getir app and login
  #Go to basket and verify that it is empty
  #go to items list and print all list and verify that size is 14
  #Go to second category and add two different items
  #Go back the home page
  #Go to basket again
  #Verify total amount

  @wip
  Scenario: Getir Basket Test
    Given The user opens the Getir app and enters "hello@getir.com" and "hello"
    Then The user logins successfully
    And The user clicks basket button
    Then The user verifies that the basket is empty and able to see "There is no result"
    Then The user should be able to see all menu list in console and verifies that the size is 14
    And The user clicks category which is "Atıştırmalık"
    And The user adds two different items
    And The user scrolls down to "Ürün 13"
    And The user adds two different items
    And The user clicks basket button
    Then The user verifies that "Total Amount : 80 ₺"