package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.WholeFoods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class WholeFoodsValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToClickOnPastPurchacesTAb(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        homePage.clickOnWholeFoodTab();
        wholeFoods.clickOnPastPurchacesTAb();

    }
    @Test
    public void validateUserBeingAbleToClickOnDealsTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        homePage.clickOnWholeFoodTab();
        wholeFoods.clickOnDealsTab();
    }

    @Test
    public void validateUserBeingAbleToClickAlexaListTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        WholeFoods wholeFoods = PageFactory.initElements(driver, WholeFoods.class);
        homePage.clickOnWholeFoodTab();
        wholeFoods.clickOnAlexaListTab();
    }

}
