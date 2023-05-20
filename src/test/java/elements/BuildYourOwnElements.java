package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuildYourOwnElements extends AbstractBasePage {
    public BuildYourOwnElements (WebDriver driver) {
        super(driver);
    }

    public static final String CHECK_PHRASE = "Total Price (MSRP)";
    public static final String X6_M_SPORTS_ACTIVITY_COUPE_SELECT = "//a[contains(@aria-label,'Select X6 M Sports Activity Coupe')]";
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
    public static final String TOTAL_PRICE_CHECK = "//div[contains(text(), 'Total Price (MSRP)')]";
    public static final String MODAL_WINDOW_CLOSE_BTN = "//button[@aria-label='Close Zipcode Modal']";
    public static final String X5_M_SPORTS_SELECT = "//a[contains(@aria-label, 'Select X5 M Sports')]";
    public static final String X5_M_COMPETITION = "//div[contains(text(),'122,300')]/following-sibling::a";
    public static final String CHECK_NAME = "//h1[@class='headline-4']";
    public static final String CHECK_PRICE = "//h5[@class='build-price headline-5']";
    public static final String X4_M_SPORTS_SELECT = "//a[@aria-label='Select X4 M Sports Activity Coupe']";
    public static final String X4_ALPINE_WHITE_COLOR = "//div[contains(text(), 'Alpine White')]";
    public static final String X4_BLACK_ALCANTARA = "//div[contains(text(), 'Black Perforated')]";
    public static final String X4_SMOKE_GREY = "//div[contains(text(), 'Smoke Grey Aluminum Rhombicle')]";
    public static final String NEXT_ACCESSORIES = "//a[contains(text(), 'Next / Accessories')]";
    public static final String NEXT_COLOR_BTN = "//a[contains(text(), 'Next / Color')]";
    public static final String MODAL_ZIP_CLOSE = "//button[@aria-label='Close Zipcode Modal']";
    public static final String X4M_PERFORMANCE_BTN = "//div[contains(text(), 'M Performance') and @class='name byo-core-type label-2 theme-core']";
    public static final String X4_SMOKE_GREY_LEATHER = "//div[contains(text(), 'Smoke Grey')]";
    public static final String XM_CHOOSING = "//div[text()='XM']";
    public static final String XM_BUILD_OWN = "//a[@href='/vehicles/m-models/xm-plug-in-hybrid/build-your-own.html']";
    public static final String X4_M_SELECT = "//a[@title='2023 BMW X4 M']";
    public static final String XM_WHITE_COLOR = "//div[contains(text(), 'White')]";
    public static final String XM_ORANGE_LEATHER = "//div[contains(text(), 'Orange')]";
    public static final String XM_SELECT_BUILD = "//a[@href='/build-your-own.html#/studio/23SR']";
}
