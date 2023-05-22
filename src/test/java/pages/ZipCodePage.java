package pages;

import elements.ZipCodeElements;
import org.openqa.selenium.WebDriver;

public class ZipCodePage extends ZipCodeElements {
    public ZipCodePage(WebDriver driver) {
        super(driver);
    }

    public ShopPreOwnedInventoryPage choseZipCode(String zip){
        waitUntilPresenceOfElementByXpath(ZIP_INPUT_FIELD).sendKeys(zip);
        waitUntilElementToBeClickableByXpath(SHOP_NOW_BTN).click();

        return new ShopPreOwnedInventoryPage(driver);
    }
}
