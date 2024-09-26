package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    WebElement denyBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='SKIP']")
    WebElement skipBtn;

    public void openApplication() {
        denyBtn.click();
        if (isPresent(skipBtn)) {
            skipBtn.click();
        }
    }

    @FindBy(xpath = "//android.view.ViewGroup[2]/android.widget.ImageView")
    WebElement mamaEarthImage;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Search for ')]")
    WebElement searchBarText;

    public boolean isHomePageDisplayed() {
        return isPresent(mamaEarthImage) && isPresent(searchBarText);
    }


    @FindBy(className = "android.widget.EditText")
    WebElement searchInput;

    public void searchProducts(String productName) {
        searchBarText.click();
        if (productName.contains(".")) {
            searchInput.sendKeys(ConfigReader.getConfigValue(productName));
        } else {
            searchInput.sendKeys(productName);
        }
    }


    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    List<WebElement> products;

    public void userClicksOnAProduct() {
        for (WebElement element : products) {
            if (isPresent(element)) {
                ConfigReader.setConfigValue("product.title", element.getText());
                element.click();
                break;
            }
        }
    }


    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]")
    WebElement endContainer;

    public void scrollHomePage() {
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        while (!isVisible(endContainer)) {
            scrollOrSwipe(width / 2, height / 2, width / 2, 0);
        }
    }

    @FindBy(xpath = "//android.widget.TextView[@text='PRIVACY POLICY | ']")
    WebElement privacyText;

    public boolean isPrivacyTextDisplayed(String text) {
        return privacyText.getText().contains(text);
    }
}
