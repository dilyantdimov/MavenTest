package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClassAttributePage {

    WebDriver driver;

    public ClassAttributePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//descendant::button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    private WebElement primarybutton;

    public void openPopup() {
        primarybutton.click();
    }

    public void closePopup() {
        driver.switchTo().alert().accept();
    }
}
