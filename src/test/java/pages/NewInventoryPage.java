package pages;

import elements.NewInventoryElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static base.CommonActions.replacePrice;
import static java.lang.Integer.parseInt;

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

    public List<WebElement> getCardsPricesElementsList() {
        return waitUntilPresenceOfAllElementsByXpath(CARDS_PRICES_LIST);
    }

    public List<Integer> getCardsPricesList() {
        List<Integer> outputList = new ArrayList<>();
        getCardsPricesElementsList().forEach(element -> {
            outputList.add(parseInt(replacePrice(element)));
        });
        return outputList;
    }

    public NewInventoryPage setPriceFilterMin60k() {
        getCardsPricesElementsList();
        getPriceFilterContainer().click();
        getPriceFilterMinLister().click();
        getPriceFilterMin60k().click();
        isTillLoader();
        return this;
    }
}
