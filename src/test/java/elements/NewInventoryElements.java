package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class NewInventoryElements extends AbstractBasePage {

    protected static final String FILTER_PRICE_CONTAINER = "//button[@aria-controls='price']";
    protected static final String MIN_PRICE_LISTER = "//div[preceding-sibling::select[@id='select_minprice']]";
    protected static final String MIN_PRICE_60K = "//span[text()='$60,000']/..";
    protected static final String CAR_PRICES = "//div[@class='content-2']";

    public NewInventoryElements(WebDriver driver) {
        super(driver);
    }
}
