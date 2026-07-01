package org.mphasis.newsroom;

import org.mphasis.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsRoomPage extends WebPage {

    @FindBy(css = "div[class='global-nav'] > div > nav > ul > li:nth-child(2)")
    protected WebElement newsRoomLink;

    @FindBy(xpath = "/html/body/div[4]/div[1]/section/section/section/section/div/div/h1/span")
    protected WebElement newsRoomText;

    public NewsRoomPage(WebDriver driver) {
        super(driver);
    }

    public void selectNewsRoom() {
        pause(3);
        waitForTheElementToBeVisible(newsRoomLink);
        newsRoomLink.click();
    }

    public String getText() {
        waitForTheElementToBeVisible(newsRoomText);
        return newsRoomText.getText();
    }
}
