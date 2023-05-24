package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import elements.HomePageElements;

import static base.CommonActions.jsClick;
import static base.CommonActions.scrollToElement;

public class HomePage extends HomePageElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String CARS_IN_AVAILABILITY = "//a[@id='button-f4e1544f40'] ";

    public WebElement getModelsButton() {
        return waitUntilElementToBeClickableByXpath(MODELS_BUTTON);
    }

    public WebElement getCarsInAvailabilityButton() {
        return waitUntilElementToBeClickableByXpath(CARS_IN_AVAILABILITY);
    }

    public WebElement getShopInventoryButton() {
        return waitUntilElementToBeClickableByXpath(SHOP_INVENTORY_BUTTON);
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

    public HomePage clickModelsButton() {
        getModelsButton().click();
        return this;
    }

    public HomePage clickBuildYourOwnButton() {
        waitUntilElementToBeClickableByXpath(BUILD_YOUR_OWN_BUTTON).click();
        return this;
    }

    public HomePage clickShopInventoryButton() {
        getShopInventoryButton().click();
        return this;
    }
}
