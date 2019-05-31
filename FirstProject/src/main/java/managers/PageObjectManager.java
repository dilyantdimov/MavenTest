package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.ProductPage;

public class PageObjectManager {

    private WebDriver driver;
    private ProductPage productPage;
    private HomePage homePage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public HomePage getHomePage(){

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }

    public ProductPage getProductPage() {

        return (productPage == null) ? productPage = new ProductPage(driver) : productPage;

    }
}
