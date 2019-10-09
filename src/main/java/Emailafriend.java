import org.openqa.selenium.By;

public class Emailafriend extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _emailafriend = By.xpath("//input[@id=\"FriendEmail\"]");
    private By _personalmessage =By.xpath("//textarea[@name=\"PersonalMessage\"]");
    private By _sendemail = By.xpath("//input[@value=\"Send email\"]");
    private By _youremail = By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _Unsuccessfulmessage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");


    public void verifyUserIsOnEamilaFriendpage(){
        assertURL(loadProps.getProperty("EmailaFriendpageURl"));
    }
    public void userEnteraDetailsOnEmailaFriendpage(){
        EnterText(_emailafriend,loadProps.getProperty("emailafriend"));
        EnterText(_personalmessage,loadProps.getProperty("Message"));
        ClickElement(_sendemail);
    }
    public void  unRegisteruserEnterDetailsOnEmailAFriendpage(){
        EnterText(_emailafriend,loadProps.getProperty("emailafriend"));
        EnterText(_youremail,loadProps.getProperty("email"));
        EnterText(_personalmessage,loadProps.getProperty("Message"));
        ClickElement(_sendemail);
    }
    public void verifyUnsuccessfulMessage(){
        assertMessage(loadProps.getProperty("Unsussecfullmessage"),_Unsuccessfulmessage);
    }



}
