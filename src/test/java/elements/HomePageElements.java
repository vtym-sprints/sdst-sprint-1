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
    protected static final String GLOBAL_POPUP_DISMISS_BTN_SEL = "//button[contains(text(), 'Dismiss')]",
            SEARCH_BTN = "//div[@class='globalnav-primary-search__show-on-large']",
            SEARCH_FIELD = "//input[@tab-index='2']";
}
