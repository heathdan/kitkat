package com.ciscoAutomation.qa.pages;
import com.ciscoAutomation.qa.baseclass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by aswathyn on 24/11/15.
 */
public class LoginPage extends BasePage {

    @FindBy(id="ember314")
    private WebElement email;

    @FindBy(css=".btn.btn-primary.msg_page-button")
    private WebElement nextButton;

    public static final String PAGETITLE = "Cisco";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailInput() {
        return email;
    }

    public WebElement getNextButton() {
        return nextButton;
    }



}
