package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class EstimatePaymentElements extends AbstractBasePage {

    public EstimatePaymentElements(WebDriver driver) {
        super(driver);
    }

    public static final String SERIES_FILTER = "//select[@id='series']";
    public static final String MODEL_FILTER = "//select[@name='model']";
    public static final String ESTIMATE_PAYMENTS_BTN = "//button[@class='estimate-payments-button']";
    public static final String STARTING_SRP = "//strong[contains(text(),'$')]";
    public static final String FINANCE_TERMS_SELECT = "//div[@class='pe-payment-options-card__finance sub-panel']//select[@name='terms']";
    public static final String ANNUAL_MILEAGE = "//label[@class='form-radio-container']//span[contains(text(),'%s')]";
    public static final String ZIP_FIELD = "//input[@name='zipCode']";
    public static final String STARTING_SMRP_PRICE = "//strong[contains(text(),'$')]";
}
