package NopCommerceFeatureFile;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyStepdefs {

    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    HTCOneAndroidPage htcOneAndroidPage = new HTCOneAndroidPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();


    @Given("^User is on Homepage and click register\\.$")
    public void userIsOnHomepageAndClickRegister() {
        homepage.clickOnRegister();
    }



    @When("^User click on Register\\.$")
    public void userClickOnRegister() {
        registerPage.verifyUserIsOnRegisterPage();

    }

    @And("^enter Registration Details and click Register$")
    public void enterRegistrationDetailsAndClickRegister() {
        registerPage.userEnterRegistrationDetails();
    }

    @Then("^User should see the message “Your Registration Completed\\.”$")
    public void userShouldSeeTheMessageYourRegistrationCompleted() {
        registrationResultPage.userShouldBeAbleToSeeRegistrationSuccessfulMessage();
    }


    @And("^Register Successfully\\.$")
    public void registerSuccessfully() {
        registerPage.userEnterRegistrationDetails();
        registrationResultPage.userShouldBeAbleToSeeRegistrationSuccessfulMessage();



    }

    @And("^Select a Product\\.$")
    public void selectAProduct() {
        homepage.clickOnProductHtcAndroidMobilePhone();
        htcOneAndroidPage.toVerifyUserIsOnHTCAndroidPage();


    }

    @And("^click email a friend\\.$")
    public void clickEmailAFriend() {
        htcOneAndroidPage.clickOnEmailAFriendButton();
    }

    @And("^enter friends email and comment\\.$")
    public void enterFriendsEmailAndComment() {
        emailAFriend.toVerifyUserIsOnEmailAFriendPage();
        emailAFriend.enterEmailAFriendDetailsWithoutUserEmail();


    }

    @And("^click send\\.$")
    public void clickSend() {
        emailAFriend.clickSendEmail();
    }

    @Then("^User should see the message “Your Email Sent”$")
    public void userShouldSeeTheMessageYourEmailSent() {
        emailAFriend.toVerifyEmailHasBeenSentSuccessfully();
    }

    @Given("^User is on Homepage\\.$")
    public void userIsOnHomepage() {
        registrationResultPage.clickHomepageButton();


    }

    @When("^User click on Product\\.$")
    public void userClickOnProduct() {
        htcOneAndroidPage.toVerifyUserIsOnHTCAndroidPage();

    }

    @And("^enter friends email and comment and name\\.$")
    public void enterFriendsEmailAndCommentAndName() {

        emailAFriend.toVerifyUserIsOnEmailAFriendPage();
        emailAFriend.enterEmailAFriendDetailsWithUserEmail();
        emailAFriend.clickSendEmail();

    }

    @Then("^error message should be shown\\.$")
    public void errorMessageShouldBeShown() {
        emailAFriend.toVerifyUnregisteredUserCannotReferAFriend();
    }




    @Given("^User is on Homepage and click product\\.$")
    public void userIsOnHomepageAndClickProduct() {
        homepage.clickOnProductHtcAndroidMobilePhone();


    }

    @And("^Click Add to Cart\\.$")
    public void clickAddToCart() {
        buildYourOwnComputer.toVerifyUserIsOnBuildYourcomputerPage();
        buildYourOwnComputer.toClickSelector400Gb();
        buildYourOwnComputer.clickAddToCart();

    }

    @When("^User click on Product Build Your Own Computer\\.$")
    public void userClickOnProductBuildYourOwnComputer() {
        buildYourOwnComputer.clickBuildYourOwnComputerLink();

    }

    @And("^click on Shopping Cart\\.$")
    public void clickOnShoppingCart() {
        buildYourOwnComputer.toClickShoppingCartLink();
        shoppingCartPage.toVerifyUserIsOnShoppingCartPage();

    }

    @And("^click on Terms and Conditions\\.$")
    public void clickOnTermsAndConditions() {
        shoppingCartPage.clickSelector();
    }

    @And("^click on Checkout\\.$")
    public void clickOnCheckout() {

        shoppingCartPage.clickCheckOut();

    }


    @And("^enter remaining mandatory details\\.$")
    public void enterRemainingMandatoryDetails() {

        checkOutPage.enterDetailsCountryCityPostCodeAddress1AndPhoneNumber();
        checkOutPage.clickContinueButtonOne();

    }

    @And("^select ShippingMethod Ground and Continue\\.$")
    public void selectShippingMethodGroundAndContinue() {
        UtilsPage.sleep(3000);
        checkOutPage.clickContinueButtonTwo();
    }

    @And("^click CreditCard radio Button\\.$")
    public void clickCreditCardRadioButton() {
        UtilsPage.sleep(3000);
        checkOutPage.selectRadioButtonCreditCard();
        checkOutPage.clickContinueButtonThree();

    }

    @And("^fill the MasterCard Details\\.$")
    public void fillTheMasterCardDetails() {
        UtilsPage.sleep(3000);
        checkOutPage.enterMasterCardDetails();
        checkOutPage.clickContinueButtonFour();

    }

    @And("^click Confirm to Order\\.$")
    public void clickConfirmToOrder() {
        UtilsPage.sleep(3000);
        checkOutPage.clickConfirmButton();
    }

    @Then("^User should see the message Your order has been successfully processed\\.$")
    public void userShouldSeeTheMessageYourOrderHasBeenSuccessfullyProcessed() {

        checkOutPage.toVerifyOrderIsConfirmed();
    }

    @And("^click on checkout as Guest\\.$")
    public void clickOnCheckoutAsGuest() {

        checkOutPage.checkoutAsGuest();
    }

    @When("^User enter all the mandatory Details\\.$")
    public void userEnterAllTheMandatoryDetails() {
        checkOutPage.enterGuestDetails();
        checkOutPage.clickContinueButtonOne();
    }
}


