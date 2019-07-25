@Test
Feature:Validate add product

  @TestCase1
  Scenario Outline: Test Case 1
  Narrative: Buy a product in website Plazzqavea and validate add product in the shopping car

    Given that I enter in website
    When search the <Product>
    And add the product in shopping car
    Then I validate that product is in shopping car

    Examples:
      | Product                     |
      | Televisor LG LED 50" UHD 4k |