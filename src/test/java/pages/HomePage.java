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

    public HomePage closePopup() {
        jsClick(waitUntilPresenceOfElementByXpath(POPUP), driver);

        return this;
    }

    public HomePage clickSearchBtn() {
        waitUntilPresenceOfElementByXpath(SEARCH_BTN).click();

        return this;
    }

    public SearchResultElements enterSearchInfo(String info) {
        waitUntilElementToBeVisibleByXpath(SEARCH_FIELD).sendKeys(info);
        waitUntilElementToBeVisibleByXpath(SEARCH_FIELD).sendKeys(Keys.ENTER);

        return new SearchResultPage(driver);
    }
}
