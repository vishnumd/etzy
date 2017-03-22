Feature: Sample

  Background:
    Given John is viewing the Etsy landing page

  @ui
  Scenario: Should be able to search for a product from the input box
    When he searches for a product from the input box
    Then the result should be displayed

  @ui
  Scenario: Should be able to search for a product from the drop-down menu

  @ui
  Scenario: Should be able to search for a product from the icons


