package com.ciscoAutomation.qa.pageHelper;

import com.ciscoAutomation.qa.baseclass.BasePageHelper;
import com.ciscoAutomation.qa.navigation.HeaderNav;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by aswathyn on 17/12/15.
 */
public class HeaderNavHelper extends BasePageHelper<HeaderNav> {

    private FluentWait<WebDriver> waitForSpinnerAppear,waitForSpinnerDisappear;

    public HeaderNavHelper(WebDriver driver) {
        super(HeaderNav.class, driver);
    }

    public LoginPageHelper CKlogout() {
        waitForSpinnerToStop();
        page.getTopNavMyProfile().click();
        page.getLogOut().click();
        return new LoginPageHelper(driver);
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(page.getTopNavSearch());
    }

    public void waitForSpinnerToStop() {
        waitForSpinnerAppear= new WebDriverWait(driver, SPINNER_TO_APPEAR_TIMEOUT)
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class)
                .pollingEvery(SPINNER_POLLING_RATE, TimeUnit.MILLISECONDS);

        waitForSpinnerDisappear = new WebDriverWait(driver, SPINNER_TO_DISAPPEAR_TIMEOUT)
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class)
                .pollingEvery(SPINNER_POLLING_RATE, TimeUnit.MILLISECONDS);

        try {
            System.out.println("wait for spinner to appear");
            if (waitForSpinnerAppear.until(ExpectedConditions.visibilityOf(page.getSpinner())) != null) {
                System.out.println("wait for spinner to disappear");
                waitForSpinnerDisappear.until(ExpectedConditions
                        .invisibilityOfElementLocated(page.getSpinnerLocator()));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
