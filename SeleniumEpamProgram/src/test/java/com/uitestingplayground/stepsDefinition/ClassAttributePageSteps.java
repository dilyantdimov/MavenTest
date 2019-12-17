package com.uitestingplayground.stepsDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.annotations.Test;
import pageObjects.ClassAttributePage;

public class ClassAttributePageSteps {
    private ClassAttributePage classAttributePage;

    public ClassAttributePageSteps(TestContext context){
        classAttributePage = context.getPageObjectManager().getClassAttributePage();
    }

    @Test(description = "popup test")
    public void openSampleAppPage() {
        classAttributePage.openPopup();
        classAttributePage.closePopup();
    }

    @And("^I press the button to trigger the alert$")
    public void iPressTheButtonToTriggerTheAlert() {
        classAttributePage.openPopup();
    }

    @Then("^I close the alert$")
    public void iCloseTheAlert() {
        classAttributePage.closePopup();
    }

    @And("^I wait for page to be fully loaded$")
    public void iWaitForPageToBeFullyLoaded() throws InterruptedException {
        classAttributePage.waitFullLoad();
    }
}
