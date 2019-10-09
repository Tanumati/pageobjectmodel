import org.openqa.selenium.By;

public class Jwellerypage extends Utils{
    LoadProps loadProps = new LoadProps();

    private By _ring = By.linkText("Vintage Style Engagement Ring");


  public void userIsOnJweleryPage(){
      assertURL(loadProps.getProperty("jwelerypageURL"));
  }
  public void clickOnVintageStyleEngagementRing(){
    ClickElement(_ring);
  }
}