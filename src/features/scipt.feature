  Feature: be young adding product to cart module
    Scenario: order the item and validate
    Given  open the bowser and enter the url "https://www.beyoung.in/"
    When  mousehover on men and click on gym theme
    Then  validate proper theme is dislayed
    When  select gym tshirt based on user interest
    And  select color,size,qty
    And  add to cart
    Then  validate proper item displayed in cart

