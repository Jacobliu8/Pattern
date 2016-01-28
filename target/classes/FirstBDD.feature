Feature: Calculator

  Scenario: A plus B

    Given A number named A value is 10
    And A number named B value is 20
    When A plus B
    Then result should equals 30

