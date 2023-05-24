package pages;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.jsClick;
import static base.CommonActions.scrollToElement;

public class HomePage extends HomePageElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String CARS_IN_AVAILABILITY = "//a[@id='button-f4e1544f40'] ";

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

    public HomePage closeAndSwitchToHomePage() {
        driver.close();
        goToNextTab(1);
        return this;
    }

    public ShopPreOwnedInventoryPage clickPreOwnedInventory(){
        scrollToElement(waitUntilElementToBeClickableByXpath(FOOTER_MENU),driver);
        waitUntilElementToBeClickableByXpath(PRE_OWNED_INVENTORY).click();
        return new ShopPreOwnedInventoryPage(driver);
    }

    public HomePage clickBuildYourOwnButton() {
        waitUntilElementToBeClickableByXpath(BUILD_YOUR_OWN_BUTTON).click();
        return this;
    }

    public BuildYourOwnPage clickBuildYourOwnInFooter() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(FOOTER_MENU), driver);
        waitUntilElementToBeClickableByXpath(BUILD_YOUR_OWN).click();
        return new BuildYourOwnPage(driver);
    }
}
