package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomePageElements extends AbstractBasePage {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public static final String BTN_FOLLOWING_FACEBOOK = "//a[@aria-label='Facebook']";
    public static final String BTN_FOLLOWING_TWITTER = "//a[@aria-label='Twitter']";
    public static final String BTN_FOLLOWING_YOUTUBE = "//a[@aria-label='Youtube']";
    public static final String BTN_FOLLOWING_INSTAGRAM = "//a[@aria-label='Instagram']";
    public static final String BTN_SHOP_BMW_PARTS_AND_ACCESSORIES =
            "//div[contains(@class,'__nav-holder')]//a[contains(text(),'Accessories')]";
    public static final String PRE_OWNED_INVENTORY = "//a[@analytics-event='footer-shopping-tools.cpo.shop-pre-owned.button']";
    public static final String FOOTER_MENU = "//div[@class='accordion-base__trigger label-1--bold']";
    public static final String GLOBAL_POPUP_DISMISS_BTN_SEL = "//button[contains(text(), 'Dismiss')]";
    public static final String MODELS_BUTTON = "//button[@analytics-event='topnav.menu.models-flyout.link']";
    public static final String BUILD_YOUR_OWN_BUTTON = "//a[@analytics-event='topnav.byo.byo.link']";
    protected static final String SHOPPING_BUTTON = "//button[@name='Shopping Flyout']";
    protected static final String SHOP_INVENTORY_BUTTON = "//a[@title='Shop Inventory']";
    protected static final String SHOPPING_ZIP_CODE_FIELD = "//input[@id='zip_code']";
    protected static final String SHOP_PRE_OWNED_BUTTON_IN_SHOPPING_TAB = "//button[@name='zip_btn_secondary']";
}
