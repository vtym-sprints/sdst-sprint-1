package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ShopPreOwnedInventoryElements extends AbstractBasePage {

    public ShopPreOwnedInventoryElements(WebDriver driver) {
        super(driver);
    }

    public final static String PRE_OWNED_CB = "//div[child::div/span[text()='Pre-Owned']]//div[contains(@class,'base-checkbox')]",
            FILTER_BODY_STYLE_BTN = "//button[@aria-controls='bodystyle']",
            ONE_OF_BODY_STYLE = "//label[@class='filter-body-style_label_16RKG']/div/span[1]",
            FILTER_PRICE_BTN = "//button[@aria-controls='price']",
            PRODUCT_PRICE = "//div[@class='vehicle-card_container_3kJHc']//div[@class='content-2' and contains(text(),'$')]",
            MAX_PRICE_LI = "//ul[preceding-sibling::select[@id='select_maxprice']]//span",
            MIN_PRICE_LI = "//ul[preceding-sibling::select[@id='select_minprice']]//span",
            CHOOSE_MAX_PRICE = "//div[preceding-sibling::select[@id='select_maxprice']]",
            CHOOSE_MIN_PRICE = "//div[preceding-sibling::select[@id='select_minprice']]",
            FILTER_BTN = "//button[@class='label-3--bold applied-filter-item_filter-item_2TMrE']";

}
