package com.amazon.pages;

import com.aventstack.extentreports.model.Test;
import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;
import pnt.automation.base.TestBase;
import pnt.automation.report.ExtentTestManager;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailAddressTab;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordTab;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInButton;

    @FindBy(xpath = "//h4[text()='There was a problem']")
    private WebElement thereWasAProblemAlert;


    @FindBy(id = "createAccountSubmit")
    private WebElement createAnAccount;

//    @FindBy(xpath = "//*[@id='ap_register_form']/div/div")
//    private WebElement createAccountWindow;

    @FindBy(id = "ap_customer_name")
    private WebElement typeYourName;

    @FindBy(xpath = "//*[@id='ap_email']")
    private WebElement typeYourEmail;

    @FindBy(id = "ap_password")
    private WebElement enterYourPassword;

    @FindBy(id = "ap_password_check")
    private WebElement reEnterYourPassword;

    @FindBy(xpath = "//input[@id=\"continue\"]")
    private WebElement CreateYourAmazonAccount;

    @FindBy(xpath = "(//div[@class='a-box-inner a-alert-container'])[2]")
    private WebElement emailAddressAlert;


    public void TypeInEmailAddress() {

        emailAddressTab.sendKeys("AdelAitbraham@gmail.com");
        sleepFor(3);
        continueButton.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(emailAddressTab.isDisplayed());
    }

    public void ClickContinueButton() {

        continueButton.click();
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/signin";
        Assert.assertTrue(actualURL.contains(expectedURL));
    }

    public void typeInPasswordTab() {
        passwordTab.sendKeys("12345");
        sleepFor(2);
        Assert.assertTrue(passwordTab.isDisplayed());
    }

    public void clickOnSignInButton() {
        signInButton.click();
        sleepFor(2);
        Assert.assertTrue(thereWasAProblemAlert.isDisplayed());
    }


    public void CreateAnAccountButton() {
        createAnAccount.click();
        typeYourName.sendKeys("Adel AA");
        emailAddressTab.sendKeys("AdelAA@gmail.com");
        passwordTab.sendKeys("1234567");
        reEnterYourPassword.sendKeys("1234567");
        CreateYourAmazonAccount.click();
        Assert.assertTrue(emailAddressAlert.isDisplayed());

    }


}
