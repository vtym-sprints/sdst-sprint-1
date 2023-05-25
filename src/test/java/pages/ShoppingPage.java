package pages;

import elements.ShoppingElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingPage extends ShoppingElements {

    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingPage clickFieldInFilter(String nameField) {
        waitUntilElementToBeClickableByXpath(String.format(FIELD_IN_FILTER_ON_SHOPPING_PAGE, nameField)).click();
        return this;
    }

    public ShoppingPage clickOnFieldInBodyStyle(String nameField) {
        waitUntilElementToBeClickableByXpath(String.format(SELECT_FIELD_IN_BODY_STYLE, nameField)).click();
        return this;
    }

    public ShoppingPage clickBoxMinOrMaxPrice(String numberBox) {
        waitUntilElementToBeClickableByXpath(String.format(BOX_MIN_MAX_IN_PRICE, numberBox)).click();
        return this;
    }

    public ShoppingPage clickPriceInMinAndMax(String priceValue) {
        waitUntilElementToBeClickableByXpath(String.format(SELECT_PRICE_IN_MIN_AND_MAX, priceValue)).click();
        return this;
    }

    public List<WebElement> allPriceOnShoppingPage() {
        return waitUntilElementsToBeVisibleByXpath(LIST_PRICE_ON_SHOPPING_PAGE);
    }

    public List<WebElement> getListNameParameterProducts() {
        return waitUntilElementsToBeVisibleByXpath(LIST_PRODUCT_PARAMETERS);
    }

    public List<WebElement> getListProductYears() {
        return waitUntilElementsToBeVisibleByXpath(LIST_PRODUTC_YEARS);
    }
}
