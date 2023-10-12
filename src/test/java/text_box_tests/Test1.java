package text_box_tests;

import browsers.Browser;
import main_pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.base.BasePage;
import pages.base.elements.ElementsPage;

import java.time.Duration;

import static constants.Constant.URLS.START_PAGE_URL;

public class Test1 {
    private WebDriver driver;
    private BasePage basepage;
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
    public void step_01(){
       // basepage.click("//div[@class='card mt-4 top-card']/div[div/h5[text()='Elements']]");
        elementsPage= mainPage.openCategoryElements();
        String text = mainPage.getText("//div[@class='col-12 mt-4 col-md-6']");
        String textResult = "Please select an item from left to start practice.";
        Assert.assertTrue(text.equals(textResult));
        Assert.assertEquals(text,textResult);


    }
}
