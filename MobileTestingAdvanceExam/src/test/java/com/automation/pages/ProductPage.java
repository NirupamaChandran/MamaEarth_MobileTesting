package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//android.widget.HorizontalScrollView/../following-sibling::android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement title;

    public boolean isProductPageDisplayed() {
        return title.getText().equals(ConfigReader.getConfigValue("product.title"));
    }

    @FindBy(xpath = "//android.widget.TextView[@text='ADD TO CART']")
    WebElement addToCartBtn;

    public void clickAddToCart() {
        addToCartBtn.click();
    }

    @FindBy(xpath = "//android.widget.TextView[@text='VIEW CART']")
    WebElement viewCartBtn;

    public void clickViewCartBtn() {
        viewCartBtn.click();
    }

}
