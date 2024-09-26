package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPage extends BasePage {

    String listPageTitle = "//android.widget.EditText[@text='%s']";

    public boolean isListPageTitleDisplayed(String productName) {
        return isPresent(driver.findElement(By.xpath(String.format(listPageTitle, productName))));
    }

    @FindBy(xpath = "//android.view.ViewGroup/following-sibling::android.widget.TextView[2]/preceding-sibling::android.widget.TextView")
    List<WebElement> productNames;

    public boolean verifyAllProductsMatchesSearchedText(String searchedText) {
        List<String> productList = productNames.stream().map(WebElement::getText).filter(s -> !s.isEmpty()).toList();
        for (String prodName : productList) {
            if (!prodName.toLowerCase().contains(searchedText.toLowerCase())) {
                if (!searchedText.contains(" ")) {
                    return false;
                } else if (prodName.toLowerCase().contains(searchedText.split(" ")[0].toLowerCase())) {
                    return true;
                } else if (prodName.toLowerCase().contains("combo") || prodName.toLowerCase().contains("kit"))
                    return true;
                else if (!(prodName.toLowerCase().contains(searchedText.split(" ")[1].toLowerCase()))) {
                    return false;
                }
            }
        }
        return true;
    }

}
