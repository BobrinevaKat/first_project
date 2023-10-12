package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static browsers.Config.BROWSER_TYPE;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class Browser {
    public static WebDriver driver;
    public static WebDriver createDriver(){
        switch (BROWSER_TYPE){
            case "chrome":
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Incorrect platform or browser name: " + BROWSER_TYPE);



        }
       // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
       // driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT)); // не забывай альт энтер!!!
        driver.manage().window().maximize();
        return driver;
    }
}
