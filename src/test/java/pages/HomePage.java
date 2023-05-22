package pages;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.jsClick;
import static base.CommonActions.scrollToElement;


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


    public ShopPreOwnedInventoryPage clickPreOwnedInventory(){
        scrollToElement(waitUntilElementToBeClickableByXpath(FOOTER_MENU),driver);
        waitUntilElementToBeClickableByXpath(PRE_OWNED_INVENTORY).click();

        return new ShopPreOwnedInventoryPage(driver);
    }

    public HomePage dismissPopup() {
        jsClick(waitUntilPresenceOfElementByXpath(GLOBAL_POPUP_DISMISS_BTN_SEL), driver);
        return this;
    }

}
