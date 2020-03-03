package com.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class BrowserstackMainPage {
    @FindBy(css = "a[title='BrowserStack'] > .w-svg")
    private WebElement headerLogoButton;

    @FindBy(css = ".col-xs-5.dropdown-section.no-pad  a[title='Live'] > .dropdown-link-text")
    private WebElement productsDropDownMenu;

    @FindBy(tagName = "h1")
    private WebElement topBenefits;

    @FindBy(xpath = "/html//body[@id='home-page']/div[@class='wrapper']/main[@role='main']/section/article//article[@class='hero-unit hero-unit--v2']//div[@class='col-xs-12 no-pad-sm']/div[1]/p")
    private WebElement topDescription;

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


    @FindBy(css = "h3")
    private WebElement customersGlobally;

    @FindBy(css = "[class='feature-container feature-container--3-columns '] h2")
    private WebElement benefitsTitle;

    @FindBy(css = ".bg-secondary.feature-container.feature-container--3-columns  h2")
    private WebElement customersStories;

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

    @FindBy(css = "li:nth-of-type(1) > blockquote > p:nth-of-type(1)")
    private WebElement blockQuote;

    @FindBy(css = ".integration-section__title")
    private WebElement browserstackIntegrationTitle;

    @FindBy(css = ".call-to-action .row:nth-of-type(1) [class] .text-center")
    private WebElement getStartFreeTrialText;

    @FindBy(css = ".bg-inverse.footer-habitat p")
    private WebElement copyrightText;


    public BrowserstackMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickHeaderLogoButton() {
        headerLogoButton.click();
    }

    public void checkTopBenefitsTextSize(String value) {
        Assert.assertEquals(topBenefits.getCssValue("font-size"), value);
    }

    public void checkTopBenefitsTextColor(String value) {
        Assert.assertEquals(topBenefits.getCssValue("color"), value);
    }

    public void checkTopDescriptionSize(String value) {
        Assert.assertEquals(topDescription.getCssValue("font-size"), value);
    }

    public void checkTopDescriptionColor(String value) {
        Assert.assertEquals(topDescription.getCssValue("color"), value);
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

    public void checkCustomersGloballyTextSize(String value) {
        Assert.assertEquals(customersGlobally.getCssValue("font-size"), value);
    }

    public void checkCustomersGloballyTextColor(String value) {
        Assert.assertEquals(customersGlobally.getCssValue("color"), value);
    }

    public void checkBenefitsTitleSize(String value) {
        Assert.assertEquals(benefitsTitle.getCssValue("font-size"), value);
    }

    public void checkBenefitsTitleColor(String value) {
        Assert.assertEquals(benefitsTitle.getCssValue("color"), value);
    }

    public void checkCustomersStoriesTitleSize(String value) {
        Assert.assertEquals(customersStories.getCssValue("font-size"), value);
    }

    public void checkCustomersStoriesTitleColor(String value) {
        Assert.assertEquals(customersStories.getCssValue("color"), value);
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

    public void checkBlockQuoteSize(String value) {
        Assert.assertEquals(blockQuote.getCssValue("font-size"), value);
    }

    public void checkBlockQuoteColor(String value) {
        Assert.assertEquals(blockQuote.getCssValue("color"), value);
    }

    public void checkBrowserStackIntegrationTitleSize(String value) {
        Assert.assertEquals(browserstackIntegrationTitle.getCssValue("font-size"), value);
    }

    public void checkBrowserStackIntegrationTitleColor(String value) {
        Assert.assertEquals(browserstackIntegrationTitle.getCssValue("color"), value);
    }

    public void checkGetStartFreeTrialTextSize(String value) {
        Assert.assertEquals(getStartFreeTrialText.getCssValue("font-size"), value);
    }

    public void checkGetStartFreeTrialTextColor(String value) {
        Assert.assertEquals(getStartFreeTrialText.getCssValue("color"), value);
    }

    public void checkCopyrightTextSize(String value) {
        Assert.assertEquals(copyrightText.getCssValue("font-size"), value);
    }

    public void checkCopyrightTextColor(String value) {
        Assert.assertEquals(copyrightText.getCssValue("color"), value);
    }


}
