package com.ciscoAutomation.qa.pageHelper;

import com.ciscoAutomation.qa.baseclass.BasePageHelper;
import com.ciscoAutomation.qa.pages.KCpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * Created by aswathyn on 20/12/15.
 */
public class KCpageHelper extends BasePageHelper<KCpage> {
    public KCpageHelper(WebDriver driver) {
        super(KCpage.class, driver);
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return null;
    }
}
