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
    public static final String BTN_SHOPPING_ON_HEADER = "//button[@name='Shopping Flyout']";
    public static final String FIELD_INPUT_ZIP_CODE_IN_SHOPPING = "//input[@name='zip_code']";
    public static final String BUTTON_SELECT_DEALER_BY_NUMBER =
            "(//div[@class='dealerlist-dealercard']//button[contains(text(),'')])[%s]";
    public static final String CLOSE_RIGHT_POP_UP = "//button[@class='view cta-2--bold']";
    public static final String SENDKEYS_ZIP_CODE = "//input[@id='zipentry-input']";
}
