package com.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    public void typeOnSearchBar() {
        searchBar.sendKeys("Java Books");
    }
}
