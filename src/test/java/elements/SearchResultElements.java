package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class SearchResultElements extends AbstractBasePage {
    public SearchResultElements(WebDriver driver) {
        super(driver);
    }
    protected final static String DETAIL_INFO = "//span[@class='st-ui-type-detail']";

    //private static final String CLOSE_COOKIE = "";
}
