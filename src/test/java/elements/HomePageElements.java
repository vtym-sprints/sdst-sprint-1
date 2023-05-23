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
    public final static String GLOBAL_POPUP_DISMISS_BTN_SEL = "//button[contains(text(), 'Dismiss')]";
    public final static String BUILD_YOUR_OWN_BUTTON = "//a[@analytics-event='topnav.byo.byo.link']";
    public static final String BTN_SHOP_BMW_PARTS_AND_ACCESSORIES = "//div[contains(@class,'__nav-holder')]//a[contains(text(),'Accessories')]";
    public static final String  MODELS_BTN= "//button[@name='Models Flyout']";
}
