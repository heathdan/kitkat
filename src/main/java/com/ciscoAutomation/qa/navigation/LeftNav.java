package com.ciscoAutomation.qa.navigation;

import com.ciscoAutomation.qa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by aswathyn on 14/12/15.
 */
public class LeftNav extends HomePage {

    @FindBy(xpath=".//li[@class='active']/button/span[@class='menu-text']")
    private List<WebElement>leftNavPanel;

    @FindBy(xpath=".//span[.='Admin']")
    private WebElement Admin;

    @FindBy(xpath=".//span[.=' Knowledge Center']")
    private WebElement knowledgeCenter;

    @FindBy(xpath=".//span[.=' Collaborate']")
    private WebElement collaborate;

    @FindBy(xpath=".//span[.=' Learning']")
    private WebElement formalLearning;

    @FindBy(xpath=".//span[.=' Workspace']")
    private WebElement workspace;

    @FindBy(xpath=".//span[.=' People']")
    private WebElement people;

    @FindBy(xpath=".//span[.=' Mobile Folder']")
    private WebElement mobileFolder;

    public LeftNav(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getLeftNavPanel() {
        return leftNavPanel;
    }

    public WebElement getKnowledgeCenter() {
        return knowledgeCenter;
    }

    public WebElement getAdmin() {
        return Admin;
    }

    public WebElement getCollaborate() {
        return collaborate;
    }

    public WebElement getFormalLearning() {
        return formalLearning;
    }

    public WebElement getWorkspace() {
        return workspace;
    }

    public WebElement getPeople() {
        return people;
    }

    public WebElement getMobileFolder() {
        return mobileFolder;
    }
}
