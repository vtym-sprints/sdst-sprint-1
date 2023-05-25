package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class NewInventoryElements extends AbstractBasePage {

    public NewInventoryElements(WebDriver driver) {
        super(driver);
    }

    protected static final String SORT_RULES_DROPDOWN =
            "//button[@class='nav-results-page_button_2ArDE' and not(@analytics-event)]";
    protected static final String SORT_RULE_PRICE_ASCENDING = "//button[text()=' Price: Lowest ']";
    protected static final String FILTER_PRICE_CONTAINER = "//button[@aria-controls='price']";
    protected static final String MIN_PRICE_LISTER = "//div[preceding-sibling::select[@id='select_minprice']]";
    protected static final String MIN_PRICE_60K = "//span[text()='$60,000']/..";
    protected static final String CARDS_SERIES_LIST = "//div[@class='label-1--bold']";
    protected static final String CARDS_MODEL_LIST =
            "//div[contains(@class, 'content-3 new-vehicle-card_modeldescription')]";
    protected static final String CARDS_PRICES_LIST = "//div[@class='content-2']";
}
