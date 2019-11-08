package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SampleAppPage {

    WebDriver driver;

    public SampleAppPage(WebDriver driver) {
        this.driver = driver;
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

    public String getSampleAppTitle() {
        return sampleAppTitle.getText();
    }

    public void fillUsername (String username){
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

}
