package pages;

import base.AbstractBasePage;
import elements.HomeElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String CARS_IN_AVAILABILITY = "//a[@id='button-f4e1544f40'] ";

    public WebElement getCarsInAvailabilityButton() {
        return waitUntilElementToBeClickableByXpath(CARS_IN_AVAILABILITY);
    }

    public HomePage clickCarsInAvailability() {
        getCarsInAvailabilityButton().click();
        return this;
    }
    public BuildYourOwnPage clickBuildYourOwnBtn(){
        waitUntilElementToBeClickableByXpath(BUILD_YOUR_OWN_FIELD).click();
        return new BuildYourOwnPage(driver);
    }
    public BuildYourOwnPage clickDismissBtn() {
        waitUntilElementToBeClickableByXpath(DISMISS_COOKIES_BTN).click();
        return new BuildYourOwnPage(driver);
    }

    public BuildYourOwnPage modelsFileld() {
        waitUntilElementToBeClickableByXpath(MODELS_FIELD).click();
        return new BuildYourOwnPage(driver);
    }
}
