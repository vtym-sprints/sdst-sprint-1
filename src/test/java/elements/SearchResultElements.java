package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class SearchResultElements extends AbstractBasePage {

    public SearchResultElements(WebDriver driver) {
        super(driver);
    }

    public final static String DETAIL_INFO = "//span[@class='st-ui-type-detail']";
}
