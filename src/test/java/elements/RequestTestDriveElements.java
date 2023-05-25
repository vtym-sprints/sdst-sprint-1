package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class RequestTestDriveElements extends AbstractBasePage {
    public RequestTestDriveElements(WebDriver driver) {super(driver);}

    protected final static String REQUEST_TEST_DRIVE_BUTTON = "//a[@tab-index='7']";
    protected final static String X5_BUTTON = "//div[@class='vehicleselector-model-tile all']//a[@title='X5']";
    protected final static String INPUT_ZIP_CODE = "//input[@id='dealerZipCodeInput']";
    protected final static String SELECT_BUTTON = "//button[@analytics-event='select-dealer-1']";
    protected final static String INPUT_FIRST_NAME = "//input[@id='leadFirstName']";
    protected final static String INPUT_LAST_NAME = "//input[@id='leadLastName']";
    protected final static String INPUT_EMAIL = "//input[@id='leadEmail']";
    protected final static String INPUT_PHONE_NUMBER = "//input[@id='leadPhone']";
    protected final static String SCROLL_TO_PHONE = "//input[@id='leadLastName']";
    protected final static String LEAD_DISCLAIMER_BUTTON = "//input[@id='leadDisclaimer']";
    protected final static String LEAD_DISCLAIMER_TCPA_BUTTON = "//input[@id='leadDisclaimerTCPA']";
    protected final static String SCROLL_TO_COMMENTS = "//label[@for='leadComments']";
    protected final static String INPUT_COMMENTS = "//textarea[@id='leadComments']";
    protected final static String TEXT_SUBMIT = "//button[contains(text(),'Submit')]";
}
