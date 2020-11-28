package com.amazon;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class HomePage extends TestBase {


    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-text\"]")
    private WebElement SearchButton;

    @FindBy(id= "searchDropdownBox")
    private  WebElement Dropdown;

    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]")
    private WebElement MouseHoverPrimeButton;

    @FindBy(xpath = "//*[@id=\"nav-swmslot\"]/a")
    private WebElement BlackFridayDeals;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[1]/a/div")
    private WebElement ShopAllDeals;

    @FindBy(xpath = "//*[@id=\"103_dealView_13\"]/div/div[2]")
    private WebElement SelectTileBluetoothTracker;



    public void typeOnSearchBar() {

        searchBar.sendKeys("Java Books");
    }

    public void clickOnSearchButton(){
        searchBar.sendKeys("Iphones");
        sleepFor(2);
        SearchButton.click();
        sleepFor(3);
    }

    public void ClickDropdown(){
        Dropdown.click();
        sleepFor(2);
        Dropdown.sendKeys("Black Friday");
        sleepFor(3);
    }
    public void MouseHoverPrime(){
        Actions actions= new Actions(driver);
        actions.moveToElement(MouseHoverPrimeButton).build().perform();

    }

    public void ShopBlackFriday(){
        BlackFridayDeals.click();
    }
    public void ShopAllTheDeals(){
        BlackFridayDeals.click();
        sleepFor(2);
        ShopAllDeals.click();
    }
    public void BuyTileBluetoothTracker(){
        BlackFridayDeals.click();
        sleepFor(2);
        ShopAllDeals.click();
        sleepFor(2);
        SelectTileBluetoothTracker.click();
        sleepFor(2);

    }

}
