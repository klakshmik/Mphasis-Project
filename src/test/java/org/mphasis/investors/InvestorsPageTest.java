package org.mphasis.investors;

import org.mphasis.base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InvestorsPageTest extends BaseTest {
    @Test(priority = 1)
    public void navigateToInvestorsPageTest() {
        InvestorsPage investorsPage = PageFactory.initElements(driver, InvestorsPage.class);
        investorsPage.navigateToInvestorsPage();
        pause(5);
        Assert.assertEquals(investorsPage.getText(),"INVESTORS");
    }

    

}
