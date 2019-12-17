package com.uitestingplayground.stepsDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps(TestContext context) {
        homePage = context.getPageObjectManager().getHomePage();
    }

    @Given("^I am on the Homepage$")
    public void iAmOnTheHomepage() {
        homePage.navigateToHomePage();
        Assert.assertEquals(homePage.getHomePageTitle(),"UI Test Automation\nPlayground");
    }

    @When("^I open Sample app page$")
    public void iOpenSampleAppPage() throws InterruptedException {
        homePage.openSampleAppPage();
        Thread.sleep(2000);
    }


    @When("^I open Class Attribute page$")
    public void iOpenClassAttributePage() throws InterruptedException {
        homePage.openClassAttributePage();
        //Thread.sleep(2000);
    }
}
