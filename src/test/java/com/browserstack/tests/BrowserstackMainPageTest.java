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
    public void browserStackMainMenuTest() {
        driver.get("https://www.browserstack.com/");

        BrowserstackMainPage browserstackMainPage = new BrowserstackMainPage(driver);

        browserstackMainPage.clickHeaderLogoButton();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickLiveMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickAutomateMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickAppLiveMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickAppAutomateMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickIntegrationMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickEnterpriseMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickScreenshotsMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickProductMenuButton();
        browserstackMainPage.clickResponsiveMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickDevelopersMenuButton();
        browserstackMainPage.clickDocumentationMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickDevelopersMenuButton();
        browserstackMainPage.clickSupportMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickDevelopersMenuButton();
        browserstackMainPage.clickStatusMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickDevelopersMenuButton();
        browserstackMainPage.clickReleaseNotesMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickDevelopersMenuButton();
        browserstackMainPage.clickOpenSourceMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickSolutionsMenuButton();
        browserstackMainPage.clickFunctionalTestingMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickSolutionsMenuButton();
        browserstackMainPage.clickRealUserConditionTestingMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickSolutionsMenuButton();
        browserstackMainPage.clickRegressionTestingMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickSolutionsMenuButton();
        browserstackMainPage.clickGeolocationTestingMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickSolutionsMenuButton();
        browserstackMainPage.clickTestInLocalEnvironmentsMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickPricingMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickSignInMenuButton();
        driver.navigate().back();

        browserstackMainPage.clickFreeTrialMenuButton();
        driver.navigate().back();

        driver.close();

    }

    @Test
    public void browserStackMainPageContentTest() {

        driver.get("https://www.browserstack.com/");

        BrowserstackMainPage browserstackMainPage = new BrowserstackMainPage(driver);

        browserstackMainPage.checkTopBenefitsTextSize("60px");
        browserstackMainPage.checkTopBenefitsTextColor("rgba(51, 51, 51, 1)");

        browserstackMainPage.checkTopDescriptionSize("21px");
        browserstackMainPage.checkTopDescriptionColor("rgba(51, 51, 51, 1)");

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

        browserstackMainPage.checkCustomersGloballyTextSize("28px");
        browserstackMainPage.checkCustomersGloballyTextColor("rgba(51, 51, 51, 1)");

        browserstackMainPage.checkBenefitsTitleSize("45px");
        browserstackMainPage.checkBenefitsTitleColor("rgba(51, 51, 51, 1)");

        browserstackMainPage.checkCustomersStoriesTitleSize("45px");
        browserstackMainPage.checkCustomersStoriesTitleColor("rgba(51, 51, 51, 1)");

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

        browserstackMainPage.checkBlockQuoteSize("28px");
        browserstackMainPage.checkBlockQuoteColor("rgba(255, 255, 255, 1)");

        browserstackMainPage.checkBrowserStackIntegrationTitleSize("38px");
        browserstackMainPage.checkBrowserStackIntegrationTitleColor("rgba(51, 51, 51, 1)");

        browserstackMainPage.checkGetStartFreeTrialTextSize("45px");
        browserstackMainPage.checkGetStartFreeTrialTextColor("rgba(51, 51, 51, 1)");

        browserstackMainPage.checkCopyrightTextSize("12px");
        browserstackMainPage.checkCopyrightTextColor("rgba(255, 255, 255, 1)");

        driver.close();
    }

}
