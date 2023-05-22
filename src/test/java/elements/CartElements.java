package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class CartElements extends AbstractBasePage {
    public CartElements(WebDriver driver) {
        super(driver);
    }

    public static final String NAME_PRODUCT_ON_CART_PAGE = "(//div[@class='VisCartTitle'])[%s]";
    public static final String PRICE_PRODUCT_ON_CART_PAGE = "(//section[@class='VisCartPricesec']/label)[%s]";
}
