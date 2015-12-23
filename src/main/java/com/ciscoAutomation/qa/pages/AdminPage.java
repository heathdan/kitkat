package com.ciscoAutomation.qa.pages;

import com.ciscoAutomation.qa.navigation.LeftNav;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by aswathyn on 14/12/15.
 */
public class AdminPage extends LeftNav {

    @FindBy(xpath=".//*[@class='tabbable toggle_view admin-tabs']/ul/li/a")
    private List<WebElement> tabs;

    @FindBy(xpath=".//span[.='User']")
    private WebElement User;

    @FindBy(xpath=".//span[.='System']")
    private WebElement system;

    @FindBy(xpath=".//span[.='Mobile']")
    private WebElement Mobile;

    @FindBy(xpath=".//span[.='Collaborate']")
    private WebElement collaborate;

    @FindBy(xpath=".//span[.='Reporting']")
    private WebElement reporting;

    @FindBy(xpath=".//span[.='Personalize Site']")
    private WebElement landingPagePersonalize;


    public AdminPage(WebDriver driver) {
        super(driver);
    }




}
