Feature: Validate search functionality

  Scenario Outline: Verify user can search item in the application
    Given user opens the mamaearth application
    Then verify user is on home page
    When user search "<productName>" in search bar
    Then verify searched "<productName>" list page is displayed
    And verify all products are matches searched "<productName>"

    @positive
    Examples:
      | productName |
      | Sunscreen   |
      | Hair Serum  |
      | Face Wash   |
      | Lip Balm    |


    @negative
    Examples:
      | productName |
      | bike        |

