package pages;

import elements.HomePageElements;
import elements.SearchResultElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.jsClick;

public class HomePage extends HomePageElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage dismissPopup() {
        jsClick(waitUntilPresenceOfElementByXpath(GLOBAL_POPUP_DISMISS_BTN_SEL), driver);
        return this;
    }

    public HomePage clickSearchBtn() {
        waitUntilPresenceOfElementByXpath(SEARCH_BTN).click();
        return this;
    }

    public SearchResultElements enterSearchInfo(String info) {
        var searchField = waitUntilElementToBeVisibleByXpath(SEARCH_FIELD);
        searchField.sendKeys(info);
        searchField.sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    public HomePage clickAndSwitchToFollowingPage(String locator) {
        waitUntilElementToBeClickableByXpath(locator).click();
        goToNextTab(2);
        return this;
    }

    public HomePage closeAndSwitchToHomePage() {
        driver.close();
        goToNextTab(1);
        return this;
    }
}
