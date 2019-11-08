package com.uitestingplayground.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/com/uitestingplayground/features",
        glue= {"com.uitestingplayground.stepsDefinition"},
        plugin = {"pretty"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}

