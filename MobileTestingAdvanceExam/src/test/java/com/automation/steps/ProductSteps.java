package com.automation.steps;

import com.automation.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @Then("verify user is on product page")
    public void verifyUserIsOnProductPage() {
        Assert.assertTrue(productPage.isProductPageDisplayed());
    }

    @When("clicks on add to cart button in product page")
    public void clicksOnAddToCartButtonInProductPage() {
        productPage.clickAddToCart();
    }

    @And("user click on view cart button in product page")
    public void userClickOnViewCartBtnInProductPage() {
        productPage.clickViewCartBtn();
    }

}
