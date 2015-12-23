package com.ciscoAutomation.qa.pages;

import com.ciscoAutomation.qa.baseclass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by aswathyn on 24/11/15.
 */
public class CredentialsPage extends BasePage {

    @FindBy(css="#IDToken2")
    private WebElement password;

    @FindBy(id="Button1")
    private WebElement signIn;

    @FindBy(css=".product-info-inner>p")
    private WebElement environment;

    public static final String ENVIRONMENT= "CLKS T2-QA Environment";

    public CredentialsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignIn() {
        return signIn;
    }

    public WebElement getEnvironment() {
        return environment;
    }


}
