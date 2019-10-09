import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegistrationPage extends Utils{
    LoadProps loadProps = new LoadProps();
   // to creat variable to finding locators
    private By _Firstname = By.name("FirstName");
    private By _lastname = By.name("LastName");
    private By _email = By.id("Email");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _Confirmpassword = By.xpath("//input[@name=\"ConfirmPassword\"]");
    private By _registerbutton = By.name("register-button");

     public void verifyUserIsOnRegisterPage(){
       assertURL(loadProps.getProperty("RegistrationpageURL"));
    }

    public void userEnterRegistrationDetails(){
        EnterText(_Firstname,loadProps.getProperty("Firstname"));
        EnterText(_lastname,loadProps.getProperty("Lastname"));
        EnterText(_email,loadProps.getProperty("Emailpart1")+RandomeDate()+loadProps.getProperty("Emailpart2"));
        EnterText(_password,loadProps.getProperty("Password"));
        EnterText(_Confirmpassword,loadProps.getProperty("Confirmpassword"));
        ClickElement(_registerbutton);
    }
}



