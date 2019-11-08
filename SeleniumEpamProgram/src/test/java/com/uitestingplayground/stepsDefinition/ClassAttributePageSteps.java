package com.uitestingplayground.stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.ClassAttributePage;

import java.util.concurrent.TimeUnit;

public class ClassAttributePageSteps {
    private WebDriver driver;
    private ClassAttributePage classAttributePage;

    @BeforeClass(description = "Start browser")
    public void startBrowser (){

        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver", path+ "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        driver.get("http://www.uitestingplayground.com/classattr");
        classAttributePage = new ClassAttributePage(driver);
    }

    @Test(description = "popup test")
    public void openSampleAppPage() {
        classAttributePage.openPopup();
        classAttributePage.closePopup();
    }
}
