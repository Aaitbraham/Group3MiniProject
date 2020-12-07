package com.amazontest;

import com.amazon.pages.FindAGift;
import com.amazon.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class FindAGiftValidations extends TestBase {
    @Test
    public void validateUserBeingAbleToClickOnShopAllHolidaysGifts() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        FindAGift findAGift = PageFactory.initElements(driver, FindAGift.class);
        homePage.clickOnFindAGiftTAb();
        findAGift.clickOnShopAllHolidaysGifts();

    }

    @Test
    public void validateUserBeingAbleToClickOnElectronicGifts() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        FindAGift findAGift = PageFactory.initElements(driver, FindAGift.class);
        homePage.clickOnFindAGiftTAb();
        findAGift.clickOnElectronicGifts();

    }
}
