package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class BuildYourOwnElements extends AbstractBasePage {
    public BuildYourOwnElements(WebDriver driver) {
        super(driver);
    }

    public final static String FIND_A_DEALER_CLOSE_BTN = "//button[@aria-label='Close Zipcode Modal']";
    public final static String CONFIRM_COLOR_CHANGES = "//button[@aria-label='Confirm Button']";
    public final static String IMPORTANT_INFO_CLOSE_BTN = "//button[@class='close-button']";
    public final static String X7_MODEL_BTN = "//button[contains(text(),'X7')]";
    public final static String SELECT_X7MODEL_BTN = "//a[@aria-label='Select X7 Sports Activity Vehicle']";
    public final static String DESIGN_X7 = "//*[@id='byo']/div[2]/div[3]/div/div[2]/div[2]/div/div[3]/div/a";
    //a[@title='2024 BMW X7 xDrive40i']";
    public final static String TOTAL_PRICE_X7 = "//div[@class='total-price']";
    public final static String M_SPORT_LOOK = "//div[@longdescription='Performance features inspired by BMW Motorsport.']";
    public final static String PRICE_M_SPORT = "//*[@id='byo-studio-rail-design']/div[1]/div[2]/div/div[1]/div[2]/div[3]";
    public final static String NEXT_BTN = "//a[@class='button-next byo-core-type label-1 theme-core']";
    public final static String CHOSE_YOUR_EXTERIOR_PART = "//div[@class='byo-rail-list-view']";
    public final static String TANZANITE_BLUE_II_METALIC_COLOR = "//div[contains(text(),'Tanzanite Blue II Metallic')]";
    public final static String PRICE_OF_COLOR =
            "//*[@id='byo-studio-rail-exterior']/div[1]/div[2]/div/div/div[11]/div/div/div[2]/div[2]";
    public final static String WHEELS_OPTION = "//div//span[contains(text(),'Wheels')]";
    public final static String WHEEL_STYLE_DOUBLE_SPOKE = "//div[@wheelstyle='913M']";
    public final static String PRICE_OF_WHEELS = "//*[@id='byo-studio-rail-exterior']/div[1]/div/div[6]/div/div/div[2]/div[3]";
    public final static String BLACK_UPHOLSTERY = "//div[@name='Black Full Merino Leather']";
    public final static String PRICE_OF_BLACK_UPHOLSTERY =
            "//*[@id='byo-studio-rail-interior']/div[1]/div[3]/div/div[2]/div/div/div[2]/div[2]";
    public final static String TRIM = "//input[@id='Trim_selector']";
    public final static String TRIM_INDIVIDUAL_PIANO_BLACK_FINISH = "//div[@code='S04ML']";
    public final static String PRICE_OF_PIANO_TRIM =
            "//*[@id='byo-studio-rail-interior']/div[1]/div/div[5]/div/div/div[2]/div[2]";
    public final static String SEE_ALL_8_FEATURES = "//div[contains(text(),'8 features')]";
    public final static String SOUND_SYSTEM = "//input[@id='S06F1']";
    public final static String PRICE_OF_SOUND_SYSTEM =
            "//*[@id='Studio']/div[1]/div/div[1]/div[1]/div/div[8]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[3]/div/ul/li[2]/button/div[2]/div[1]";
    public final static String ADD_TO_BUILD = "//button[contains(text(),'Add to build')]";
    public final static String PRICE_OF_CLIMATE_COMFORT =
            "//*[@id='conflict-modal']/div[2]/div/section[2]/div[1]/div[1]/div/div[1]/div/p[2]";
    public final static String PRICE_EXECUTIVE_PACKAGE =
            "//*[@id='conflict-modal']/div[2]/div/section[2]/div[1]/div[1]/div/div[3]/div/p[2]";
    public static final String NET_CHANGE_PRICE = "//div[@class='conflict-modal__row']";
    public final static String CONFIRM_CHANGES = "//button[@aria-label='Confirm Button']";
    public final static String NEXT_ACCESSORIES = "//a[contains(text(),'Next / Accessories')]";
    public final static String ADD_CURBON_FIBER =
            "//button[@aria-label='Add BMW M Performance Mirror Caps in Carbon Fiber to your build']";
    public final static String CURBON_FIBER_PRICEC =
            "//*[@id='Studio']/div[1]/div/div[1]/div[1]/div/div[3]/div/div[2]/div[2]/div[3]";
    public final static String NEXT_SUMMERY = "//a[contains(text(),'Next / Summary')]";
    public final static String PRICE_LIST =
            "//div[@class='build-overview__option-price byo-col-default-5 byo-col-md-3 byo-col-lg-2' and contains(text(),'$')]";
    public final static String TOTAL_PRICE = "//div[@class='build-overview__total-price label-1--bold']";
    public List<Integer> optionPrices = new ArrayList<>();
}
