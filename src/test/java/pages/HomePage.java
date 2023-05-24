package pages;

import elements.HomePageElements;
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

    public HomePage clickBuildYourOwnBtn () {
        waitUntilElementToBeClickableByXpath(BUILD_OWN_BTN).click();
        return this;
    }

    public HomePage clickDismissBtn() {
        waitUntilElementToBeClickableByXpath(CLICK_DISMISS_BTN).click();
        return this;
    }
}
