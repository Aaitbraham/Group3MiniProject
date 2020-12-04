package com.amazon.pages;


import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

import pnt.automation.base.TestBase;
import pnt.automation.report.ExtentTestManager;

public class HomePage extends TestBase {


    @FindBy(id = "twotabsearchtextbox")  //1
    private WebElement searchBar;

    @FindBy(xpath = "//input[@type='submit']")  //2
    private WebElement searchButton;

    @FindBy(id = "searchDropdownBox")  //3
    private WebElement dropdown;

    @FindBy(xpath = "//a[@id='nav-link-prime']") //4
    private WebElement mouseHoverPrimeButton;

    @FindBy(xpath = "//div[@class='pin-nav-content-img']")  //5
    private WebElement primeImageDispaly;

    @FindBy(xpath = "//a[text()='AmazonBasics'] ") //6
    private WebElement amazonBasics;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")  //7
    private WebElement amazonLogoPageRefresh;

    @FindBy(xpath = "//option[text()='Amazon Pharmacy']")  //8
    private WebElement amazonPharmacy;

    @FindBy(xpath = "//*[@id='nav-link-accountList']")  //9
    private WebElement helloSignInButton;

    @FindBy(xpath = "//*[@id='nav-signin-tooltip']/a/span")  //10
    private WebElement signInButton;

    @FindBy(id = "ap_email")   //11
    private WebElement emailAddressTab;

    @FindBy(xpath = "//a[text()='Coupons']")  //12
    private WebElement coupons;

    @FindBy(xpath = "//a[text()='Customer Service']")
    private WebElement customerServiceButton;
    @FindBy(xpath = "//div[@class='a-section a-spacing-extra-large a-spacing-top-extra-large ss-landing-container']/h1")
    private WebElement helloText;

    @FindBy(xpath = "//a[text()='Whole Foods']")
    private WebElement wholeFoodTab;

    @FindBy(xpath = "//img[@class='nav-categ-image']")
    private WebElement WholeFoodRefreshTab;

    @FindBy(xpath = "//a[text()='Find a Gift']")
    private WebElement findAGiftTAb;

    @FindBy(xpath = "//div[@id='a-page']")
    private WebElement giftPageDisplayed;


    public void typeOnSearchBar() {   // 1
        searchBar.isDisplayed();
        Assert.assertTrue(true);
        searchBar.sendKeys("Iphones");
        ExtentTestManager.log("<<<<<<<Iphones have been Typed>>>>>>>");

    }

    public void clickOnSearchButton() { //2

        searchButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.com/s?k=Iphones&ref=nb_sb_noss_2");
        sleepFor(3);

    }

    public void ClickDropdown() { //3
        Select select = new Select(dropdown);
        select.selectByValue("search-alias=amazon-pharmacy");
        sleepFor(3);
        Assert.assertTrue(amazonPharmacy.isDisplayed());

    }

    public void MouseHoverPrime() { //4
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverPrimeButton).build().perform();
        Assert.assertTrue(primeImageDispaly.isDisplayed());
        sleepFor(3);
    }

    public void TodaysAmazonBasics() { //6
        amazonBasics.click();
        sleepFor(3);
        Assert.assertTrue(amazonBasics.isDisplayed());
        sleepFor(2);
    }

    public void HelloSignInButton() {
        helloSignInButton.click();
        sleepFor(3);
        Assert.assertTrue(helloSignInButton.isDisplayed());
    }

    public void mouseHoverHelloSignInButtonAndClickOnSignInButton() { //9 + 10
        Actions actions = new Actions(driver);
        actions.moveToElement(helloSignInButton);
        sleepFor(5);
        signInButton.click();
        sleepFor(5);
        Assert.assertTrue(emailAddressTab.isDisplayed());
    }

    public void refreshHomePage() {
        amazonLogoPageRefresh.click();
        Assert.assertTrue(amazonLogoPageRefresh.isDisplayed());

    }

    public void clickOnCustomerServiceButton() {
        customerServiceButton.click();
        Assert.assertTrue(helloText.isDisplayed());
    }

    public void clickOnWholeFoodTab() {
        wholeFoodTab.click();
        Assert.assertTrue(WholeFoodRefreshTab.isDisplayed());

    }

    public void clickOnFindAGiftTAb() {
        findAGiftTAb.click();
        Assert.assertTrue(giftPageDisplayed.isDisplayed());
    }
}


