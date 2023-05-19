package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BuildYourOwnElements extends AbstractBasePage {
    public BuildYourOwnElements(WebDriver driver) {
        super(driver);
    }

    public final String CHECK_PHRASE = "Total Price (MSRP)";
    public final String X6_M_SPORTS_ACTIVITY_COUPE_SELECT = "//a[contains(@aria-label,'Select X6 M Sports Activity Coupe')]";
    public final String CUSTOMIZE_YOUR_BUILD = "//a[contains(text(), 'Customize This Build')]";
    public final String COLOR_BLACK_METAL = "//div[contains(text(), 'Carbon Black Metallic')]";
    public final String NEXT_WHEELS_BTN = "//a[contains(text(), 'Next / Wheels')]";
    public final String WHEELS_21_INCHES = "//div[contains(text(), 'i-color Wheels')]";
    public final String NEXT_UPHOLSTERY_BTN = "//a[contains(text(), 'Next / Upholstery')]";
    public final String LEATHER_COLOR_COGNAC = "//div[contains(text(), 'Coffee')]";
    public final String NEXT_TRIM_BTN = "//a[contains(text(), 'Next / Trim')]";
    public final String TRIM_GLOSS_WOOD = "//div[contains(text(), 'Fineline Black Wood')]";
    public final String NEXT_OPTIONS_BTN = "//a[contains(text(), 'Next / Options')]";
    public final String NEXT_SUMMARY_BTN = "//a[contains(text(), 'Next / Summary')]";
    public final String TOTAL_PRICE_CHECK = "//div[contains(text(), 'Total Price (MSRP)')]";
    public final String MODAL_WINDOW_CLOSE_BTN = "//button[@aria-label='Close Zipcode Modal']";
    public final String X5_M_SPORTS_SELECT = "//a[contains(@aria-label, 'Select X5 M Sports')]";
    public final String X5_M_COMPETITION = "//div[contains(text(),'122,300')]/following-sibling::a";
    public final String CHECK_NAME = "//h1[@class='headline-4']";
    public final String CHECK_PRICE = "//h5[@class='build-price headline-5']";
    public final String X4_M_SPORTS_SELECT = "//a[@aria-label='Select X4 M Sports Activity Coupe']";
    public final String X4_ALPINE_WHITE_COLOR = "//div[contains(text(), 'Alpine White')]";
    public final String X4_BLACK_ALCANTARA = "//div[contains(text(), 'Black Perforated')]";
    public final String X4_SMOKE_GREY = "//div[contains(text(), 'Smoke Grey Aluminum Rhombicle')]";
    public final String NEXT_ACCESSORIES = "//a[contains(text(), 'Next / Accessories')]";
    public final String NEXT_COLOR_BTN = "//a[contains(text(), 'Next / Color')]";
    public final String MODAL_ZIP_CLOSE = "//button[@aria-label='Close Zipcode Modal']";
    public final String X4M_PERFORMANCE_BTN = "//div[contains(text(), 'M Performance') and @class='name byo-core-type label-2 theme-core']";
    public final String X4_SMOKE_GREY_LEATHER = "//div[contains(text(), 'Smoke Grey')]";
    public final String XM_CHOOSING = "//div[text()='XM']";
    public final String XM_BUILD_OWN = "//a[contains(text(), 'Build Your Own')]";
    public final String X4_M_SELECT = "//a[@title='2023 BMW X4 M']";

}
