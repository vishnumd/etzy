Feature: Sample

  @ui @pageobject
  Scenario: Should be able to search for a product from the input box
    Given John is viewing the Etsy landing page
    When he searches for a product from the input box
    Then the result should be displayed

  @ui @screenplay
  Scenario: Should be able to search for a product from the input box (screenplay)
    Given John is viewing the Etsy landing page (screenplay)
    When he searches for a product from the input box (screenplay)
    Then the result should be displayed (screenplay)

  @ui  @pageobject
  Scenario: Should be able to search for a product from the drop-down menu
    Given John is viewing the Etsy landing page
    When he selects the product category "Jewellery"
    When he selects sub category "Anklets"
    Then the appropriate category "Anklets" should be displayed

  @ui  @pageobject @test1
  Scenario Outline: Should be able to search for a product from the icons
    Given John is viewing the Etsy landing page
    When he select the following "<product_index>"
    Then the appropriate category "<result>" should be displayed

    Examples:
    |   product_index    |     result        |
    |        1           |   Home & Living   |
    |        2           |   Jewellery       |







