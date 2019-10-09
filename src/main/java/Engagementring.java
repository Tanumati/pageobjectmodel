import org.openqa.selenium.By;

public class Engagementring extends Utils{
    LoadProps loadProps = new LoadProps();

    private By _emailafriend = By.xpath("//input[@value=\"Email a friend\"]");
    private By _addtocart = By.xpath("//input[@id=\"add-to-cart-button-42\"]");

    private By _shoppingcart = By.linkText("shopping cart");



    public void verifyUserIsOnProductpage(){
        assertURL(loadProps.getProperty("EngagementringURL"));
    }
    public void ClickOnEmailaFriend()
    {
        ClickElement(_emailafriend);
    }
    public void ClickshoppingDetails(){
        ClickElement(_addtocart);
        ClickElement(_shoppingcart);
    }



}
