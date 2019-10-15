@NopCommerce @test5
  Feature: As a User, If i am unregistered, then i should be able to buy a product with CreditCard.

    Scenario: Unregistered User can buy product with CreditCard.
      Given User click on Product Build Your Own Computer.
      And Click Add to Cart.
      And click on Shopping Cart.
      And click on Terms and Conditions.
      And click on Checkout.
      And click on checkout as Guest.
      When User enter all the mandatory Details.
      And select ShippingMethod Ground and Continue.
      And click CreditCard radio Button.
      And fill the MasterCard Details.
      And click Confirm to Order.
      Then User should see the message Your order has been successfully processed.
