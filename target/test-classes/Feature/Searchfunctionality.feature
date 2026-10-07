@search
Feature: Search functionality

  Scenario: Search for a product
    Given User launches the Otrium website
    When User enters Dresses in the search field
    And User clicks on the search button
    Then Search results related to Dresses should be displayed