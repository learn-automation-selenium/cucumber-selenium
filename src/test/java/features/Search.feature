Feature: Search the selected items and place the order

	@SmokeTest
  Scenario: Search selected items and verify it
    Given User is on GreenKart Landing page
    When User searched for Cucumber vegetable
    Then "Cucumber" results are displayed
    
    
  @RegressionTest
  Scenario: Search selected items and pace an order
    Given User is on GreenKart Landing page
    When User searched for Brinjal vegetable
    And User clicks on plus button once to add 2 items
    And User clicks on Add To Cart Button
    And User clicks on cart and clicks on Proceed To Checkout
    Then verify Brinjal items is present in checkout page
    
  @SanityTest
  Scenario Outline: Search items and pace an order for different items
    Given User is on GreenKart Landing page
    When User searched for <vegetable> vegetable
    And User clicks on plus button once to add 2 items
    And User clicks on Add To Cart Button
    And User clicks on cart and clicks on Proceed To Checkout
    Then verify <vegetable> items is present in checkout page
    Examples:
		|vegetable  |
		|Brinjal    |
		|Beetroot   |
		|Carrot     |
