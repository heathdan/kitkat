package com.ciscoAutomation.qa.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by aswathyn on 24/11/15.
 */
public class BasePage {

    protected WebDriver driver;

    WebDriverWait webDriverWait;

    private static final long IMPLICIT_WAIT=10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }



    /*public void implicitWaitMethod() {
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
   } */



}
