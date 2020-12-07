package com.amazontest;

import com.amazon.pages.HomePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test
    public void validateUserBeingAbleToClickOnSearchButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnDropDownAndSelectAmazonPharmacy() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickDropdown();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToMouseHoverPrimeButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.MouseHoverPrime();

    }

    @Test
    public void ValidateUserBeingAbleToClickOnTodaysAmazonBasics() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.TodaysAmazonBasics();
    }

    @Test
    public void validateUSerBeenAbleToMouseHoverHelloSignInButtonAndClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverHelloSignInButtonAndClickOnSignInButton();

    }

    @Test
    public void validateUSerBeenAbleToRefreshHomePage() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.refreshHomePage();
    }


    @Test
    public void validateUSerBeenAbleToClickOnCustomerServiceButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCustomerServiceButton();

    }

    @Test
    public void validateUSerBeenAbleToClickOnWholeFoodTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWholeFoodTab();
    }

    @Test
    public void validateUSerBeenAbleToClickOnFindAGiftTAb() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnFindAGiftTAb();
    }

}