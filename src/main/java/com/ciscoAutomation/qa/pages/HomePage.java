package com.ciscoAutomation.qa.pages;

import com.ciscoAutomation.qa.baseclass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by aswathyn on 24/11/15.
 */
public class HomePage extends BasePage {

    @FindBy(xpath=".//div[@class='page-content dashboard-workspace default-landing navbar-fixed skin-4']")
    private WebElement landingPage;

    public static final String HOME_PAGE_TITLE="Cisco";


    public HomePage(WebDriver driver) {
     super(driver);
    }

    public WebElement getLandingPage() {
        return landingPage;
    }
}
