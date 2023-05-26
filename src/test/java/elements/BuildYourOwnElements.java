package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class BuildYourOwnElements extends AbstractBasePage {

    public BuildYourOwnElements(WebDriver driver) {
        super(driver);
    }

    public static final String FIND_A_DEALER_CLOSE_BTN = "//button[@aria-label='Close Zipcode Modal']";
    public static final String CONFIRM_COLOR_CHANGES = "//button[@aria-label='Confirm Button']";
    public static final String IMPORTANT_INFO_CLOSE_BTN = "//button[@class='close-button']";
    public static final String X7_MODEL_BTN = "//button[contains(text(),'X7')]";
    public static final String SELECT_X7MODEL_BTN = "//a[@aria-label='Select X7 Sports Activity Vehicle']";
    public static final String DESIGN_X7 = "//*[@id='byo']/div[2]/div[3]/div/div[2]/div[2]/div/div[3]/div/a";
    public static final String TOTAL_PRICE_X7 = "//div[@class='total-price']";
    public static final String M_SPORT_LOOK = "//div[@longdescription='Performance features inspired by BMW Motorsport.']";
    public static final String PRICE_M_SPORT = "//*[@id='byo-studio-rail-design']/div[1]/div[2]/div/div[1]/div[2]/div[3]";
    public static final String NEXT_BTN = "//a[@class='button-next byo-core-type label-1 theme-core']";
    public static final String TANZANITE_BLUE_II_METALIC_COLOR = "//div[contains(text(),'Tanzanite Blue II Metallic')]";
    public static final String PRICE_OF_COLOR =
            "//*[@id='byo-studio-rail-exterior']/div[1]/div[2]/div/div/div[11]/div/div/div[2]/div[2]";
    public static final String WHEELS_OPTION = "//div//span[contains(text(),'Wheels')]";
    public static final String WHEEL_STYLE_DOUBLE_SPOKE = "//div[@wheelstyle='913M']";
    public static final String PRICE_OF_WHEELS = "//*[@id='byo-studio-rail-exterior']/div[1]/div/div[6]/div/div/div[2]/div[3]";
    public static final String BLACK_UPHOLSTERY = "//div[@name='Black Full Merino Leather']";
    public static final String PRICE_OF_BLACK_UPHOLSTERY =
            "//*[@id='byo-studio-rail-interior']/div[1]/div[3]/div/div[2]/div/div/div[2]/div[2]";
    public static final String TRIM_INDIVIDUAL_PIANO_BLACK_FINISH = "//div[@code='S04ML']";
    public static final String PRICE_OF_PIANO_TRIM =
            "//*[@id='byo-studio-rail-interior']/div[1]/div/div[5]/div/div/div[2]/div[2]";
    public static final String SELECT_SEE_ALL_8_FEATURES =
            "//p[@class='package-tile__name headline-5--bold' and contains(text(), 'Executive')]/ancestor::div[@class='package-tile']//button";
    public static final String SOUND_SYSTEM = "//label[@for='S06F1']";
    public static final String PRICE_OF_SOUND_SYSTEM =
            "//*[@id='Studio']/div[1]/div/div[1]/div[1]/div/div[8]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[3]/div/ul/li[2]/button/div[2]/div[1]";
    public static final String ADD_TO_BUILD = "//button[contains(text(),'Add to build')]";
    public static final String NET_CHANGE_PRICE = "//div[@class='conflict-modal__row']";
    public static final String CONFIRM_CHANGES = "//button[@aria-label='Confirm Button']";
    public static final String NEXT_ACCESSORIES = "//a[contains(text(),'Next / Accessories')]";
    public static final String ADD_CURBON_FIBER =
            "//button[@aria-label='Add BMW M Performance Mirror Caps in Carbon Fiber to your build']";
    public static final String CURBON_FIBER_PRICEC =
            "//*[@id='Studio']/div[1]/div/div[1]/div[1]/div/div[3]/div/div[2]/div[2]/div[3]";
    public static final String NEXT_SUMMERY = "//a[contains(text(), 'Next / Summary')]";
    public List<Integer> optionPrices = new ArrayList<>();
    public static final String CHECK_PHRASE = "Total Price (MSRP)";
    public static final String X6_M_SPORTS_ACTIVITY_COUPE_SELECT =
            "//a[contains(@aria-label,'Select X6 M Sports Activity Coupe')]";
    public static final String CUSTOMIZE_YOUR_BUILD = "//a[contains(text(), 'Customize This Build')]";
    public static final String COLOR_BLACK_METAL = "//div[contains(text(), 'Carbon Black Metallic')]";
    public static final String NEXT_WHEELS_BTN = "//a[contains(text(), 'Next / Wheels')]";
    public static final String WHEELS_21_INCHES = "//div[contains(text(), 'i-color Wheels')]";
    public static final String NEXT_UPHOLSTERY_BTN = "//a[contains(text(), 'Next / Upholstery')]";
    public static final String LEATHER_COLOR_COGNAC = "//div[contains(text(), 'Coffee')]";
    public static final String NEXT_TRIM_BTN = "//a[contains(text(), 'Next / Trim')]";
    public static final String TRIM_GLOSS_WOOD = "//div[contains(text(), 'Fineline Black Wood')]";
    public static final String NEXT_OPTIONS_BTN = "//a[contains(text(), 'Next / Options')]";
    public static final String NEXT_SUMMARY_BTN = "//a[contains(text(), 'Next / Summary')]";
    public static final String TOTAL_PRICE = "//div[contains(text(), 'Total Price (MSRP)')]";
    public static final String MODAL_WINDOW_CLOSE_BTN = "//button[@aria-label='Close Zipcode Modal']";
    public static final String X5_M_SPORTS_SELECT = "//a[contains(@aria-label, 'Select X5 M Sports')]";
    public static final String X5_M_COMPETITION = "//div[contains(text(),'122,300')]/following-sibling::a";
    public static final String CHECK_NAME = "//h1[@class='headline-4']";
    public static final String CHECK_PRICE = "//h5[@class='build-price headline-5']";
    public static final String X4_M_SPORTS_SELECT = "//a[@aria-label='Select X4 M Sports Activity Coupe']";
    public static final String X4_ALPINE_WHITE_COLOR = "//div[contains(text(), 'Alpine White')]";
    public static final String X4_BLACK_ALCANTARA = "//div[contains(text(), 'Black Perforated')]";
    public static final String X4_SMOKE_GREY = "//div[contains(text(), 'Smoke Grey Aluminum Rhombicle')]";
    public static final String NEXT_COLOR_BTN = "//a[contains(text(), 'Next / Color')]";
    public static final String MODAL_ZIP_CLOSE = "//button[@aria-label='Close Zipcode Modal']";
    public static final String X4M_PERFORMANCE_BTN =
            "//div[contains(text(), 'M Performance') and @class='name byo-core-type label-2 theme-core']";
    public static final String X4_SMOKE_GREY_LEATHER = "//div[contains(text(), 'Smoke Grey')]";
    public static final String XM_CHOOSING = "//div[text()='XM']";
    public static final String XM_BUILD_OWN = "//a[@href='/vehicles/m-models/xm-plug-in-hybrid/build-your-own.html']";
    public static final String X4_M_SELECT = "//a[@title='2023 BMW X4 M']";
    public static final String XM_WHITE_COLOR = "//div[contains(text(), 'White')]";
    public static final String XM_ORANGE_LEATHER = "//div[contains(text(), 'Orange')]";
    public static final String XM_SELECT_BUILD = "//a[@href='/build-your-own.html#/studio/23SR']";
    public static final String SELECT_BUTTON_BMW_IX = "//a[@title='iX Sports Activity Vehicle']";
    public static final String BUTTON_DESIGN_IX = "//a[@title='2024 BMW iX xDrive50']";
    public static final String PRICE_BASE_CAR = "(//div[@class='variant-price byo-core-type theme-gkl headline-6'])[1]";
    public static final String PRICE_SPORTS_IX =
            "//div[@title='Sport']//div[@class='price byo-core-type label-2 theme-core']";
    public static final String BUTTON_SPORTS_IX =
            "//div[@title='Sport']//figure[@class='byo-rail-option-selector__thumb']";
    public static final String POP_UP_SPORTS_WINDOW = "//button[@aria-label='Confirm Button']";
    public static final String BUTTON_STORM_BAY_METALLIC =
            "//div[@title='Storm Bay Metallic']";
    public static final String PRICE_STORM_BY_METALLIC =
            "//div[@title='Storm Bay Metallic']//div[@class='price byo-core-type label-2 theme-core']";
    public static final String BUTTON_BI_COLOR_WHEELS = "//div[@style='order: 9; animation-delay: 2.6s;']";
    public static final String PRICE_BI_COLLOR_WHEELS =
            "//div[@style='order: 9; animation-delay: 2.6s;']//div[@class='price byo-core-type label-2 theme-core']";
    public static final String BUTTON_CASTANEA_CHESTNUT = "//div[@title='Castanea Chestnut Perforated Leather']";
    public static final String PRICE_CASTANEA_CHESTNUT =
            "//div[contains(@title,'Castanea Chestnut')]//div[@class='price core-type label-2 theme-core']";
}
