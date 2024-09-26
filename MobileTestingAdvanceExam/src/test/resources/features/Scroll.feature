Feature: Validate scrolling

  Scenario: Verify user can scroll home page till end
    Given user opens the mamaearth application
    Then verify user is on home page
    And user scroll home page
    Then verify "PRIVACY POLICY" is displayed