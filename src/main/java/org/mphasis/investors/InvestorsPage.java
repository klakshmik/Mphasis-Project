package org.mphasis.investors;

import org.mphasis.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InvestorsPage extends WebPage {

    @FindBy(css = "div[class='global-nav'] > div > nav > ul > li:first-child")
    protected WebElement investorsLink;

    @FindBy(xpath = "/html/body/div[4]/div[1]/section/section/section/section/div/div/h1/span[text()='INVESTORS']")
    protected WebElement investorsText;

    @FindBy(css = "ul[class='nav nav-pills nav-fill'] > li > a > span")
    protected List<WebElement> navPills;

    public InvestorsPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToInvestorsPage() {
        waitForTheElementToBeVisible(investorsLink);
        investorsLink.click();
    }


    public String getText() {
        WebElement element = investorsText;
        waitForTheElementToBeVisible(element);
        return element.getText();
    }



}
