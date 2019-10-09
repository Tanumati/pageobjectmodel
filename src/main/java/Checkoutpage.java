import org.openqa.selenium.By;

public class Checkoutpage extends Utils {
    LoadProps loadProps = new LoadProps();

     private By _Firstname =By.xpath("//input[@name=\"BillingNewAddress.FirstName\"]");
     private By _Lastname = By.xpath("//input[@id=\"BillingNewAddress_LastName\"]");
     private By _EamilasGuest = By.xpath("//input[@name=\"BillingNewAddress.Email\"]");
     private By _country =By.xpath("//select[@data-stateprovince=\"#BillingNewAddress_StateProvinceId\"]");
     private By _City = By.xpath("//input[@id=\"BillingNewAddress_City\"]");
     private By _Address = By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
     private By _zipcode = By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
     private By _phone = By.xpath("//input[@name=\"BillingNewAddress.PhoneNumber\"]");
     private By _continuebutton = By.xpath("//input[@onclick=\"Billing.save()\"]");
     private By _continue = By.xpath("//input[@onclick=\"ShippingMethod.save()\"]");
     private By _creditcard = By.xpath("//input[@id=\"paymentmethod_1\"]");
     private By _clickcontinue = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
     private By _selectvisa = By.xpath("//select[@name=\"CreditCardType\"]");
     private By _cardholder = By.xpath("//input[@name=\"CardholderName\"]");
     private By _Cardvalue = By.xpath("//input[@name=\"CardNumber\"]");
     private By _cardcord = By.xpath("//input[@name=\"CardCode\"]");
     private By _selectmomnth = By.xpath("//select[@name=\"ExpireMonth\"]");
     private By _selectyear = By.xpath("//select[@name=\"ExpireYear\"]");
     private By _continuebtn = By.xpath("//input[@onclick=\"PaymentInfo.save()\"]");
     private By _confirmbutton = By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]");


     public void verifyUserIsOncheckoutPage(){
         assertURL(loadProps.getProperty("checkoutpageURL"));
     }
     public void AsGuestUserEnterCheckoutDetails(){
      EnterText(_Firstname,loadProps.getProperty("FirstnameasGuest"));
      EnterText(_Lastname,loadProps.getProperty("LastnameasGuest"));
      EnterText(_EamilasGuest,loadProps.getProperty("Eamilasguest"));

     }
     public void UserShouldCheckoutDetailsSuccessfuully(){
     SelectByValue(_country,"233");
     EnterText(_City,loadProps.getProperty("City"));
     EnterText(_Address,loadProps.getProperty("Address"));
     EnterText(_zipcode,loadProps.getProperty("PostCode"));
     EnterText(_phone,loadProps.getProperty("phoneno"));
     ClickElement(_continuebutton);
     ClickElement(_continue);
     ClickElement(_creditcard);
     ClickElement(_clickcontinue);
     SelectByValue(_selectvisa,"MasterCard");
     EnterText(_cardholder,loadProps.getProperty("CardHolder"));
     EnterText(_Cardvalue,loadProps.getProperty("Cardnumber"));
     SelectByValue(_selectmomnth,"12");
     SelectByValue(_selectyear,"2020");
     EnterText(_cardcord,loadProps.getProperty("cvvnumber"));
     ClickElement(_continuebtn);
     ClickElement(_confirmbutton);
      }

}

