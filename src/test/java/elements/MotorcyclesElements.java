package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class MotorcyclesElements extends AbstractBasePage {

    public MotorcyclesElements(WebDriver driver) {
        super(driver);
    }

    public static final String BUTTON_BURGER_MENU = "//button[@class='burger']";
    public static final String BUTTON_INDIVIDUALIZATION = "//span[@data-item-id='/en/individualisation.html']";
    public static final String BUTTON_OPTION_719 = "//a[@data-text='Option 719']";
    public static final String BUTTON_R_NINET_PURE = "//h4[contains(text(),'2023 R nineT Pure')]";
    public static final String BUTTON_NEXT_STEP = "//button[@class='button button-primary button']";
    public static final String FIELD_PRICE_BASE_MOTORCYCLES = "//span[@class='value ng-binding']";
    public static final String CHECKBOX_POLLUX_METALLIC =
            "(//button[@aria-label='Add to Configuration']//div[@class='checkbox'])[2]";
    public static final String PRICE_COLOR = "(//div[@class='information'])[4]//span[@class='price ng-binding']";
    public static final String CHECKBOX_DESIGN_OPTION_SILENCER = "(//div[@class='checkbox'])[2]";
    public static final String PRICE_DESIGN_OPTION_SILENCER = "(//span[@class='price ng-binding'])[2]";
    public static final String TOTAL_PRICE_MOTORCYCLES = "(//h2[@class='value ng-binding'])[1]";
}
