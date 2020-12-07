package com.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WholeFoods {
    @FindBy(xpath = "//*[@id='nav-subnav']/a[2]")
    private WebElement pastPurchasesTab;

    @FindBy(xpath = "//*[@id='nav-subnav']/a[3]")
    private WebElement dealsTab;

    @FindBy(xpath = "//*[@id='nav-subnav']/a[4]")
    private WebElement alexaListTab;

    @FindBy(xpath = "//div[@class ='a-box-inner a-padding-extra-large']")
    private WebElement signInPage;

    @FindBy(xpath = "//div[@class='deals-page-outside-desktop']")
    private WebElement wholeFoodsMarketDeals;

    public void clickOnPastPurchacesTAb() {
        pastPurchasesTab.click();
        Assert.assertTrue(signInPage.isDisplayed());
    }

    public void clickOnDealsTab() {
        dealsTab.click();
        Assert.assertTrue(wholeFoodsMarketDeals.isDisplayed());
    }

    public void clickOnAlexaListTab() {
        alexaListTab.click();
        Assert.assertTrue(signInPage.isDisplayed());
    }

}