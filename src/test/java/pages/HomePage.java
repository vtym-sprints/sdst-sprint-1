package pages;

import elements.HomePageElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageElements {

    public HomePage(WebDriver driver) {
        super(driver);
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

    public HomePage clickButton(String nameButtonHeader) {
        waitUntilElementToBeClickableByXpath(nameButtonHeader).click();
        return this;
    }

    public HomePage sendKeysInFieldDealerNameOrZipCode(String nameOrZip) {
        waitUntilElementToBeClickableByXpath(FIELD_INPUT_ZIP_CODE_IN_SHOPPING).sendKeys(nameOrZip + Keys.ENTER);
        return this;
    }

    public HomePage selectDealerByNumber(String numberDealer) {
        waitUntilElementToBeClickableByXpath(String.format(BUTTON_SELECT_DEALER_BY_NUMBER, numberDealer)).click();
        return this;
    }

    public HomePage closeRightPopUp() {
        waitUntilElementToBeVisibleByXpath(CLOSE_RIGHT_POP_UP).click();
        return this;
    }

    public HomePage sendKeysZipCode(String zipCode) {
        waitUntilElementToBeClickableByXpath(SENDKEYS_ZIP_CODE).sendKeys(zipCode + Keys.ENTER);
        return this;
    }
}
