package com.uitestingplayground.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import managers.WebDriverManager;

@CucumberOptions(
        features = "src/test/java/com/uitestingplayground/features",
        glue= {"com.uitestingplayground.stepsDefinition"},
        plugin = {"pretty"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @org.testng.annotations.AfterSuite
    public static void teardown() {
        System.out.println("@AfterClass will close the webdriver");
        WebDriverManager.closeDriver();
    }
}

