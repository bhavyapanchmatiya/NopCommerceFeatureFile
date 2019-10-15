@NopCommerce @test3
  Feature: Any Unregistered User should not be able to refer a product via Email a friend function.

    Scenario: User should not be able to refer a product by Email a Friend function.
      Given User is on Homepage and click product.
      When click email a friend.
      And enter friends email and comment and name.
      Then error message should be shown.