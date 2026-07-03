package org.mphasis.newsroom;

import org.mphasis.base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewsRoomPageTest extends BaseTest {
    @Test(priority = 1)
    public void selectNewsRoomPageTest() {
        NewsRoomPage newsRoomPage = PageFactory.initElements(driver, NewsRoomPage.class);
        newsRoomPage.selectNewsRoom();
        pause(5);
        Assert.assertEquals(newsRoomPage.getText(),"NEWS ROOM");
    }
}
