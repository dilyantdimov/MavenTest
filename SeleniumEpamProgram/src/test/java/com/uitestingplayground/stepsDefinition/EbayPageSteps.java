package com.uitestingplayground.stepsDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageObjects.EbayPage;

public class EbayPageSteps {

    private TestContext testContext;
    private EbayPage ebayPage;

    public EbayPageSteps(TestContext context){
        testContext = context;
        ebayPage = testContext.getPageObjectManager().getEbayPage();
    }
    @Given("^I am on the Ebay homepage$")
    public void iAmOnTheEbayHomepage() {
        ebayPage.navigateToEbayPage();
        Assert.assertEquals(ebayPage.getEbayLogo(),"eBay Logo");
    }

    @When("^I open the cart$")
    public void iOpenTheCart() {
        ebayPage.openCart();
    }

    @And("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchItem){
        ebayPage.searchForItem(searchItem);
    }

    @Then("^I click on the firs result$")
    public void iClickOnTheFirsResult() {
        ebayPage.clickOnFirstResult();
    }

    @And("^I get the first item title$")
    public void iGetTheFirstItemTitle() {
        ebayPage.getItemTitle();
        System.out.println("First item is: "+ ebayPage.getItemTitle());
    }

    @Then("^I add the item to the cart$")
    public void iAddTheItemToTheCart() {
        ebayPage.addItemToCart();
    }

    @Then("^I verify that the item is in shopping cart$")
    public void iVerifyThatTheItemIsInShoppingCart() {
        Assert.assertEquals(ebayPage.getShoppingCartTitle(),"Shopping cart (1 item)");
        Assert.assertEquals(ebayPage.getItemInCartTitle(),ebayPage.item);
    }
}
