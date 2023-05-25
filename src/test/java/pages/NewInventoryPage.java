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

    public WebElement getSortRulesDropdown() {
        return waitUntilElementToBeClickableByXpath(SORT_RULES_DROPDOWN);
    }

    public WebElement getSortingRulePriceAscending() {
        return waitUntilElementToBeClickableByXpath(SORT_RULE_PRICE_ASCENDING);
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

    public List<WebElement> getCardsSeriesElementsList() {
        return waitUntilPresenceOfAllElementsByXpath(CARDS_SERIES_LIST);
    }

    public List<WebElement> getCardsModelsElementsList() {
        return waitUntilPresenceOfAllElementsByXpath(CARDS_MODEL_LIST);
    }

    public List<WebElement> getCardsPricesElementsList() {
        return waitUntilPresenceOfAllElementsByXpath(CARDS_PRICES_LIST);
    }

    public List<String> getCardsSeriesList() {
        List<String> outputList = new ArrayList<>();
        getCardsSeriesElementsList().forEach(element -> {
            outputList.add(element.getText());
        });
        return outputList;
    }

    public List<String> getCardsModelsList() {
        List<String> outputList = new ArrayList<>();
        getCardsModelsElementsList().forEach(element -> {
            outputList.add(element.getText());
        });
        return outputList;
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

    public NewInventoryPage setSortingRulePriceAscending() {
        getCardsPricesElementsList();
        getSortRulesDropdown().click();
        getSortingRulePriceAscending().click();
        getCardsPricesElementsList();
        return this;
    }

    public void openFirstItemCardPage() {
        getCardsSeriesElementsList().get(0).click();
    }

    public boolean areCardsSortedByPriceAscending() {
        List<Integer> cardsPricesList = getCardsPricesList();
        for (int i = 1; i < cardsPricesList.size(); i++) {
            if (cardsPricesList.get(i) < cardsPricesList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
