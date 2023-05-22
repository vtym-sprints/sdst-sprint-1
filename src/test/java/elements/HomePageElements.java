package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomePageElements extends AbstractBasePage {

    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public static final String BTN_FOLLOWING_FACEBOOK = "//a[@aria-label='Facebook']",
            BTN_FOLLOWING_TWITTER = "//a[@aria-label='Twitter']",
            BTN_FOLLOWING_YOUTUBE = "//a[@aria-label='Youtube']",
            BTN_FOLLOWING_INSTAGRAM = "//a[@aria-label='Instagram']",
            PRE_OWNED_INVENTORY = "//a[@analytics-event='footer-shopping-tools.cpo.shop-pre-owned.button']",
            FOOTER_MENU = "//div[@class='accordion-base__trigger label-1--bold']",
            GLOBAL_POPUP_DISMISS_BTN_SEL = "//button[contains(text(), 'Dismiss')]";
}
