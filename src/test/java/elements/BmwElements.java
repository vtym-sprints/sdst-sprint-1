package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BmwElements extends AbstractBasePage {
    public BmwElements(WebDriver driver) {
        super(driver);
    }
    protected final static String SCROLL_M8_BUTTON = "//h2[@class='series-tile__name theme-core byo-core-type headline-5'][contains(text(),'M8 Coupe')]";
    protected final static String SELECT_BMW_M8 = "//a[@aria-label='Select M8 Coupe']";
    protected final static String CUSTOMIZE_BUTTON = "//a[@analytics-event='byo-vehicle-selector.byo-design.build-recommended.button']";
    protected final static String TEXT_BMW_M8 = "//div[@class='selected-vehicle-title headline-6']";
    protected final static String SCROLL_SELECT_DEALER = "//a[@data-ajax-complete='clearRightMenu']";
    protected final static String SHOPPING_BUTTON = "//button[@name='Shopping Flyout']";
    protected final static String SHOP_BMW_PARTS_BUTTON = "//a[@tab-index='8']";
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
    protected final static String INPUT_STATE = "//input[@id='searchQuery']";
    protected final static String LOOKUP_BUTTON = "//button[@id='dealerSearchSubmit']";
    protected final static String SET_MY_DEALER_BUTTON = "//button[@aria-label='Set as My Dealer button']";
    protected final static String CHOOSE_OPTIONS_BUTTON = "//button[@id='btnChooseOption']";
    protected final static String SCROLL_ADD_TO_CART_BUTTON = "//span[@id='SummarySubTotal']";
    protected final static String ADD_TO_CART_BUTTON = "//button[@id='btnAddToCart']";
    protected final static String TEXT_BMW_WHEEL = "//h3[@id='hFlyoutName_BMW©Electronic©Performance©Steering©Wheel'][contains(text(),'BMW Electronic Performance Steering Wheel ')]";
    protected final static String NEXT_WHEELS_BUTTON = "//a[contains(text(),'Next / Wheels')]";
    protected final static String NEXT_UPHOLSTERY_BUTTON = "//a[contains(text(),'Next / Upholstery')]";
    protected final static String NEXT_TRIM_BUTTON = "//a[contains(text(),'Next / Trim')]";
    protected final static String NEXT_OPTIONS_BUTTON = "//a[contains(text(),'Next / Options')]";
    protected final static String SUM_CARS = "//span[contains(text(),'MSRP as built')]";
    protected final static String NEXT_SUMMARY_BUTTON = "//a[contains(text(),'Next / Summary')]";
    protected final static String TEXT_M8_COMPETITION = "//h1[contains(text(),'M8 Competition Coupe')]";

}