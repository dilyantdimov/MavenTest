package stepsDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import enums.Context;
import org.junit.Assert;
import pageObjects.ProductPage;

public class ProductPageSteps {

    TestContext testContext;
    ProductPage productPage;

    public ProductPageSteps (TestContext context){
        testContext = context;
        productPage = testContext.getPageObjectManager().getProductPage();
    }


    @Then("^I choose the first one$")
    public void i_choose_the_first_one() {
        String productName = productPage.getProductName(0);
        productPage.select_Product(0);
        testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);
    }

    @Then("^I select colour from the dropdown$")
    public void iSelectColourFromTheDropdown() {

        productPage.select_Colour();
    }

    @And("^I select size from the dropdown$")
    public void iSelectSizeFromTheDropdown() {
        productPage.select_Size();
    }

    @Then("^I verify the chosen product$")
    public void iVerifyTheChosenProduct() {
        String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
        String chosenProduct =productPage.getChosenProductName();
        Assert.assertEquals(productName,chosenProduct);
    }
}
