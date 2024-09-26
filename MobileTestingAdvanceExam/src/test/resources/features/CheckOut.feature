Feature: Validate checkout functionality

  Scenario: Verify user can checkout an item
    Given user opens the mamaearth application
    Then verify user is on home page
    When user clicks on first product in the home page
    Then verify user is on product page
    When clicks on add to cart button in product page
    And user click on view cart button in product page
    Then verify user is on cart page
    When user clicks on add address button
    And user enter valid address in address page
    And click save address
    When user clicks on proceed to pay button through cart page
    Then verify user is on payment page
