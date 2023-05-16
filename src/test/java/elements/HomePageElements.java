package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomePageElements extends AbstractBasePage {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }
    protected static final String FIELD_MOTORCYCLES_LOWER_HEADER = "//a[contains(text(),'BMW Motorcycles')]";

}
