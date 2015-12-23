package com.ciscoAutomation.qa.pageHelper;

import com.ciscoAutomation.qa.baseclass.BasePageHelper;
import com.ciscoAutomation.qa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by aswathyn on 16/12/15.
 */
public class LoginPageHelper extends BasePageHelper<LoginPage> {

    public LoginPageHelper(WebDriver driver) {
        super(LoginPage.class, driver);
        waitForPageToLoad(getPageLoadCondition());
    }

    public CredentialsPageHelper enterUserCredentials(String userName) throws Exception {
        page.getEmailInput().sendKeys(userName);
        page.getNextButton().click();
        implicitWaitMethod();
        return new CredentialsPageHelper(driver);
    }

    @Override
    public String getPageTitle() {
        return page.PAGETITLE;
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.titleIs(getPageTitle());

    }
}
