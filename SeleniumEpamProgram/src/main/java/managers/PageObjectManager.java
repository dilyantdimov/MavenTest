package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.ClassAttributePage;
import pageObjects.HomePage;
import pageObjects.SampleAppPage;


public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private SampleAppPage sampleAppPage;
    private ClassAttributePage classAttributePage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public SampleAppPage getSampleAppPage(){
        return (sampleAppPage == null) ? sampleAppPage = new SampleAppPage(driver) : sampleAppPage;
    }

    public ClassAttributePage getClassAttributePage(){
        return (classAttributePage == null) ? classAttributePage = new ClassAttributePage(driver) : classAttributePage;
    }
}
