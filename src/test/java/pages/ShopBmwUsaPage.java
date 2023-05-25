package pages;

import elements.ShopBmwUsaElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ShopBmwUsaPage extends ShopBmwUsaElements {
    public ShopBmwUsaPage(WebDriver driver) {
        super(driver);
    }

    public ShopBmwUsaPage clickOnCategory(String nameCategory) {
        waitUntilElementToBeVisibleByXpath(String.format(FIELD_CATEGORIES_ON_SHOP_PAGE, nameCategory)).click();
        return this;
    }

    public ShopBmwUsaPage clickFieldWithNameGoods(String nameGoods) {
        waitUntilElementToBeClickableByXpath(String.format(FIELD_WITH_NAME_GOOD, nameGoods)).click();
        return this;
    }

    public ShopBmwUsaPage sendKeysInFieldDealerNameOrZipCode(String nameOrZip) {
        waitUntilElementToBeClickableByXpath(FIELD_DEALER_NAME_OR_ZIP_CODE).sendKeys(nameOrZip + Keys.ENTER);
        return this;
    }

    public ShopBmwUsaPage clickOnFirstBtnSetUpMyDealer() {
        waitUntilElementToBeClickableByXpath(BTN_FIRST_SET_UP_MY_DEALER).click();
        return this;
    }

    public ShopBmwUsaPage clickBtnAddToCart() {
        waitUntilElementToBeClickableByXpath(BTN_ADD_TO_CART).click();
        return this;
    }

    public ShopBmwUsaPage clickBtnClosePopUpCart() {
        waitUntilElementToBeClickableByXpath(BTN_CLOSE_POP_UP_CART).click();
        return this;
    }

    public ShopBmwUsaPage clickBtnSeatAccessoriesAboutPhoto() {
        waitUntilElementToBeClickableByXpath(BTN_SEAT_ACCESSORIES_ABOUT_PHOTO).click();
        return this;
    }

    public ShopBmwUsaPage clickBtnViewCartOnPopUp() {
        waitUntilElementToBeClickableByXpath(BTN_VIEW_CART_ON_POP_UP).click();
        return this;
    }

    public String getNameProduct() {
        return waitUntilElementToBeVisibleByXpath(FIELD_NAME_PRODUCT).getText();
    }

    public String getPriceProduct() {
        return waitUntilElementToBeVisibleByXpath(FIELD_PRICE_PRODUCT).getText();
    }
}
