package org.mphasis.csr;

import org.mphasis.base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CsrPageTest extends BaseTest {
    @Test
    public void selectCsrPageTest() {
        CsrPage csrPage = PageFactory.initElements(driver, CsrPage.class);
        csrPage.selectCsrLink();
        pause(5);
        Assert.assertEquals(csrPage.getText(), "THE POWER OF TRANSFORMATION");
    }
}
