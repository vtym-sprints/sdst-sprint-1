package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BmwElements extends AbstractBasePage {
    public BmwElements(WebDriver driver) {
        super(driver);
    }
    protected final static String SELECT_A_SERIES_BUTTON = "//h1[@class='primary-header WheelsFMAHeader'][contains(text(),'SPRING INTO GEAR')]";
    protected final static String BMW_M_BUTTON = "//h1[@class='primary-header WheelsFMAHeader'][contains(text(),'SPRING INTO GEAR')]";
    protected final static String SCROLL_M8_BUTTON = "//h1[@class='primary-header WheelsFMAHeader'][contains(text(),'SPRING INTO GEAR')]";
    protected final static String BMW_M8_COUPE_BUTTON = "//h1[@class='primary-header WheelsFMAHeader'][contains(text(),'SPRING INTO GEAR')]";
    protected final static String CUSTOMIZE_BUTTON = "//h1[@class='primary-header WheelsFMAHeader'][contains(text(),'SPRING INTO GEAR')]";

    protected final static String SHOPPING_BUTTON = "//button[@name='Shopping Flyout']";
    protected final static String SHOP_BMW_PARTS_BUTTON = "//a[@analytics-event='topnav-shopping-tools.shop-shop-bmwusa.shop-bmw-parts-accessories.link']";
    protected final static String SPRING_INTO_GEAR = "//h1[@class='primary-header WheelsFMAHeader'][contains(text(),'SPRING INTO GEAR')]";
    protected final static String SHOP_NOW_BUTTON = "//a[@class='btn btn-primary btnFMA no-underline d-inline-block'][contains(text(),'Shop Now')][1]";
    protected final static String CLICK_2007_BUTTON = "//a[@onkeydown][contains(text(),'2007')]";
    protected final static String CLICK_3_BUTTON = "//a[@class='series-tag'][contains(text(),'3')][1]";
    protected final static String CLICK_328ICOUPE_BUTTON = "//a[@class='model-tag'][contains(text(),'328i Coupe')]";
    protected final static String SCROLL_TO_CATEGORIES = "//img[@id='YourVehicleImgSrc']";
    protected final static String CATEGORIES_BUTTON = "//a[@id='aMperformance']";
    protected final static String BMW_WHELL_BUTTON = "//img[@alt='BMW M Performance Electronic Steering Wheel for Sport Line Equipped Vehicles ']";
    protected final static String CLOSE_POP_UP = "//a[@id='dealerClosepopup']";
    protected final static String TEXT_BMW_M_WHEEL = "//h1[@id='hName_BMW©M©Performance©Electronic©Steering©Wheel©for©Sport©Line©Equipped©Vehicles']";


}
