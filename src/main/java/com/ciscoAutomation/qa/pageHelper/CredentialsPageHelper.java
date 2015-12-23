package com.ciscoAutomation.qa.pageHelper;

import com.ciscoAutomation.qa.baseclass.BasePageHelper;
import com.ciscoAutomation.qa.pages.CredentialsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

/**
 * Created by aswathyn on 16/12/15.
 */
public class CredentialsPageHelper extends BasePageHelper<CredentialsPage> {

    public CredentialsPageHelper(WebDriver driver) {
        super(CredentialsPage.class, driver);
        getPageLoadCondition();
    }

    public HomePageHelper signIn(String password) throws Exception {
        page.getPassword().sendKeys(password);
        page.getSignIn().click();
        //implicitWaitMethod();
        return new HomePageHelper(driver);
    }

    public CredentialsPageHelper verifyEnvironment(){
        Assert.assertEquals(page.getEnvironment().getText(), page.ENVIRONMENT);
        return this;
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(page.getEnvironment());
    }
}