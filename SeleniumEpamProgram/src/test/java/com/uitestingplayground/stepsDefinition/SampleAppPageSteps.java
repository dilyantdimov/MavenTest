package com.uitestingplayground.stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.SampleAppPage;

import java.util.concurrent.TimeUnit;

public class SampleAppPageSteps {

    private WebDriver driver;
    private SampleAppPage sampleAppPage;

    @BeforeClass(description = "Start browser")
    public void startBrowser (){

        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver", path+ "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/sampleapp");
        sampleAppPage = new SampleAppPage(driver);


    }

    @Test(description = "I am on the sample app page")
    public void sampleAppPageAssert() {
        Assert.assertEquals(sampleAppPage.getSampleAppTitle(),"Sample App");
    }

    @Test(description = "Login test")
    public void loginSampleApp() {
        sampleAppPage.fillUsername("test");
        sampleAppPage.fillPassword("pwd");
        sampleAppPage.clickLoginButton ();
        Assert.assertEquals(sampleAppPage.getSuccessLoginText(),"Welcome, test!");
    }
}
