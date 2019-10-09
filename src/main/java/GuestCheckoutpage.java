import org.openqa.selenium.By;

public class GuestCheckoutpage extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _GuestCheckoutbutton = By.xpath("//input[@class=\"button-1 checkout-as-guest-button\"]");

    public void VerifyUserIsOnGuestCheckOutPage(){
        assertURL(loadProps.getProperty("GuestcheckoutpageURL"));
    }
    public void ClickOnGuestAsACheckOut(){
        ClickElement(_GuestCheckoutbutton);
    }
}
