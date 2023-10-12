package select;
import browsers.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Select_test {
    private WebDriver driver;
    private MainPage mainPage;
    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        //     mainPage.openStartPage();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
        mainPage.openUrl("https://demoqa.com/select-menu");
       /* String locator = "//select[@id='oldSelectMenu']";
        Select select = new Select(mainPage.findElement(locator));
        select.selectByVisibleText("Purple");
        Assert.assertTrue(mainPage.findElement(locator + "/option[4]").getText().equals("Purple"));*/
        String locator = "//div[@class=' css-26l3qy-menu']";
        mainPage.click("//div[div[text()='Select Option']]");
        mainPage.waitElementDisplayed(locator, 20);
        mainPage.click(locator + "//div[text()='Group 1, option 2']");
    }

}
