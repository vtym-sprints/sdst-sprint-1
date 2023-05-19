package pages;

import elements.BuildYourOwnElements;
import org.openqa.selenium.WebDriver;

public class BuildYourOwnPage extends BuildYourOwnElements {
    public BuildYourOwnPage (WebDriver driver) {
        super(driver);
    }

    public BuildYourOwnPage selectx6MSportsActivityCoupeBtn() {
        waitUntilElementToBeClickableByXpath(X6_M_SPORTS_ACTIVITY_COUPE_SELECT).click();
        return this;
    }

    public BuildYourOwnPage customizeThisBuildBtn() {
        waitUntilElementToBeClickableByXpath(CUSTOMIZE_YOUR_BUILD).click();
        return this;
    }

    public BuildYourOwnPage selectColorTanzanite() {
        waitUntilElementToBeClickableByXpath(COLOR_BLACK_METAL).click();
        return this;
    }

    public BuildYourOwnPage pressNextWheelsBtn() {
        waitUntilElementToBeClickableByXpath(NEXT_WHEELS_BTN).click();
        return this;
    }

    public BuildYourOwnPage selectWheels21Inches() {
        waitUntilElementToBeClickableByXpath(WHEELS_21_INCHES).click();
        return this;
    }

    public BuildYourOwnPage pressNextUpholstery() {
        waitUntilElementToBeClickableByXpath(NEXT_UPHOLSTERY_BTN).click();
        return this;
    }

    public BuildYourOwnPage selectLeatherColorCognac() {
        waitUntilElementToBeClickableByXpath(LEATHER_COLOR_COGNAC).click();
        return this;
    }

    public BuildYourOwnPage selectX4BlackAlcantara() {
        waitUntilElementToBeClickableByXpath(X4_BLACK_ALCANTARA).click();
        return this;
    }

    public BuildYourOwnPage selectX4SmokeGrey() {
        waitUntilElementToBeClickableByXpath(X4_SMOKE_GREY).click();
        return this;
    }

    public BuildYourOwnPage pressNextTrimBtn() {
        waitUntilElementToBeClickableByXpath(NEXT_TRIM_BTN).click();
        return this;
    }

    public BuildYourOwnPage selectTrimGlossWood() {
        waitUntilElementToBeClickableByXpath(TRIM_GLOSS_WOOD).click();
        return this;
    }

    public BuildYourOwnPage pressNextOptionsBtn() {
        waitUntilElementToBeClickableByXpath(NEXT_OPTIONS_BTN).click();
        return this;
    }

    public BuildYourOwnPage pressNextSummaryBtn() {
        waitUntilElementToBeClickableByXpath(NEXT_SUMMARY_BTN).click();
        return this;
    }

    public BuildYourOwnPage checkTotalPrice() {
        waitUntilElementToBeClickableByXpath(TOTAL_PRICE_CHECK).click();
        return this;
    }

    public BuildYourOwnPage closeModalWindow() {
        waitUntilElementToBeClickableByXpath(MODAL_WINDOW_CLOSE_BTN).click();
        return this;
    }

    public BuildYourOwnPage selectX5MSports() {
        waitUntilElementToBeClickableByXpath(X5_M_SPORTS_SELECT).click();
        return this;
    }

    public BuildYourOwnPage selectX5MCompetition() {
        waitUntilElementToBeClickableByXpath(X5_M_COMPETITION).click();
        return this;
    }

    public String checkName() {
        return waitUntilElementToBeClickableByXpath(CHECK_NAME).getText();
    }

    public String checkPrise() {
        return waitUntilElementToBeClickableByXpath(CHECK_PRICE).getText();
    }

    public BuildYourOwnPage selectX4MSports() {
        waitUntilElementToBeClickableByXpath(X4_M_SPORTS_SELECT).click();
        return this;
    }

    public BuildYourOwnPage closeModalZip() {
        waitUntilElementToBeClickableByXpath(MODAL_ZIP_CLOSE).click();
        return this;
    }

    public BuildYourOwnPage clickX4MPerformance() {
        waitUntilElementToBeClickableByXpath(X4M_PERFORMANCE_BTN).click();
        return this;
    }

    public BuildYourOwnPage selectX4M() {
        waitUntilElementToBeVisibleByXpath(X4_M_SELECT).click();
        return this;
    }

    public BuildYourOwnPage pressNextColor() {
        waitUntilElementToBeClickableByXpath(NEXT_COLOR_BTN).click();
        return this;
    }

    public BuildYourOwnPage selectX4AlpineWhiteColor() {
        waitUntilElementToBeClickableByXpath(X4_ALPINE_WHITE_COLOR).click();
        return this;
    }

    public BuildYourOwnPage pressNextAccessories() {
        waitUntilElementToBeClickableByXpath(NEXT_ACCESSORIES).click();
        return this;
    }

    public BuildYourOwnPage choosingXM() {
        waitUntilElementToBeClickableByXpath(XM_CHOOSING).click();
        return this;
    }

    public BuildYourOwnPage xmBuildOwn() {
        waitUntilElementToBeClickableByXpath(XM_BUILD_OWN).click();
        return this;
    }

    public BuildYourOwnPage xmWhiteColor() {
        waitUntilElementToBeClickableByXpath(XM_WHITE_COLOR).click();
        return this;
    }
}
