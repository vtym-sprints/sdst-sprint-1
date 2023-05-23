package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BuildYourOwnElements extends AbstractBasePage {
    public BuildYourOwnElements(WebDriver driver) {
        super(driver);
    }

    public final static String X7_MODEL_BTN = "//button[contains(text(),'X7')]";
    public final static String SELECT_X7MODEL_BTN = "//a[@aria-label='Select X7 Sports Activity Vehicle']";
    public final static String DESIGN_X7 = "//a[@title='2024 BMW X7 xDrive40i']";
    public final static String TOTAL_PRICE_X7 = "//div[@class='total-price']";
    public final static String M_SPORT_LOOK = "//div[@longdescription='Performance features inspired by BMW Motorsport.']";
    public final static String NEXT_COLOR_BTN = "//a[@class='button-next byo-core-type label-1 theme-core']";


}
