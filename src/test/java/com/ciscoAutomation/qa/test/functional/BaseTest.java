package com.ciscoAutomation.qa.test.functional;

import com.ciscoAutomation.qa.pageHelper.LoginPageHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by aswathyn on 24/11/15.
 */
public class BaseTest {

    WebDriver driver;
    LoginPageHelper loginPageHelper;

    @BeforeClass
    public void setup() throws Exception {
        driver = new FirefoxDriver();
        driver.navigate().to(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPageHelper = new LoginPageHelper(driver);

        //loginPage.waitForExpectedCondition(LoginPage.PAGETITLE);
    }


    @AfterClass
    public void teardown() throws Exception {
        driver.close();
    }

}
