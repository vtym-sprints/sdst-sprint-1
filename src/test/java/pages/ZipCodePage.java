package pages;

import elements.ZipCodeElements;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class ZipCodePage extends ZipCodeElements {

    public ZipCodePage(WebDriver driver) {
        super(driver);
    }

    public WebElement selectDealer() {
        return waitUntilElementToBeClickableByXpath(SELECT_ZIP_BTN);
    }

    public ShopPreOwnedInventoryPage choseZipCode(String zip) {
        waitUntilPresenceOfElementByXpath(ZIP_INPUT_FIELD).sendKeys(zip);
        waitUntilElementToBeClickableByXpath(SHOP_NOW_BTN).click();
        selectDealer().click();
        return new ShopPreOwnedInventoryPage(driver);
    }

    @SneakyThrows
    public ZipCodePage chooseZipCodeWithNoDealerPick(String zip) {
        waitUntilPresenceOfElementByXpath(ZIP_INPUT_FIELD).sendKeys(zip);
        waitUntilElementToBeClickableByXpath(SHOP_NOW_BTN).click();
        sleep(100);
        if (driver.getCurrentUrl().contains("zip")) {
            selectDealer().click();
        }
        return this;
    }
}
