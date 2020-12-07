package com.amazontest;

import com.amazon.pages.CustomerService;
import com.amazon.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class CustomerServiceValidations extends TestBase {
    @Test
    public void validateUserBeingAbleToClickOnYourOrdersTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CustomerService customerService = PageFactory.initElements(driver, CustomerService.class);
        homePage.clickOnCustomerServiceButton();
        customerService.clickOnYourOrdersTab();
    }

    @Test
    public void validateUserBeingAbleToClickOnReturnsandRefunds() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CustomerService customerService = PageFactory.initElements(driver, CustomerService.class);
        homePage.clickOnCustomerServiceButton();
        customerService.clickOnReturnsAndRefundsTab();

    }

    @Test
    public void validateUserBeingAbleToClickOnGetProductHelp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CustomerService customerService = PageFactory.initElements(driver, CustomerService.class);
        homePage.clickOnCustomerServiceButton();
        customerService.clickOnGetProductHelp();
    }

    @Test
    public void validateUserBeingAbleToClickOnDigitalServicesAndDeviceSupportTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CustomerService customerService = PageFactory.initElements(driver, CustomerService.class);
        homePage.clickOnCustomerServiceButton();
        customerService.clickOnDigitalServicesAndDeviceSupportTab();

    }

    @Test
    public void validateUserBeingAbleToClickOnManagePrimeTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CustomerService customerService = PageFactory.initElements(driver, CustomerService.class);
        homePage.clickOnCustomerServiceButton();
        customerService.clickOnManagePrimeTab();
    }

    @Test
    public void validateUserBeingAbleToClickOnPaymentsAndGifCardTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CustomerService customerService = PageFactory.initElements(driver, CustomerService.class);
        homePage.clickOnCustomerServiceButton();
        customerService.clickOnPaymentsAndGifCardTab();
    }

    @Test
    public void validateUserBeingAbleToClickYourAccountTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CustomerService customerService = PageFactory.initElements(driver, CustomerService.class);
        homePage.clickOnCustomerServiceButton();
        customerService.clickOnYourAccountTab();

    }


}
