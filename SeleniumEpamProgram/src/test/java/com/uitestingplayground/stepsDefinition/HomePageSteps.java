package com.uitestingplayground.stepsDefinition;

import cucumber.api.java.en.Given;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class HomePageSteps {

    private WebDriver driver;
    private HomePage homePage;
    private PageObjectManager pageObjectManager;
    private WebDriverManager webDriverManager;


//    @BeforeClass (description = "Start browser")
//    public void startBrowser (){
//
//        String path = System.getProperty("user.dir");
//        System.out.println(path);
//        System.setProperty("webdriver.chrome.driver", path+ "\\chromedriver.exe");
//        driver = new ChromeDriver ();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//        driver.manage().window().maximize();
//        driver.get("http://www.uitestingplayground.com");
//        pageObjectManager = new PageObjectManager(driver);
//        homePage = pageObjectManager.getHomePage();
//    }

//    @AfterClass(description = "Close browser")
//    public void closeBrowser(){
//        driver.close();
//    }

    @Given("^I am on the Homepage$")
    public void iAmOnTheHomepage() {
        webDriverManager = new WebDriverManager();
        driver = webDriverManager.getDriver();
        pageObjectManager = new PageObjectManager(driver);
        homePage = pageObjectManager.getHomePage();

        homePage.navigateToHomePage();
        Assert.assertEquals(homePage.getHomePageTitle(),"UI Test Automation\nPlayground");
    }

    @Test(description = "Open SampleAppPage")
    public void openSampleAppPage() {
        homePage.openSampleAppPage();
    }


}
