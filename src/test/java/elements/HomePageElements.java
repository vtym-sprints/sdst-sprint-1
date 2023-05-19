package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomePageElements extends AbstractBasePage {

    public static final String BTN_FOLLOWING_FACEBOOK = "//a[@aria-label='Facebook']";
    public static final String BTN_FOLLOWING_TWITTER = "//a[@aria-label='Twitter']";
    public static final String BTN_FOLLOWING_YOUTUBE = "//a[@aria-label='Youtube']";
    public static final String BTN_FOLLOWING_INSTAGRAM = "//a[@aria-label='Instagram']";
    public static final String BUILD_YOUR_OWN_FIELD = "//a[contains(text(), 'Build Your Own')]";
    public static final String DISMISS_COOKIES_BTN = "//button[contains(text(), 'Dismiss')]";
    public static final String MODELS_FIELD = "//span[contains(text() , 'Models')]";
    public HomePageElements(WebDriver driver) {
        super(driver);
    }
}
