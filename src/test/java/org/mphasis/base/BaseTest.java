package org.mphasis.base;

import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({AllureTestNg.class})
public class BaseTest {
    protected static WebDriver driver;

    @BeforeSuite
    public void login() {
        driver = new ChromeDriver();
        driver.get("https://www.mphasis.com/home.html");
        driver.manage().window().maximize();
    }

    public void pause(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
//    @AfterSuite
//    public void afterTest() {
//        driver.quit();
//    }
}
