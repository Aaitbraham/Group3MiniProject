package com.amazontest;

import com.amazon.HomePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSearchButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchButton();
        sleepFor(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.com/s?k=Iphones&ref=nb_sb_noss_2");
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClcikOnDropDown() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickDropdown();
        sleepFor(3);

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToMouseHover() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.MouseHoverPrime();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-flyout-prime\"]/div[2]/div[1]/div[4]/a"));
        Assert.assertTrue(element.isDisplayed());
        sleepFor(3);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToBlackFridayDeals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ShopBlackFriday();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-swmslot\"]"));
        Assert.assertTrue(element.isDisplayed());
        sleepFor(3);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleClickOnShopAllTheDeals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ShopAllTheDeals();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div/div[3]/div[1]/a/div"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.com/blackfriday/ref=gbpp_itr___ALLDEALS?ie=UTF8");
        sleepFor(3);
    }

    @Test
    public void validateUserBeingAbleClickOnTileBluetoothTracker() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.BuyTileBluetoothTracker();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"103_dealView_13\"]/div/div[2]"));
        Assert.assertTrue(element.isDisplayed());
        sleepFor(3);
    }
}