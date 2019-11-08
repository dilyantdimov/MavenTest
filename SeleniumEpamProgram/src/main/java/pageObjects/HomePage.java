package pageObjects;

import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#title")
    private WebElement title;

    @FindBy(how = How.XPATH, using = "//a[@href='/sampleapp']")
    private WebElement sampleApp;


    public void navigateToHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getAppPath());
    }

    public String getHomePageTitle() {
        return title.getText();
    }

    public void openSampleAppPage() {
        sampleApp.click();
    }

}
