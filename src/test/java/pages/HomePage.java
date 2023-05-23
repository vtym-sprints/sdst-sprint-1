package pages;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.jsClick;

public class HomePage extends HomePageElements {

    private static final String CARS_IN_AVAILABILITY = "//a[@id='button-f4e1544f40'] ";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCarsInAvailabilityButton() {
        return waitUntilElementToBeClickableByXpath(CARS_IN_AVAILABILITY);
    }

    public HomePage dismissPopup() {
        jsClick(waitUntilPresenceOfElementByXpath(GLOBAL_POPUP_DISMISS_BTN_SEL), driver);
        return this;
    }

    public HomePage clickCarsInAvailability() {
        getCarsInAvailabilityButton().click();
        return this;
    }

    public HomePage clickAndSwitchToFollowingPage(String locator) {
        waitUntilElementToBeClickableByXpath(locator).click();
        goToNextTab(2);
        return this;
    }

    public BuildYourOwnPage clickBuildYourOwnBtn() {
        waitUntilElementToBeClickableByXpath(BUILD_YOUR_OWN_BUTTON).click();
        return new BuildYourOwnPage(driver);
    }

    public BuildYourOwnPage clickDismissBtn() {
        waitUntilElementToBeClickableByXpath(GLOBAL_POPUP_DISMISS_BTN_SEL).click();
        return new BuildYourOwnPage(driver);
    }

    public HomePage clickModelsBtn() {
        waitUntilElementToBeClickableByXpath(MODELS_BTN).click();
        return this;
    }

    public HomePage closeAndSwitchToHomePage() {
        driver.close();
        goToNextTab(1);
        return this;
    }

    public HomePage clickBuildYourOwnButton() {
        waitUntilElementToBeClickableByXpath(BUILD_YOUR_OWN_BUTTON).click();
        return this;
    }
}
