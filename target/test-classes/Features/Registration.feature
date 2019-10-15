@NopCommerce  @test1
Feature: As a User, I want to Register so I can use all the facilities www.NopCommerce.com.

  Scenario: User Should be able to go on Register page and enter mandatory details and see the registration successful message.
    Given User is on Homepage and click register.
    When enter Registration Details and click Register
    Then User should see the message “Your Registration Completed.”