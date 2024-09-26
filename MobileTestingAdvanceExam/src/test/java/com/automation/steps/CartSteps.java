package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @When("user clicks on add address button")
    public void userClicksOnAddAddressButton() {
        cartPage.clickOnAddAddressBtn();
    }

    @And("user enter valid address in address page")
    public void userEnterValidAddressInAddressPage() {
        cartPage.fillAddress();
    }

    @And("click save address")
    public void clickSaveAddress() {
        cartPage.clickSaveAddress();
    }

    @When("user clicks on proceed to pay button through cart page")
    public void userClicksOnProceedToPayButtonThroughCartPage() {
        cartPage.clickOnProceedToPayBtn();
    }

    @Then("verify user is on payment page")
    public void verifyUserIsOnPaymentPage() {
        Assert.assertTrue(cartPage.verifyPaymentPage());
    }

}
