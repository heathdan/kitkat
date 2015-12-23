package com.ciscoAutomation.qa.pageHelper;

import com.ciscoAutomation.qa.baseclass.BasePageHelper;
import com.ciscoAutomation.qa.pages.AdminPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * Created by aswathyn on 22/12/15.
 */
public class AdminPageHelper extends BasePageHelper<AdminPage> {

    public AdminPageHelper(WebDriver driver) {
        super(AdminPage.class, driver);
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return null;
    }
}
