package com.ciscoAutomation.qa.navigation;

import com.ciscoAutomation.qa.baseclass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by aswathyn on 14/12/15.
 */
public class Tabs extends BasePage {

    @FindBy(xpath=".//*[@class='tabbable toggle_view admin-tabs']/ul/li/a")
    private List<WebElement> tabs;
    




    public Tabs(WebDriver driver) {
        super(driver);
    }

   /* public <T> T initTabs(WebElement element,Class<T> tabName) throws Exception {
        element.click();

    }

    public void getAllTabs() {
        for(WebElement tab: tabs) {

        }

    }
    */




}
