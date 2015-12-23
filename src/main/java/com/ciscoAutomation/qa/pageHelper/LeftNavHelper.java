package com.ciscoAutomation.qa.pageHelper;

import com.ciscoAutomation.qa.baseclass.BasePageHelper;
import com.ciscoAutomation.qa.navigation.LeftNav;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;

/**
 * Created by aswathyn on 20/12/15.
 */
public class LeftNavHelper extends BasePageHelper<LeftNav> {
    List<WebElement> leftNavPillars;

    public LeftNavHelper( WebDriver driver) {
        super(LeftNav.class,driver);
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return null;
    }

   public KCpageHelper navigateToKC() {
       page.getKnowledgeCenter().click();
       return new KCpageHelper(driver);
   }

    public AdminPageHelper navigateToAdmin() {
        page.getAdmin().click();
        return new AdminPageHelper(driver);
    }

    public boolean verifyPagePermission(String modulePage) {
        Boolean status = true;
        switch (modulePage) {
            case "KnowledgeCenter":
                status = page.getKnowledgeCenter().isDisplayed();
                break;
            case "Collaborate":
                status = page.getCollaborate().isDisplayed();
                break;
            case "FormalLearning":
                status = page.getFormalLearning().isDisplayed();
                break;
            case "Admin":
                status = page.getAdmin().isDisplayed();
                break;
            case "Workspace":
                status = page.getWorkspace().isDisplayed();
                break;
            case "MobileFolder":
                status = page.getMobileFolder().isDisplayed();
                break;
            case "People":
                status = page.getPeople().isDisplayed();
                break;
            default:
                System.out.println("Error in finding the page from left nav");
                break;
        }
        return status;
    }


}
