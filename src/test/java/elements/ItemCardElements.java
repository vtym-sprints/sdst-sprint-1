package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ItemCardElements extends AbstractBasePage {

    public ItemCardElements(WebDriver driver) {
        super(driver);
    }

    protected static final String ITEM_SERIES = "//h2[@class='headline-4']";
    protected static final String ITEM_MODEL = "//h3[@class='label-1']";
    protected static final String ITEM_PRICE = "//div[@class='headline-5' and contains(text(), '$')]";
}
