package stepsDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^I am on the Homepage$")
    public void i_am_on_the_Homepage() {
        homePage.navigateToHomePage();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String product)  {
        homePage.perform_Search(product);
    }
}
