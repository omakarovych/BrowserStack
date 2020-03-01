package com.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserstackMainPage {

    @FindBy(id = "signupModalButton")
    private WebElement signUpButton;

    @FindBy(xpath = "/html//body[@id='home-page']/div[@class='wrapper']/main[@role='main']/section/article/div/div/div[@class='vc_column-inner']//article[@class='hero-unit hero-unit--v2']//a[@title='Live']")
    private WebElement liveButton;

    @FindBy(xpath = "/html//body[@id='home-page']/div[@class='wrapper']/main[@role='main']/section/article/div/div/div[@class='vc_column-inner']//article[@class='hero-unit hero-unit--v2']//a[@title='Automate']")
    private WebElement automateButton;

    @FindBy(xpath = "/html//body[@id='home-page']/div[@class='wrapper']/main[@role='main']/section/article/div/div/div[@class='vc_column-inner']//article[@class='hero-unit hero-unit--v2']//a[@title='App Live']")
    private WebElement appLiveButton;

    @FindBy(xpath = "/html//body[@id='home-page']/div[@class='wrapper']/main[@role='main']/section/article/div/div/div[@class='vc_column-inner']//article[@class='hero-unit hero-unit--v2']//a[@title='App Automate']")
    private WebElement appAutomateButton;

    @FindBy(xpath = "/html//div[@id='homepage-casestudies']//div[@class='wpb_wrapper']/article[1]//a[@href='/case-study/olx-delivers-seamless-experiences-for-a-localized-global-audience?ref=customers-page-leanix']/div[@class='feature__card-layout-wrap']")
    private WebElement featureBlock1;

    @FindBy(xpath = "/html//div[@id='homepage-casestudies']//div[@class='wpb_wrapper']/article[1]//a[@href='/case-study/quality-engineering-team-at-goodrx-cuts-testing-time-by-90-to-release-daily-15x?ref=customers-page-groupm']/div[@class='feature__card-layout-wrap']")
    private WebElement featureBlock2;

    @FindBy(xpath = "/html//div[@id='homepage-casestudies']//div[@class='wpb_wrapper']/article[1]//a[@href='/case-study/carousell-scales-app-automation-with-browserstack?ref=customers-page-carousell']/div[@class='feature__card-layout-wrap']")
    private WebElement featureBlock3;

    @FindBy(xpath = "/html//div[@id='homepage-casestudies']//div[@class='wpb_wrapper']/article[1]//a[@href='/case-study/airtasker?ref=customers-page-airtasker']/div[@class='feature__card-layout-wrap']")
    private WebElement featureBlock4;

    @FindBy(xpath = "/html//div[@id='homepage-casestudies']//div[@class='wpb_wrapper']/article[1]//a[@href='/case-study/logikcull']/div[@class='feature__card-layout-wrap']")
    private WebElement featureBlock5;

    @FindBy(xpath = "/html//div[@id='homepage-casestudies']//div[@class='wpb_wrapper']/article[1]//a[@href='/case-study/apptio-eliminates-testing-bottleneck-to-scale-with-rapid-customer-growth?ref=customers-page-apptio']/div[@class='feature__card-layout-wrap']")
    private WebElement featureBlock6;


    public BrowserstackMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickLiveButton() {
        liveButton.click();
    }

    public void clickAutomateButton() {
        automateButton.click();
    }

    public void clickAppLiveButton() {
        appLiveButton.click();
    }

    public void clickAppAutomateButton() {
        appAutomateButton.click();
    }

    public void clickOlxFeatureBlock() {
        featureBlock1.click();
    }

    public void clickGoodPxBlock() {
        featureBlock2.click();
    }

    public void clickCarousellBlock() {
        featureBlock3.click();
    }

    public void clickAirtaskerBlock() {
        featureBlock4.click();
    }

    public void clickLogikcullBlock() {
        featureBlock5.click();
    }

    public void clickApptioBlock() {
        featureBlock6.click();
    }
}
