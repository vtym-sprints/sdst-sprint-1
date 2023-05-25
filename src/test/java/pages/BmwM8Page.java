package pages;

import elements.BmwElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.scrollToElement;

public class BmwM8Page extends BmwElements {
    public BmwM8Page(WebDriver driver) {
        super(driver);
    }

    public BmwM8Page scrollToBmwM8() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_M8_BUTTON), driver);
        return this;
    }

    public BmwM8Page clickSelectBmwM8() {
        waitUntilElementToBeClickableByXpath(SELECT_BMW_M8).click();
        return this;
    }

    public BmwM8Page clickCustomizeThisBuildButton() {
        waitUntilElementToBeClickableByXpath(CUSTOMIZE_BUTTON).click();
        return this;
    }

    public WebElement getTextBmwM850i() {
        return waitUntilElementToBeVisibleByXpath(TEXT_BMW_M8);
    }

    public BmwM8Page clickNextWheelsButton() {
        waitUntilElementToBeClickableByXpath(NEXT_WHEELS_BUTTON).click();
        return this;
    }
    public BmwM8Page clickUpholsteryButton() {
        waitUntilElementToBeClickableByXpath(NEXT_UPHOLSTERY_BUTTON).click();
        return this;
    }
    public BmwM8Page clickTrimButton() {
        waitUntilElementToBeClickableByXpath(NEXT_TRIM_BUTTON).click();
        return this;
    }
    public BmwM8Page clickOptionsButton() {
        waitUntilElementToBeClickableByXpath(NEXT_OPTIONS_BUTTON).click();
        return this;
    }
    public WebElement getSumCars() {
        return waitUntilElementToBeVisibleByXpath(SUM_CARS);
    }
    public WebElement getTextM8Competition() {
        return waitUntilElementToBeVisibleByXpath(TEXT_M8_COMPETITION);
    }
    public BmwM8Page clickNextSummaryButton() {
         waitUntilElementToBeClickableByXpath(NEXT_SUMMARY_BUTTON).click();
         return this;
    }
}
