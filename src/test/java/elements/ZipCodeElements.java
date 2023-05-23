package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ZipCodeElements extends AbstractBasePage {

    public ZipCodeElements(WebDriver driver) {
        super(driver);
    }

    public static final String ZIP_INPUT_FIELD = "//input[@id='zipentry-input']";
    public static final String SHOP_NOW_BTN = "//button[@class='zipentry-cta cta-1']";
    public static final String SELECT_ZIP_BTN = "//button[@analytics-event='select-dealer-1']";
}
