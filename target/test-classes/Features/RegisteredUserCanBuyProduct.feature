@NopCommerce @test4
Feature: As a User, If I am registered then I should be able to buy product with CreditCard.

  Scenario: Registered User should be able to buy Build your Own Computer with CreditCard.
    Given User is on Homepage and click register.
    And Register Successfully.
    And User is on Homepage.
    When User click on Product Build Your Own Computer.
    And Click Add to Cart.
    And click on Shopping Cart.
    And click on Terms and Conditions.
    And click on Checkout.
    And enter remaining mandatory details.
    And select ShippingMethod Ground and Continue.
    And click CreditCard radio Button.
    And fill the MasterCard Details.
    And click Confirm to Order.
    Then User should see the message Your order has been successfully processed.


