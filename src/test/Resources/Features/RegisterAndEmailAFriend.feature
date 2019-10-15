@NopCommerce @test2
Feature: As a User, I want to Register and refer a product to friend via Email.

  Scenario: User should be able to register successfully and refer a product to a friend by Email a Friend.

  Given User is on Homepage and click register.
    And Register Successfully.
    When User is on Homepage.
   And Select a Product.
    And click email a friend.
    And enter friends email and comment.
    And click send.
    Then User should see the message “Your Email Sent”