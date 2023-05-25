package pages;

import elements.ItemCardElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.replacePrice;
import static java.lang.Integer.parseInt;

public class ItemCardPage extends ItemCardElements {

    public ItemCardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getItemSeriesElement() {
        return waitUntilElementToBeVisibleByXpath(ITEM_SERIES);
    }

    public WebElement getItemModelElement() {
        return waitUntilElementToBeVisibleByXpath(ITEM_MODEL);
    }

    public WebElement getItemPriceElement() {
        return waitUntilElementToBeVisibleByXpath(ITEM_PRICE);
    }

    public String getItemSeries() {
        return getItemSeriesElement().getText();
    }

    public String getItemModel() {
        return getItemModelElement().getText();
    }

    public Integer getItemPrice() {
        return parseInt(replacePrice(getItemPriceElement()));
    }
}
