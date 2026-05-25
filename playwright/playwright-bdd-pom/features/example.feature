Feature: Product Management

  Scenario: Add a product to the cart
    Given I am on the Home page
    When I navigate to the Men section
    And I add a product to the cart
    Then I should see the product in the cart