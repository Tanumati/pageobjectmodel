import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class Utils extends BasePage {


    // to open browser
    public static void ToLaunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\Resources\\Browser driver\\chromedriver.exe");
        //open the  chrome browser
        driver = new ChromeDriver();
        // maximise the browser screen
        driver.manage().window().fullscreen();
        //set implicity wait for web object
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //  To closebrowser
    public static void ToClosebrowser() {
        //browser close
        driver.quit();
    }

    // To enter text in fields
    public void EnterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // To Get text from element
    public String GetTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //  To click element
    public void ClickElement(By by) {
        driver.findElement(by).click();
    }

    //  Enter the value
    public void SelectByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //  wait for clickable /explicit wait method
    public static void WaitForClickable(By by, Long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //  wait for alert present / explicit wait method
    public static void WaitForAlertPresent(long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //  wait util elements visible / explicit wait method
    public static void WaitForElementsvisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //  clear text form elements
    public void ClearText(By by) {
        //Clear Text form inout box/area
        driver.findElement(by).clear();
    }

    //dynamic date
    public String RandomeDate() {
        DateFormat formate = new SimpleDateFormat("ddMMyyHHMMss");
        return formate.format(new Date());
    }

    // assertion for URL
    public void assertURL(String expectedURl) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURl);
    }

    // assertion message
    public void assertMessage(String expectedmessage, By by) {
        String actualmessage = GetTextFromElement(by);
        Assert.assertEquals(actualmessage, expectedmessage);
    }

    public void takeScreenshot(String filename) {
        // convert web driver object to takescreenshot
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        // call get Screenshot as Method to creat image file
        File SrcFile= screenshot.getScreenshotAs(OutputType.FILE);
        //move image file to new destination
        File DestFile = new File("src\\test\\Resources\\TestData\\screenshot"+ filename+RandomeDate()+".png");
        //copy file at destination
        try{
            FileUtils.copyFile(SrcFile,DestFile);
        }catch (IOException e){
           // e.printStackTrace();
        }
    }
}

