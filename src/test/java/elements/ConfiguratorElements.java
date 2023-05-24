package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class ConfiguratorElements extends AbstractBasePage {
    protected static final String ZIPCODE_MODAL_CLOSER = "//button[@aria-label='Close Zipcode Modal']";
    protected static final String CURRENT_PRICE =
            "//span[@class='total-amount core-type theme-core total-amount--bold headline-5']";
    public static final String SELECTION_PRICE_CHANGE = "//p[@class='conflict-modal__value headline-6']";
    protected static final String BUTTON_CONFIRM_CHANGES = "//button[@name='confirm-button']";
    protected static final String BUTTON_NEXT = "//a[@class='button-next byo-core-type label-1 theme-core']";
    protected static final String NEXT_COLOR_BUTTON = "//a[contains(text(), 'Next / Color')]";
    protected static final String NEXT_WHEELS_BUTTON = "//a[contains(text(), 'Next / Wheels')]";
    protected static final String NEXT_UPHOLSERY_BUTTON = "//a[contains(text(), 'Next / Upholstery')]";
    protected static final String NEXT_TRIM_BUTTON = "//a[contains(text(), 'Next / Trim')]";
    protected static final String NEXT_OPTIONS_BUTTON = "//a[contains(text(), 'Next / Options')]";
    protected static final String NEXT_SUMMARY_BUTTON = "//a[contains(text(), 'Next / Summary')]";
    protected static final String OPTIONS_LIST = "//div[@class='byo-rail-option-selector']";
    protected static final String LOOK_MSPORT =
            "//div[@class='name byo-core-type label-2 theme-core' and contains(text(), 'M Sport')]/.." +
                    "/div[contains(@class, 'price')]";
    protected static final String COLOR_ALPINE_WHITE =
            "//div[@class='name byo-core-type label-2 theme-core' and contains(text(), 'Alpine White')]" +
                    "/../div[contains(@class, 'price')]";
    protected static final String COLOR_AVENTURIN_RED_METALLIC =
            "//div[@class='name byo-core-type label-2 theme-core' and contains(text(), 'Aventurin Red Metallic')]" +
                    "/../div[contains(@class, 'price')]";
    protected static final String WHEELS_18_DOUBLE_SPOKE_BURNISHED_ORBIT_GREY =
            "//div[@class='name byo-core-type label-2 theme-core' and " +
                    "contains(text(), 'Double-spoke burnished orbit grey wheels')]";
    protected static final String WHEELS_20_M_Y_SPOKE_BI_COLOR_JET_BLACK =
            "//div[@class='name byo-core-type label-2 theme-core' and " +
                    "contains(text(), 'M Y-spoke bi-color jet black wheels')]/../div[contains(@class, 'price')]";
    protected static final String BUTTON_SELECT_EXECUTIVE_PACKAGE =
            "//p[@class='package-tile__name headline-5--bold' and " +
                    "contains(text(), 'Executive')]/ancestor::div[@class='package-tile']//button";
    protected static final String BUTTON_ADD_TO_BUILD =
            "//button[@class='package-modal__selected-btn label-1']";
    protected static final String BUTTON_BACK_TO_BUILD =
            "//button[@class='package-modal__cancel-btn label-1']";
    protected static final String OPTION_DRIVING_ASSISTANCE_PROFESSIONAL_PACKAGE =
            "//button[@aria-label='See details for Driving Assistance Professional Package']";
    protected static final String OPTION_DRIVING_ASSISTANCE_PROFESSIONAL_PACKAGE_PRICE =
            "//button[@aria-label='See details for Driving Assistance Professional Package']" +
                    "//ancestor::div[@class='option-tile-content']//div[@class='option-tile-price label-1--bold']";
    protected static final String ESTIMATED_PRICE = "//h5[@class='build-price headline-5']";

    public ConfiguratorElements(WebDriver driver) {
        super(driver);
    }
}
