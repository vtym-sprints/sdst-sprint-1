package pages;

import elements.FindCarsElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.scrollToElement;

public class FindCarsPage extends FindCarsElements {
    public FindCarsPage(WebDriver driver) {
        super(driver);
    }

    public FindCarsPage inputZipCode() {
        waitUntilElementToBeVisibleByXpath((INPUT_ZIP_CODE)).sendKeys("90001");
        return this;
    }

    public FindCarsPage clickShopNewButton() {
        waitUntilElementToBeClickableByXpath(SHOP_NEW_BUTTON).click();
        return this;
    }
    public FindCarsPage inputZipCodeNewPage() {
        waitUntilElementToBeVisibleByXpath((INPUT_ZIP_CODE_NEW_PAGE)).sendKeys("90001");
        return this;
    }
    public FindCarsPage clickShopNow() {
        waitUntilElementToBeClickableByXpath(SHOP_NOW).click();
        return this;
    }

    public FindCarsPage clickSelectButton() {
        waitUntilElementToBeClickableByXpath(SELECT_BUTTON).click();
        return this;
    }
    public FindCarsPage clickSeriesButton() {
        waitUntilElementToBeClickableByXpath(SERIES_BUTTON).click();
        return this;
    }
    public FindCarsPage click5SeriesButton() {
        waitUntilElementToBeVisibleByXpath(SERIES_5_BUTTON).click();
        return this;
    }
    public FindCarsPage scrollToExterier() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_TO_EXTERIER), driver);
        return this;
    }
    public FindCarsPage clickExterierColorButton() {
        waitUntilElementToBeClickableByXpath(EXTERIER_BUTTON).click();
        return this;
    }
    public FindCarsPage clickColorBlackButton() {
        waitUntilElementToBeClickableByXpath(BLACK_COLOR_BUTTON).click();
        return this;
    }
    public FindCarsPage clickOptionsButton() {
        waitUntilElementToBeClickableByXpath(OPTIONS_BUTTON).click();
        return this;
    }
    public FindCarsPage clickMSportButton() {
        waitUntilElementToBeClickableByXpath(M_SPORT_BUTTON).click();
        return this;
    }
    public FindCarsPage clickBuildMyDealButton() {
        waitUntilElementToBeClickableByXpath(BUILD_MY_DEAL_BUTTON).click();
        return this;
    }
    public FindCarsPage clickContinueButton() {
        waitUntilElementToBeClickableByXpath(CONTINUE_BUTTON).click();
        return this;
    }
    public FindCarsPage clickSendEstimateButton() {
        waitUntilElementToBeClickableByXpath(SEND_ESTIMATE_BUTTON).click();
        return this;
    }
    public WebElement textBmwSedan() {
        return waitUntilElementToBeVisibleByXpath(TEXT_BMW_SEDAN);
    }
}
