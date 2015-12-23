package com.ciscoAutomation.qa.pageHelper;

import com.ciscoAutomation.qa.baseclass.BasePageHelper;
import com.ciscoAutomation.qa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by aswathyn on 16/12/15.
 */
public class HomePageHelper extends BasePageHelper<HomePage> {

    private HeaderNavHelper headerNavHelper;
    private LeftNavHelper leftNavHelper;

    public HomePageHelper(WebDriver driver) {
        super(HomePage.class, driver);
        waitForPageToLoad(getPageLoadCondition());
        headerNavHelper=new HeaderNavHelper(driver);
        leftNavHelper = new LeftNavHelper(driver);
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(page.getLandingPage());
    }

    @Override
    public String getPageTitle() {
        return page.HOME_PAGE_TITLE;
    }

    /************************* GET/SET methods ***********************/

    public HeaderNavHelper getHeaderNavHelper() {
        return headerNavHelper;
    }

    public void setHeaderNavHelper(HeaderNavHelper headerNavHelper) {
        this.headerNavHelper= headerNavHelper;
    }

    public LeftNavHelper getLeftNavHelper() {
        return leftNavHelper;
    }

    public void setLeftNavHelper(LeftNavHelper leftNavHelper) {
        this.leftNavHelper = leftNavHelper;
    }
}
