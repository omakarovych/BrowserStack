package com.browserstack.tests;

import com.browserstack.BrowserstackMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BrowserstackMainPageTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Chromdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void browserstackTest() {

        driver.get("https://www.browserstack.com/");

        BrowserstackMainPage browserstackMainPage = new BrowserstackMainPage(driver);

        browserstackMainPage.clickSignUpButton();
        driver.navigate().back();

        browserstackMainPage.clickLiveButton();
        driver.navigate().back();

        browserstackMainPage.clickAutomateButton();
        driver.navigate().back();

        browserstackMainPage.clickAppLiveButton();
        driver.navigate().back();

        browserstackMainPage.clickAppAutomateButton();
        driver.navigate().back();

        browserstackMainPage.clickOlxFeatureBlock();
        driver.navigate().back();

        browserstackMainPage.clickGoodPxBlock();
        driver.navigate().back();

        browserstackMainPage.clickCarousellBlock();
        driver.navigate().back();

        browserstackMainPage.clickAirtaskerBlock();
        driver.navigate().back();

        browserstackMainPage.clickLogikcullBlock();
        driver.navigate().back();

        browserstackMainPage.clickApptioBlock();
        driver.navigate().back();

        driver.close();
    }

}
