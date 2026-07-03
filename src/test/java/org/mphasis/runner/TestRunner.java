package org.mphasis.runner;

import io.qameta.allure.testng.AllureTestNg;
import org.mphasis.base.BaseTest;
import org.mphasis.csr.CsrPageTest;
import org.mphasis.investors.InvestorsPageTest;
import org.mphasis.newsroom.NewsRoomPage;
import org.testng.TestNG;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.addListener(new AllureTestNg());
        testng.setTestClasses(new Class[]{InvestorsPageTest.class, NewsRoomPage.class, CsrPageTest.class});
        testng.run();
    }
}

