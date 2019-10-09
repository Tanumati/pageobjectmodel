import org.openqa.selenium.By;

public class Homepage extends Utils {
    LoadProps loadProps = new LoadProps();
    // to create variable for finding Locators
    private By _registerbutton = By.xpath("//a[@class=\"ico-register\"]");
    private By _login = By.xpath("//a[@class= \"ico-register\"]");
    private By _wishlist = By.xpath("//span[@class='wishlist-label']");
    private By _shoppingcart = By.xpath("//span[@class='cart-label']");
    private By _computers = By.linkText("Computers ");
    private By _search = By.xpath("//input[@type=\"text\"]");
    private By _jwelerybutton  = By.linkText("Jewelry");

    // make method
    public void ClickOnRegisterButton() {
     ClickElement(_registerbutton);
    }
    public void ClickOnLogInButton(){
        ClickElement(_login);
    }
    public void ClickOnWishlistButton(){
        ClickElement(_wishlist);
    }
    public void ClickOnShoppingCartButton(){
        ClickElement(_shoppingcart);
    }
    public void ClickOnComputerButton(){
        ClickElement(_computers);
    }
    public void verifyUserIsOnHomepage(){
        assertURL(loadProps.getProperty("HomepageURL"));
    }
    public void Clickonjwelerybutton(){
        ClickElement(_jwelerybutton);
    }
}