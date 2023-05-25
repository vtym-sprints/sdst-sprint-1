package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ShopBmwUsaElements extends AbstractBasePage {

    public ShopBmwUsaElements(WebDriver driver) {
        super(driver);
    }

    public static final String FIELD_CATEGORIES_ON_SHOP_PAGE = "//div[@class='card-body']/p[contains(text(),'%s')]";
    public static final String FIELD_WITH_NAME_GOOD = "//div[contains(@class,'card-group Dhover')][%s]";
    public static final String FIELD_DEALER_NAME_OR_ZIP_CODE = "//input[@id='searchQuery']";
    public static final String BTN_FIRST_SET_UP_MY_DEALER = "//div[@class='dealer-selection'][1]";
    public static final String BTN_ADD_TO_CART = "//button[@id='btnAddToCart']";
    public static final String BTN_CLOSE_POP_UP_CART = "//button[@id='btnCloseCartSummary']";
    public static final String BTN_SEAT_ACCESSORIES_ABOUT_PHOTO =
            "//div[@class='pagedetails']//a[contains(text(),'Seat Accessories')]";
    public static final String BTN_VIEW_CART_ON_POP_UP = "//span[contains(text(),'View Cart')]";
    public static final String FIELD_NAME_PRODUCT = "//h1[contains(@id,'hName_BMW')]";
    public static final String FIELD_PRICE_PRODUCT = "//span[@id='totalPrice']";
}
