import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    Registrationresultpage registrationresultpage = new Registrationresultpage();
    Jwellerypage jwellerypage = new Jwellerypage();
    Engagementring engagementring = new Engagementring();
    Emailafriend emailafriend = new Emailafriend();
    Emailafriendsuccessfulpage emailafriendsuccessfulpage = new Emailafriendsuccessfulpage();
    Shoppingcartpage shoppingcartpage = new Shoppingcartpage();
    Checkoutpage checkoutpage = new Checkoutpage();
    Orderconfirmationpage orderconfirmationpage = new Orderconfirmationpage();
    GuestCheckoutpage guestCheckoutpage = new GuestCheckoutpage();

    @Test
    public void UserShouldAbleToRegisterSuccesfully() {
        homepage.ClickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        registrationresultpage.verifyuserIsonRegisterresultpage();
        registrationresultpage.verifyUserGetSuccessfullyRegisterMessage();
    }

    @Test
    public void RegiserUserShouldbeReferaProductEmaileFriend() {

        UserShouldAbleToRegisterSuccesfully();
        registrationresultpage.clickOnContinuebutton();
        homepage.verifyUserIsOnHomepage();
        homepage.Clickonjwelerybutton();
        jwellerypage.userIsOnJweleryPage();
        jwellerypage.clickOnVintageStyleEngagementRing();
        engagementring.verifyUserIsOnProductpage();
        engagementring.ClickOnEmailaFriend();
        emailafriend.verifyUserIsOnEamilaFriendpage();
        emailafriend.userEnteraDetailsOnEmailaFriendpage();
        emailafriendsuccessfulpage.UserIsOnEmailaFriendSuccesssfullyPage();
        emailafriendsuccessfulpage.UserGetAMessageSuccessfullyFromEmailaFriendPage();
    }
    @Test
    public void UnregisterUserShouldbereferaProductEmailaFriend(){
        homepage.verifyUserIsOnHomepage();
        homepage.Clickonjwelerybutton();
        jwellerypage.userIsOnJweleryPage();
        jwellerypage.clickOnVintageStyleEngagementRing();
        engagementring.verifyUserIsOnProductpage();
        engagementring.ClickOnEmailaFriend();
        emailafriend.verifyUserIsOnEamilaFriendpage();
        emailafriend.unRegisteruserEnterDetailsOnEmailAFriendpage();
        emailafriend.verifyUnsuccessfulMessage();
    }
    @Test
    public void UserShouldBuyaProductSuccessfullyWithMasterCard(){
        UserShouldAbleToRegisterSuccesfully();
        registrationresultpage.clickOnContinuebutton();
        homepage.verifyUserIsOnHomepage();
        homepage.Clickonjwelerybutton();
        jwellerypage.userIsOnJweleryPage();
        jwellerypage.clickOnVintageStyleEngagementRing();
        engagementring.verifyUserIsOnProductpage();
        engagementring.ClickshoppingDetails();
        shoppingcartpage.verifyUserIsOnShoppingCartPage();
        shoppingcartpage.ClickOnCheckoutbutton();
        checkoutpage.verifyUserIsOncheckoutPage();
        checkoutpage.UserShouldCheckoutDetailsSuccessfuully();
        orderconfirmationpage.verifyUserIsOnconfirmationPage();
        orderconfirmationpage.VerifySuccessfulmessage();

    }
    @Test
    public void UserShouldAbleToBuyaProductAsGuest(){
        homepage.verifyUserIsOnHomepage();
        homepage.Clickonjwelerybutton();
        jwellerypage.userIsOnJweleryPage();
        jwellerypage.clickOnVintageStyleEngagementRing();
        engagementring.verifyUserIsOnProductpage();
        engagementring.ClickshoppingDetails();
        shoppingcartpage.verifyUserIsOnShoppingCartPage();
        shoppingcartpage.ClickOnCheckoutbutton();
        guestCheckoutpage.VerifyUserIsOnGuestCheckOutPage();
        guestCheckoutpage.ClickOnGuestAsACheckOut();
        checkoutpage.AsGuestUserEnterCheckoutDetails();
        checkoutpage.UserShouldCheckoutDetailsSuccessfuully();
    }

}

