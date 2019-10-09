import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Browserselector extends Utils {
    LoadProps loadProps = new LoadProps();

    public void setUpBrowser() {
        String browser = loadProps.getProperty("browser");
        if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\Browserdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\Browserdriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IEDriverServer")) {
            driver = new InternetExplorerDriver();
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\Browserdriver\\IEDriverServer.exe");
        } else {
            System.out.println("browser name is empty or wrong name: " + browser);
        }
    }
    @Test
    public void setupbrwoser(){

    }
}

