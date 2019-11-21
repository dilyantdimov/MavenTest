package pageObjects;

import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayPage {

    private WebDriver driver;
    private WebDriverWait wait;
    public String item;

    public EbayPage(WebDriver driver){
        this.driver=driver;
        wait =  new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#gh-cart")
    private WebElement cartIcon;

    @FindBy(how = How.CSS, using = "#gh-la")
    private WebElement ebayLogo;

    @FindBy(how = How.CSS, using = "#gh-ac")
    private WebElement searchField;

    @FindBy(how = How.CSS, using = "#gh-btn")
    private WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"srp-river-results-listing1\"]//div[contains(@class,'s-item__image-section')]")
    private WebElement firstResult;

    @FindBy(how = How.CSS, using = "#itemTitle")
    private WebElement itemTitle;

    @FindBy(how = How.CSS, using = "#isCartBtn_btn")
    private WebElement addToCartButton;

    @FindBy(how = How.CSS, using = ".main-title")
    private WebElement shoppingCartTitle;

    @FindBy(how = How.CSS, using = ".BOLD")
    private WebElement itemInCartTitle;

    public void navigateToEbayPage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getEbayAppPath());
    }

    public String getEbayLogo(){
        return ebayLogo.getText();
    }

    public void openCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        cartIcon.click();
    }

    public void searchForItem(String searchItem) {
        wait.until(ExpectedConditions.elementToBeClickable(searchField));
        searchField.sendKeys(searchItem);
        searchButton.click();
    }

    public void clickOnFirstResult() {
        wait.until(ExpectedConditions.elementToBeClickable(firstResult));
        firstResult.click();
    }

    public String getItemTitle() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        this.item = itemTitle.getText();
        return item;
    }

    public void addItemToCart() {
        addToCartButton.click();
    }

    public String getShoppingCartTitle() {
        wait.until(ExpectedConditions.visibilityOf(shoppingCartTitle));
        return shoppingCartTitle.getText();
    }
    public String getItemInCartTitle() {
        wait.until(ExpectedConditions.visibilityOf(itemInCartTitle));
        return itemInCartTitle.getText();
    }
}
