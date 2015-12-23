package com.ciscoAutomation.qa.navigation;

import com.ciscoAutomation.qa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by aswathyn on 16/12/15.
 */
public class HeaderNav extends HomePage {

    @FindBy(css="#navbar")
    private WebElement topNavBar;

    @FindBy(xpath=".//div[@id='navbar']//input[@id='top-nav-search-box']")
    private WebElement topNavSearch;

    @FindBy(xpath=".//i[@class='icon-caret-down']")
    private WebElement topNavMyProfile;

    @FindBy(xpath=".//li[@class='logout last']/a")
    private WebElement logOut;

    @FindBy(xpath=".//li[@class='ember-view active']/a")
    private WebElement myProfile;

    @FindBy(xpath=".//i[@class='icon-spin icon-spinner-dots loading-icon bigger-230']")
    private WebElement spinner;

    By spinnerLocator = By.xpath(".//i[@class='icon-spin icon-spinner-dots loading-icon bigger-230']");

    public HeaderNav(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogOut(){
        return logOut;
    }

    public WebElement getTopNavBar(){
        return topNavBar;
    }

    public WebElement getTopNavSearch() {
        return topNavSearch;
    }

    public WebElement getTopNavMyProfile() {
        return topNavMyProfile;
    }

    public WebElement getMyProfile() {
        return myProfile;
    }

    public WebElement getSpinner(){
        return spinner;
    }

    public By getSpinnerLocator() {
        return spinnerLocator;
    }

}
