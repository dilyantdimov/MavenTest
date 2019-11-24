package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.ClassAttributePage;
import pageObjects.EbayPage;
import pageObjects.HomePage;
import pageObjects.SampleAppPage;


public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private SampleAppPage sampleAppPage;
    private ClassAttributePage classAttributePage;
    private EbayPage ebayPage;

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

    public EbayPage getEbayPage(){
        return (ebayPage == null) ? ebayPage = new EbayPage(driver) : ebayPage;
    }
}
