package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens the mamaearth application")
    public void user_opens_the_mamaearth_application() {
        homePage.openApplication();
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }


    @When("user search {string} in search bar")
    public void userSearchInSearchBar(String productName) {
        homePage.searchProducts(productName);
    }


    @When("user clicks on first product in the home page")
    public void userClicksOnFirstProductInTheListPage() {
        homePage.userClicksOnAProduct();
    }


    @And("user scroll home page")
    public void userScrollHomePage() {
        homePage.scrollHomePage();
    }


    @Then("verify {string} is displayed")
    public void verifyIsDisplayed(String text) {
        Assert.assertTrue(homePage.isPrivacyTextDisplayed(text));
    }
}
