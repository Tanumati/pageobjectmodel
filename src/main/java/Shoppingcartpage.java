import org.openqa.selenium.By;

public class Shoppingcartpage extends Utils{
    LoadProps loadProps = new LoadProps();

    private By _checkoutbutton = By.xpath("//button[@id=\"checkout\"]");
    private By _Agreeterm = By.xpath("//input[@id=\"termsofservice\"]");

    public void verifyUserIsOnShoppingCartPage()
    {
        assertURL(loadProps.getProperty("shoppingcartpageURL"));
    }
    public void ClickOnCheckoutbutton(){
        ClickElement(_Agreeterm);
        ClickElement(_checkoutbutton);

    }
}
