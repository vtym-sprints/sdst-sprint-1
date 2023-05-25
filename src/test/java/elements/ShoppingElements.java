package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ShoppingElements extends AbstractBasePage {

    public ShoppingElements(WebDriver driver) {
        super(driver);
    }

    public static final String FIELD_IN_FILTER_ON_SHOPPING_PAGE =
            "//div[@class='accordion-container_container_3IUbL']//button[contains(@value,'%s')]";
    public static final String SELECT_FIELD_IN_BODY_STYLE = "//span[@class='label-3--bold' and contains(text(),'%s')]";
    public static final String BOX_MIN_MAX_IN_PRICE = "(//div[@class='select-dropdown_select-selected_N5Fnd'])[%s]";
    public static final String SELECT_PRICE_IN_MIN_AND_MAX =
            "(//ul[@class='select-dropdown_select-items_F-jps'])//li[@class='label-3--bold']/span[contains(text(),'%s')]";
    public static final String LIST_PRICE_ON_SHOPPING_PAGE = "//div[@class='content-2']";
    public static final String LIST_PRODUCT_PARAMETERS = "//div[contains(@class,'modeldescription_1rES9')]";
    public static final String LIST_PRODUTC_YEARS = "//div[@class='label-1--bold']";
}
