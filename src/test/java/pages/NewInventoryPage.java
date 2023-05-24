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
        return waitUntilElementToBeClickableByXpath(FILTER_PRICE_CONTAINER);
    }

    public WebElement getPriceFilterMinLister() {
        return waitUntilElementToBeClickableByXpath(MIN_PRICE_LISTER);
    }

    public WebElement getPriceFilterMin60k() {
        return waitUntilElementToBeClickableByXpath(MIN_PRICE_60K);
    }

    public List<WebElement> getCardsPricesList() {
        return waitUntilPresenceOfAllElementsByXpath(CARDS_PRICES_LIST);
    }

    public NewInventoryPage setPriceFilterMin60k() {
        getPriceFilterContainer().click();
        getPriceFilterMinLister().click();
        getPriceFilterMin60k().click();
        isTillLoader();
        return this;
    }
}
