package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ShopPreOwnedInventoryElements extends AbstractBasePage {

    public ShopPreOwnedInventoryElements(WebDriver driver) {
        super(driver);
    }

    public static final String PRE_OWNED_CB = "//div[child::div/span[text()='Pre-Owned']]//div[contains(@class,'base-checkbox')]";
    public static final String FILTER_BODY_STYLE_BTN = "//button[@aria-controls='bodystyle']";
    public static final String ONE_OF_BODY_STYLE = "//label[@class='filter-body-style_label_16RKG']/div/span[1]";
    public static final String FILTER_PRICE_BTN = "//button[@aria-controls='price']";
    protected static final String FILTER_MODEL_YEAR_CONTAINER = "//button[@aria-controls='modelyear']";
    protected static final String MAX_MODEL_YEAR_LISTER = "//div[preceding-sibling::select[@id='select_maxyear']]";
    protected static final String MAX_MODEL_YEAR_2015 =
            "//ul[preceding-sibling::select[@id='select_maxyear']]//span[text()='2015']/..";
    public static final String PRODUCT_PRICE = "//div[@class='vehicle-card_container_3kJHc']//div[@class='content-2' and contains(text(),'$')]";
    public static final String MAX_PRICE_LI = "//ul[preceding-sibling::select[@id='select_maxprice']]//span";
    public static final String MIN_PRICE_LI = "//ul[preceding-sibling::select[@id='select_minprice']]//span";
    public static final String CHOOSE_MAX_PRICE = "//div[preceding-sibling::select[@id='select_maxprice']]";
    public static final String CHOOSE_MIN_PRICE = "//div[preceding-sibling::select[@id='select_minprice']]";
    public static final String FILTER_BTN = "//button[@class='label-3--bold applied-filter-item_filter-item_2TMrE']";
    protected static final String CARDS_NAMES_LIST = "//div[@class='label-1--bold' and not(contains(text(), 'Certified'))]";
}
