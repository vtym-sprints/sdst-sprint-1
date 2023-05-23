package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BuildYourOwnElements extends AbstractBasePage {
    public BuildYourOwnElements(WebDriver driver) {
        super(driver);
    }

    public final static String X7_MODEL_BTN = "//button[contains(text(),'X7')]",
            SELECT_X7MODEL_BTN = "//a[@aria-label='Select X7 Sports Activity Vehicle']",
            DESIGN_X7 = "//a[@title='2024 BMW X7 xDrive40i']",
            TOTAL_PRICE_X7 = "//div[@class='total-price']";


}
