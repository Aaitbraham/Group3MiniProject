package com.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;


public class FindAGift extends TestBase {
    @FindBy(xpath = "//*[@id='nav-subnav']/a[1]")
    private WebElement shopAllHolidaysGifts;

    @FindBy(xpath = "//div[@class='bxc-grid__image   bxc-grid__image--light'][1]")
    private WebElement shopGiftGuidesImage;


    @FindBy(xpath = "//div[@id='nav-subnav']/a[2]")
    private WebElement electronicGifts;

    @FindBy(xpath = "(//div[@class='bxc-grid__container bxc-grid__container--width-1500'])[3]")
    private WebElement shopByCategory;

    public void clickOnShopAllHolidaysGifts() {
        shopAllHolidaysGifts.click();
        Assert.assertTrue(shopGiftGuidesImage.isDisplayed());
    }

    public void clickOnElectronicGifts() {
        sleepFor(3);
        electronicGifts.click();
        sleepFor(3);
        Assert.assertTrue(shopByCategory.isDisplayed());
    }
}