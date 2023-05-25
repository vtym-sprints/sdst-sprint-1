package pages;

import elements.BmwElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.scrollToElement;

public class VisualizeAccessoriesPage extends BmwElements {
    public VisualizeAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public VisualizeAccessoriesPage clickShoppingButton() {
        waitUntilElementToBeClickableByXpath(SHOPPING_BUTTON).click();
        return this;
    }

    public VisualizeAccessoriesPage clickShopBMWPartsButton() {
        waitUntilElementToBeClickableByXpath(SHOP_BMW_PARTS_BUTTON).click();
        return this;
    }

    public WebElement springIntoGearText() {

        return waitUntilElementToBeVisibleByXpath(SPRING_INTO_GEAR);
    }

    public VisualizeAccessoriesPage clickShopNowButton() {
        waitUntilElementToBeClickableByXpath(SHOP_NOW_BUTTON).click();
        return this;
    }

    public VisualizeAccessoriesPage click2007Button() {
        waitUntilElementToBeClickableByXpath(CLICK_2007_BUTTON).click();
        return this;
    }

    public VisualizeAccessoriesPage click3Button() {
        waitUntilElementToBeClickableByXpath(CLICK_3_BUTTON).click();
        return this;
    }

    public VisualizeAccessoriesPage click328iCoupeButton() {
        waitUntilElementToBeClickableByXpath(CLICK_328ICOUPE_BUTTON).click();
        return this;
    }

    public VisualizeAccessoriesPage scrollToCategories() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_TO_CATEGORIES), driver);
        return this;
    }

    public VisualizeAccessoriesPage scrollToSelectDealer() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_SELECT_DEALER), driver);
        return this;
    }

    public VisualizeAccessoriesPage clickCategoriesButton() {
        waitUntilElementToBeClickableByXpath(CATEGORIES_BUTTON).click();
        return this;
    }

    public VisualizeAccessoriesPage clickBmwWheelButton() {
        waitUntilElementToBeClickableByXpath(BMW_WHELL_BUTTON).click();
        return this;
    }

    public VisualizeAccessoriesPage closePopUp() {
        waitUntilElementToBeClickableByXpath(CLOSE_POP_UP).click();
        return this;
    }

    public WebElement textBmwMWheel() {
        return waitUntilElementToBeVisibleByXpath(TEXT_BMW_M_WHEEL);

    }

    public VisualizeAccessoriesPage inputTextState() {
        waitUntilElementToBeVisibleByXpath((INPUT_STATE)).sendKeys("90001");
        return this;
    }

    public VisualizeAccessoriesPage clickLookUpButton() {
        waitUntilElementToBeClickableByXpath(LOOKUP_BUTTON).click();
        return this;
    }
    public VisualizeAccessoriesPage clickSetMyDealerButton() {
        waitUntilElementToBeClickableByXpath(SET_MY_DEALER_BUTTON).click();
        return this;
    }
    public VisualizeAccessoriesPage clickChooseOptionsButton() {
        waitUntilElementToBeClickableByXpath(CHOOSE_OPTIONS_BUTTON).click();
        return this;
    }
    public VisualizeAccessoriesPage scrollToAddCartButton() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_ADD_TO_CART_BUTTON), driver);
        return this;
    }
    public VisualizeAccessoriesPage clickAddToCartButton() {
        waitUntilElementToBeClickableByXpath(ADD_TO_CART_BUTTON).click();
        return this;
    }
    public WebElement getTextBmwWheel()
    {
        return waitUntilElementToBeVisibleByXpath(TEXT_BMW_WHEEL);
    }
}


