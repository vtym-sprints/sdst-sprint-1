package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ZipCodeElements extends AbstractBasePage {
    public ZipCodeElements(WebDriver driver) {
        super(driver);
    }

    public final static String ZIP_INPUT_FIELD = "//input[@id='zipentry-input']",
            SHOP_NOW_BTN = "//button[@class='zipentry-cta cta-1']",
            SELECT_ZIP_BTN = "//button[@analytics-event='select-dealer-1']";
}
