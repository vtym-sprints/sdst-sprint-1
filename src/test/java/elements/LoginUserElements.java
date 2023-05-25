package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class LoginUserElements extends AbstractBasePage {

    public LoginUserElements(WebDriver driver) {
        super(driver);
    }

    protected final static String MY_BMW_BUTTON = "//a[@href='http://mybmw.bmwusa.com']";
    protected final static String BMW_LOGIN_BUTTON = "//a[@id='bmwLogin']";
    protected final static String INPUT_EMAIL = "//input[@id='email']";
    protected final static String INPUT_PASSWORD = "//input[@type='password']";
    protected final static String LOGIN_BUTTON = "//button[@class='custom-button __b primary']";
    protected final static String MY_BMW_BUTTON_HOME_PAGE = "//button[@class='globalnav-primary-my-bmw__profile-btn label-2--bold']";
    protected final static String TEXT_PROFILE = "//div[@class='profile-title-welcome'][contains(text(),'Hello QA')]";
}
