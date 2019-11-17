package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleAppPage {

    WebDriver driver;
    WebDriverWait wait;

    public SampleAppPage(WebDriver driver) {
        this.driver = driver;
        wait =  new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);

    }

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'container')]/h3")
    private WebElement sampleAppTitle;

    @FindBy(how = How.NAME, using = "UserName")
    private WebElement userNameField;

    @FindBy(how = How.NAME, using = "Password")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using = "#login")
    private WebElement loginButton;

    @FindBy(how = How.CSS, using = ".text-success")
    private WebElement successLoginText;

    @FindBy(how = How.CSS, using = ".text-danger")
    private WebElement unSuccessLoginText;

    @FindBy(how = How.CSS, using = "#license")
    private WebElement licenseSection;

    public String getSampleAppTitle() {
        return sampleAppTitle.getText();
    }

    public void fillUsername (String username){
        userNameField.click();
        userNameField.sendKeys(username);
    }

    public void fillPassword (String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton (){
        loginButton.click();
    }

    public String getSuccessLoginText() {
        return successLoginText.getText();
    }

    public String getUnSuccessLoginText() {
        return unSuccessLoginText.getText();
    }

    public void waitFullLoad (){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("fork")));
    }

}
