package org.mphasis.csr;

import org.mphasis.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CsrPage extends WebPage {

    public CsrPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[class='global-nav'] > div > nav > ul > li:nth-child(3)")
    protected WebElement csrLink;

    @FindBy(xpath = "/html/body/div[4]/div[1]/section/section/section/section/div/div/h1/b")
    protected WebElement csrText;

    public void selectCsrLink() {
        waitForTheElementToBeVisible(csrLink);
        csrLink.click();
    }

    public String getText() {
        waitForTheElementToBeVisible(csrText);
        return csrText.getText();
    }
}
