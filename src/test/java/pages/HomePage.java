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

    public BuildYourOwnPage clickBuildYourOwnBtn() {
        waitUntilElementToBeClickableByXpath(BUILD_YOUR_OWN_FIELD).click();
        return new BuildYourOwnPage(driver);
    }

    public BuildYourOwnPage clickDismissBtn() {
        waitUntilElementToBeClickableByXpath(DISMISS_COOKIES_BTN).click();
        return new BuildYourOwnPage(driver);
    }

    public BuildYourOwnPage modelsField() {
        waitUntilElementToBeClickableByXpath(MODELS_FIELD).click();
        return new BuildYourOwnPage(driver);
    }

    public HomePage closeAndSwitchToHomePage() {
        driver.close();
        goToNextTab(1);
        return this;
    }
}