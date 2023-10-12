package main_pages;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.base.elements.ElementsPage;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }
    public static final String HOME_BANNER= "//div[@class='home-banner'][a[@href='https://www.toolsqa.com/selenium-training/']]";
    public static final String BLOCK_XPATH = "//div[@class='card mt-4 top-card']";
    public static final String CATEGORY_BLOCKS_XPATH =  BLOCK_XPATH + "/div[div/h5[text()= '%s']]";

    //мктод открывающий определенную категорию, вместо %s

    public void openCategory (String categoryName){
        click(String.format(CATEGORY_BLOCKS_XPATH, categoryName));
    }

    public ElementsPage openCategoryElements(){
        openCategory("Elements");
        return new ElementsPage(driver);
    }
    public void openCategoryForms(){
        openCategory("Forms");
    }
    //дописать для всех категорий
}
