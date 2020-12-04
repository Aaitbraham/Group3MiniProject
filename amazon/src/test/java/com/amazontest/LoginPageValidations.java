package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class LoginPageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeInEmailAddress() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.mouseHoverHelloSignInButtonAndClickOnSignInButton();
        loginPage.TypeInEmailAddress();

    }

    @Test
    public void validateUserBeingAbleToClickContinueButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.mouseHoverHelloSignInButtonAndClickOnSignInButton();
        loginPage.TypeInEmailAddress();
        sleepFor(3);
        loginPage.ClickContinueButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnCreateAnAccountButton() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.HelloSignInButton();
        loginPage.CreateAnAccountButton();
        sleepFor(3);
    }

    @Test
    public void validateUserBeingAbleToTypePassword() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.mouseHoverHelloSignInButtonAndClickOnSignInButton();
        loginPage.TypeInEmailAddress();
        sleepFor(3);
        loginPage.ClickContinueButton();
        loginPage.typeInPasswordTab();
        sleepFor(3);
    }

    @Test
    public void validateUserNotBeingAbleToLoginWithInvalidPassword() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.mouseHoverHelloSignInButtonAndClickOnSignInButton();
        loginPage.TypeInEmailAddress();
        sleepFor(3);
        loginPage.ClickContinueButton();
        loginPage.typeInPasswordTab();
        loginPage.clickOnSignInButton();
    }

    @Test
    public void validateUserBeingAbleToCreateAnAccountAndRegister() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.mouseHoverHelloSignInButtonAndClickOnSignInButton();
        loginPage.CreateAnAccountButton();
    }

}
