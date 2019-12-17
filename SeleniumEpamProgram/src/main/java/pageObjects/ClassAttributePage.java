package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static support.WaitForPageLoad.waitForPageLoaded;

public class ClassAttributePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ClassAttributePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, 30);
    }

    @FindBy(how = How.XPATH, using = "//descendant::button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    private WebElement primarybutton;

    public void waitFullLoad() throws InterruptedException {
        waitForPageLoaded(driver);
    }

    public void openPopup() {
        primarybutton.click();
    }

    public void closePopup() {
        driver.switchTo().alert().accept();
    }
}
