package pages;

import base.AbstractBasePage;
import elements.BmwElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static base.CommonActions.scrollToElement;

public class BmwM8Page extends BmwElements {
    public BmwM8Page(WebDriver driver) {
        super(driver);
    }
    public WebElement getSelectASeriesButton() {

        return waitUntilElementToBeClickableByXpath(SELECT_A_SERIES_BUTTON);
    }

    public BmwM8Page clickSelectASeriesButton() {
        getSelectASeriesButton().click();
        return this;
    }
    public WebElement getBmwMButton() {

        return waitUntilElementToBeClickableByXpath(BMW_M_BUTTON);
    }

    public BmwM8Page clickBmwMButton() {
        getBmwMButton().click();
        return this;
    }
    public BmwM8Page scrollBmwM8Select() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_M8_BUTTON), driver);
        return this;
    }

    public WebElement getBmwM9CoupeButton() {

        return waitUntilElementToBeClickableByXpath(BMW_M8_COUPE_BUTTON);
    }

    public BmwM8Page clickBmwM8CoupeButton() {
        getBmwM9CoupeButton().click();
        return this;
    }

    public BmwM8Page clickCustomizeThisBuildButton() {
        waitUntilElementToBeClickableByXpath(CUSTOMIZE_BUTTON).click();
        return this;
    }
}
