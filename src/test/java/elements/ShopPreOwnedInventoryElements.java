package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ShopPreOwnedInventoryElements extends AbstractBasePage {

    public ShopPreOwnedInventoryElements(WebDriver driver) {
        super(driver);
    }

    public final static String PRE_OWNED_CB = "//div[child::div/span[text()='Pre-Owned']]//div[contains(@class,'base-checkbox')]";
    public final static String FILTER_BODY_STYLE_BTN = "//button[@aria-controls='bodystyle']";
    public final static String ONE_OF_BODY_STYLE = "//label[@class='filter-body-style_label_16RKG']/div/span[1]";
    public final static String FILTER_PRICE_BTN = "//button[@aria-controls='price']";
    public final static String PRODUCT_PRICE = "//div[@class='vehicle-card_container_3kJHc']//div[@class='content-2' and contains(text(),'$')]";
    public final static String MAX_PRICE_LI = "//ul[preceding-sibling::select[@id='select_maxprice']]//span";
    public final static String MIN_PRICE_LI = "//ul[preceding-sibling::select[@id='select_minprice']]//span";
    public final static String CHOOSE_MAX_PRICE = "//div[preceding-sibling::select[@id='select_maxprice']]";
    public final static String CHOOSE_MIN_PRICE = "//div[preceding-sibling::select[@id='select_minprice']]";
    public final static String FILTER_BTN = "//button[@class='label-3--bold applied-filter-item_filter-item_2TMrE']";
}
