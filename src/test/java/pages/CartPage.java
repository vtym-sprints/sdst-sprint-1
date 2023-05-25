package pages;

import elements.CartElements;
import org.openqa.selenium.WebDriver;

public class CartPage extends CartElements {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getNameProductOnCartPage(String numberProduct) {
        return waitUntilElementToBeVisibleByXpath(String.format(NAME_PRODUCT_ON_CART_PAGE, numberProduct)).getText();
    }

    public String getPriceProductOnCartPage(String numberProduct) {
        return waitUntilElementToBeVisibleByXpath(String.format(PRICE_PRODUCT_ON_CART_PAGE, numberProduct)).getText();
    }
}
