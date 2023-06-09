package pages;

import elements.ShopPreOwnedInventoryElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static base.CommonActions.*;
import static base.RandomUtils.randomNum;
import static java.lang.Integer.parseInt;

public class ShopPreOwnedInventoryPage extends ShopPreOwnedInventoryElements {

    public ShopPreOwnedInventoryPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getModelYearFilterContainer() {
        return waitUntilElementToBeClickableByXpath(FILTER_MODEL_YEAR_CONTAINER);
    }

    public WebElement getModelYearFilterMaxLister() {
        return waitUntilElementToBeClickableByXpath(MAX_MODEL_YEAR_LISTER);
    }

    public WebElement getModelYearFilterMax2015() {
        return waitUntilElementToBeClickableByXpath(MAX_MODEL_YEAR_2015);
    }

    public List<WebElement> getCardsNamesElementsList() {
        return waitUntilPresenceOfAllElementsByXpath(CARDS_NAMES_LIST);
    }

    public List<Integer> getCardsModelYearsList() {
        List<Integer> outputList = new ArrayList<>();
        getCardsNamesElementsList().forEach(element -> {
            outputList.add(parseInt(element.getText().substring(0, 4)));
        });
        return outputList;
    }

    public ShopPreOwnedInventoryPage chosePreOwned() {
        waitUntilElementToBeClickableByXpath(PRE_OWNED_CB).click();
        return new ShopPreOwnedInventoryPage(driver);
    }

    public ShopPreOwnedInventoryPage clickBodyStyleFilter() {
        var bodyStyleFilter = waitUntilElementToBeClickableByXpath(FILTER_BODY_STYLE_BTN);
        scrollToElement(bodyStyleFilter, driver);
        bodyStyleFilter.click();
        return this;
    }

    public ShopPreOwnedInventoryPage setModelYearFilterMax2015() {
        getCardsNamesElementsList();
        getModelYearFilterContainer().click();
        getModelYearFilterMaxLister().click();
        getModelYearFilterMax2015().click();
        waitTillCircleLoaderDisappear();
        return this;
    }

    public WebElement choseRandomBodyStyle() {
        WebElement randomStyle = null;
        List<WebElement> styles = waitUntilPresenceOfAllElementsByXpath(ONE_OF_BODY_STYLE);
        if (styles.size() > 0) {
            int randomIndex = randomNum(styles.size());
            randomStyle = styles.get(randomIndex);
        } else {
            System.out.println("No elements found with the specified locator!");
        }
        return randomStyle;
    }

    public ShopPreOwnedInventoryPage clickBodyStyle(WebElement style) {
        style.click();
        return new ShopPreOwnedInventoryPage(driver);
    }

    public String getNameBodyStyle(WebElement style) {
        return style.getText().trim();
    }

    public ShopPreOwnedInventoryPage scrollToPriceFilter() {
        scrollToElement(waitUntilElementToBeClickableByXpath(FILTER_PRICE_BTN), driver);
        return this;
    }

    public ShopPreOwnedInventoryPage clickPriceFilter() {
        waitUntilElementToBeClickableByXpath(FILTER_PRICE_BTN).click();
        return this;
    }

    public List<WebElement> getListMaxPrice() {
        return waitUntilPresenceOfAllElementsByXpath(MAX_PRICE_LI);
    }

    public List<WebElement> getListMinPrice() {
        return waitUntilPresenceOfAllElementsByXpath(MIN_PRICE_LI);
    }

    public WebElement getChooseMaxPrice() {
        return waitUntilPresenceOfElementByXpath(CHOOSE_MAX_PRICE);
    }

    public WebElement getChooseMinPrice() {
        return (waitUntilPresenceOfElementByXpath(CHOOSE_MIN_PRICE));
    }

    public ShopPreOwnedInventoryPage chooseRandomMaxPrice() {
        List<WebElement> prices = getListMaxPrice();
        int maxPriceSize = prices.size();
        int randomIndex = randomNum(maxPriceSize);
        jsClick(prices.get(randomIndex), driver);
        return this;
    }

    public ShopPreOwnedInventoryPage chooseRandomMinPrice() {
        List<WebElement> prices = getListMinPrice();
        int minPriceSize = prices.size();
        int randomIndex = randomNum(minPriceSize);
        jsClick(prices.get(randomIndex), driver);
        return this;
    }

    public List<Integer> getProductsPrices() {
        List<Integer> prices = new ArrayList<>();
        List<WebElement> productPriceElements = waitUntilPresenceOfAllElementsByXpath(PRODUCT_PRICE);
        for (WebElement element : productPriceElements) {
            int price = parseInt(replacePrice(element));
            prices.add(price);
        }
        return prices;
    }

    public List<String> getFilterText() {
        List<String> filterNames = new ArrayList<>();
        List<WebElement> filters = waitUntilPresenceOfAllElementsByXpath(FILTER_BTN);
        for (WebElement element : filters) {
            String fullText = element.getText();
            String removeText = element.findElement(By.xpath(".//div")).getText();
            String filterName = fullText.replace(removeText, "").trim();
            filterNames.add(filterName);
        }
        return filterNames;
    }
}
