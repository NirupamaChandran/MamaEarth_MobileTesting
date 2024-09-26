package com.automation.steps;


import com.automation.pages.ProductListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductListSteps {

    ProductListPage productListPage = new ProductListPage();

    @Then("verify searched {string} list page is displayed")
    public void verifySearchedListPageIsDisplayed(String productName) {
        Assert.assertTrue(productListPage.isListPageTitleDisplayed(productName));
    }

    @Then("verify all products are matches searched {string}")
    public void verifyAllProductsAreMatchesSearched(String productName) {
        Assert.assertTrue(productListPage.verifyAllProductsMatchesSearchedText(productName));
    }


}
