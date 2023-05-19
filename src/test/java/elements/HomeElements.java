package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class HomeElements extends AbstractBasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public final String BUILD_YOUR_OWN_FIELD = "//a[contains(text(), 'Build Your Own')]";
    public final String DISMISS_COOKIES_BTN = "//button[contains(text(), 'Dismiss')]";

    public final String MODELS_FIELD = "//span[contains(text() , 'Models')]";
}
