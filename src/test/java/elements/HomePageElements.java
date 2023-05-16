package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomePageElements extends AbstractBasePage {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }
    public final static String BMW_URL = "https://www.bmwusa.com/";
    protected final static String POPUP = "//button[contains(text(), 'Dismiss')]";
    protected final static String SEARCH_BTN =
            "//div[@class='globalnav-primary-search__show-on-large']";
    protected final static String SEARCH_FIELD =
            "//input[@tab-index='2']";
}
