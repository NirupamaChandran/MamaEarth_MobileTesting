package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//android.widget.TextView[@text='Your cart']")
    WebElement cartHeading;

    public boolean isCartPageDisplayed() {
        return isPresent(cartHeading);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Add address']")
    WebElement addAddressBtn;

    public void clickOnAddAddressBtn() {
        addAddressBtn.click();
    }

    @FindBy(xpath = "(//android.widget.EditText[@resource-id='text-input-outlined'])[1]")
    WebElement firstName;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id='text-input-outlined'])[2]")
    WebElement lastName;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id='text-input-outlined'])[3]")
    WebElement email;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id='text-input-outlined'])[4]")
    WebElement phone;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id='text-input-outlined'])[5]")
    WebElement pinCode;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id='text-input-outlined'])[8]")
    WebElement address;

    public void fillAddress() {
        firstName.sendKeys(ConfigReader.getConfigValue("first.name"));
        lastName.sendKeys(ConfigReader.getConfigValue("last.name"));
        email.sendKeys(ConfigReader.getConfigValue("email"));
        phone.sendKeys(ConfigReader.getConfigValue("phone"));
        pinCode.sendKeys(ConfigReader.getConfigValue("pin.code"));
        address.sendKeys(ConfigReader.getConfigValue("address"));
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Save Address']")
    WebElement saveAddressBtn;

    public void clickSaveAddress() {
        saveAddressBtn.click();
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Proceed to pay']")
    WebElement proceedToPayBtn;

    public void clickOnProceedToPayBtn() {
        proceedToPayBtn.click();
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Payment Options']")
    WebElement paymentText;

    public boolean verifyPaymentPage() {
        return paymentText.isDisplayed();
    }

}
