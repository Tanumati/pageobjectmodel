import org.openqa.selenium.By;

public class Orderconfirmationpage extends Utils {
    LoadProps loadProps = new LoadProps();
     private By _confirmationsuccessful = By.xpath("//div/strong[text()='Your order has been successfully processed!']");

    public void verifyUserIsOnconfirmationPage(){
        assertURL(loadProps.getProperty("checkoutcompletedpageURL"));
    }
    public void VerifySuccessfulmessage(){
        assertMessage(loadProps.getProperty("checkoutcompleted"),By.xpath("//div/strong[text()='Your order has been successfully processed!']"));
    }

}
