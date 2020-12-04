package com.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;


public class CustomerService extends TestBase {

    @FindBy(xpath = "(//div[@class='a-box-inner'])[1]")
    private WebElement yourOrdersTab;

    @FindBy(xpath = "(//div[@class='a-box-inner'])[2]")
    private WebElement returnsAndRefundsTab;

    @FindBy(xpath = "(//div[@class='a-box-inner'])[3]")
    private WebElement getProductHelpTab;

    @FindBy(xpath = "(//div[@class='a-box-inner'])[4]")
    private WebElement digitalServicesAndDeviceSupportTab;

    @FindBy(xpath = "(//div[@class='a-box-inner'])[5]")
    private WebElement managePrimeTab;

    @FindBy(xpath = "(//div[@class='a-box-inner'])[6]")
    private WebElement paymentsAndGifCardTab;

    @FindBy(xpath = "(//div[@class='a-box-inner'])[7]")
    private WebElement yourAccountTab;


    @FindBy(id = "pageContentContainer")
    private WebElement signInForTheBestExperiencePage;

    @FindBy(xpath = "//div[@class ='a-box-inner a-padding-extra-large']")
    private WebElement signInImage;

    @FindBy(id = "heading")
    private WebElement digitalServicesAndDeviceSupportPageDisplayed;

    @FindBy(xpath = "//div[@class='a-section ya-personalized']")
    private WebElement yourAccountPageDisplayed;


    public void clickOnYourOrdersTab() {
        yourOrdersTab.click();
        Assert.assertTrue(signInImage.isDisplayed());

    }

    public void clickOnReturnsAndRefundsTab() {
        returnsAndRefundsTab.click();
        Assert.assertTrue(signInImage.isDisplayed());

    }

    public void clickOnGetProductHelp() {
        getProductHelpTab.click();
        Assert.assertTrue(signInForTheBestExperiencePage.isDisplayed());
    }

    public void clickOnDigitalServicesAndDeviceSupportTab() {
        digitalServicesAndDeviceSupportTab.click();
        Assert.assertTrue(digitalServicesAndDeviceSupportPageDisplayed.isDisplayed());
    }

    public void clickOnManagePrimeTab() {
        managePrimeTab.click();
        Assert.assertTrue(signInImage.isDisplayed());
    }

    public void clickOnPaymentsAndGifCardTab() {
        paymentsAndGifCardTab.click();
        Assert.assertTrue(signInImage.isDisplayed());
    }

    public void clickOnYourAccountTab() {
        yourAccountTab.click();
        Assert.assertTrue(yourAccountPageDisplayed.isDisplayed());
    }


}


