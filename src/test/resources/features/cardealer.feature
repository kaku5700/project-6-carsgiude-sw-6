Feature: Car Dealer search functionality
  As a user I want to check Car dealers are searchable.

  @Regression
  Scenario: Search the dealer name
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Find a Dealer’ link
    Then I am able to see the dealer list
      | 101 AUTO CENTRE   |
      | 365 CAR SALES     |
      | 5 STAR AUTO TRADE |
