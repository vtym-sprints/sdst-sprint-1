package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomeElements extends AbstractBasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public final static String BMW_URL = "https://www.bmwusa.com/";
    protected final static String GLOBAL_POPUP_DISMISS_BTN_SEL = "//button[contains(text(), 'Dismiss')]",
            SEARCH_BTN = "//div[@class='globalnav-primary-search__show-on-large']",
            SEARCH_FIELD = "//input[@tab-index='2']";
}
