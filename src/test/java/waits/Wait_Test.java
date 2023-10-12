package waits;

import browsers.Browser;
import main_pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base.BasePage;
import pages.base.elements.ElementsPage;

import java.time.Duration;

import static constants.Constant.URLS.START_PAGE_URL;

public class Wait_Test {
    private WebDriver driver;
    //private BasePage basepage;
    private MainPage mainPage;
    private ElementsPage elementsPage;

    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();
        // basepage = new BasePage(driver);
        mainPage = new MainPage(driver);
        mainPage.openStartPage();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){ //шаг проверки 3-й кнопки
        String xpath = "//button[@id='visibleAfter']";
        elementsPage= mainPage.openCategoryElements();
        elementsPage.click("//span[text()='Dynamic Properties']");
        elementsPage.waitElementDisplayed(xpath, 10);
        elementsPage.click(xpath); //неявное ожидание с задержкой 5 сек
        Assert.assertTrue(elementsPage.findElement(xpath).isDisplayed()); //проверка
    }

    @Test
    public void step_02(){ //шаг проверки 1-ой кнопки
        elementsPage.openStartPage();
        mainPage.openCategoryElements();
        elementsPage.click("//span[text()='Dynamic Properties']");
        String xpath = "//button[@id='enableAfter']";
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(d->elementsPage.findElement(xpath).isEnabled());
        Assert.assertTrue(elementsPage.findElement(xpath).isEnabled());
    }
}
