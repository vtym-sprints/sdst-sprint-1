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

    public WebElement getModelsButton() {
        return waitUntilElementToBeClickableByXpath(MODELS_BUTTON);
    }

    public WebElement getCarsInAvailabilityButton() {
        return waitUntilElementToBeClickableByXpath(CARS_IN_AVAILABILITY);
    }

    public WebElement getShoppingButton() {
        return waitUntilElementToBeClickableByXpath(SHOPPING_BUTTON);
    }

    public WebElement getShopInventoryButton() {
        return waitUntilElementToBeClickableByXpath(SHOP_INVENTORY_BUTTON);
    }

    public WebElement getShoppingZipCodeField() {
        return waitUntilElementToBeVisibleByXpath(SHOPPING_ZIP_CODE_FIELD);
    }

    private WebElement getShopPreOwnedInShoppingTabButton() {
        return waitUntilElementToBeClickableByXpath(SHOP_PRE_OWNED_BUTTON_IN_SHOPPING_TAB);
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

    public HomePage clickModelsBtn() {
        waitUntilElementToBeClickableByXpath(MODELS_BTN).click();
        return this;
    }

    public HomePage closeAndSwitchToHomePage() {
        driver.close();
        goToNextTab(1);
        return this;
    }

    public ShopPreOwnedInventoryPage clickPreOwnedInventory() {
        scrollToElement(waitUntilElementToBeClickableByXpath(FOOTER_MENU), driver);
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

    public HomePage clickShoppingButton() {
        getShoppingButton().click();
        return this;
    }

    public HomePage clickShopInventoryButton() {
        getShopInventoryButton().click();
        return this;
    }

    public HomePage setZipCode(String zipCode) {
        getShoppingZipCodeField().sendKeys(zipCode);
        return this;
    }

    public HomePage clickShopPreOwnedButtonInShoppingTab() {
        getShopPreOwnedInShoppingTabButton().click();
        return this;
    }

    public HomePage clickBMWElectricButton() {
        waitUntilElementToBeClickableByXpath(PRESS_BMW_ELECTRIC_BTN).click();
        return this;
    }
}
