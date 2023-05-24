package pages;

import elements.NewInventoryElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewInventoryPage extends NewInventoryElements {

    public NewInventoryPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPriceFilterContainer() {
        return waitUntilElementToBeClickableByXpath(PRICE_FILTER_CONTAINER);
    }

    public WebElement getPriceFilterMinLister() {
        return waitUntilElementToBeClickableByXpath(MIN_PRICE_LISTER);
    }

    public WebElement getPriceFilterMin60k() {
        return waitUntilElementToBeClickableByXpath(MIN_PRICE_60K);
    }

    public List<WebElement> getCarPricesList() {
        return waitUntilPresenceOfAllElementsByXpath(CAR_PRICES);
    }

    public NewInventoryPage setPriceFilterMin60k() {
        getPriceFilterContainer().click();
        getPriceFilterMinLister().click();
        getPriceFilterMin60k().click();
        isTillLoader();
        return this;
    }
}
