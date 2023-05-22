package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ShopPreOwnedInventoryElements extends AbstractBasePage {
    public ShopPreOwnedInventoryElements(WebDriver driver) {
        super(driver);
    }

    public final static String PRE_OWNED_CB = "//div[child::div/span[text()='Pre-Owned']]//div[contains(@class,'base-checkbox')]",
            RESULT_TITLE = "//*[@id='scroll-top-target']/div[1]/div[2]/div/div[2]",
            FILTER_BODY_STYLE_BTN = "//button[@aria-controls='bodystyle']",
            BODY_STYLE = "//label[@class='filter-body-style_label_16RKG']",
            ONE_OF_BODY_STYLE = "//label[@class='filter-body-style_label_16RKG']",
            FILTER_PRICE_BTN = "//button[@aria-controls='price']",
            MIN_PRICE = "//div[@class='select-dropdown_select-selected_N5Fnd'][preceding-sibling::select[@id='select_minprice']]",
            MAX_PRICE = "//div[@class='select-dropdown_select-selected_N5Fnd'][preceding-sibling::select[@id='select_maxprice']]",
            PRODUCT_PRICE = "//div[@class='vehicle-card_container_3kJHc']//div[@class='content-2' and contains(text(),'$')]",
            MAX_PRICE_LI = "//ul[preceding-sibling::select[@id='select_maxprice']]//span",
            MIN_PRICE_LI = "//ul[preceding-sibling::select[@id='select_minprice']]//span",
            CHOOSE_MAX_PRICE = "//div[preceding-sibling::select[@id='select_maxprice']]",
            CHOOSE_MIN_PRICE = "//div[preceding-sibling::select[@id='select_maxprice']]",
            FILTER_BTN = "//button[@class='label-3--bold applied-filter-item_filter-item_2TMrE']";

}
