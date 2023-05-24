package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class BuildYourOwnMainElements extends AbstractBasePage {
    protected static final String SELECT_5_SERIES = "//a[@aria-label='Select 5 Series Sedan']";
    protected static final String SELECT_MODEL_530I = "//a[@href='#/studio/235A']";

    public BuildYourOwnMainElements(WebDriver driver) {
        super(driver);
    }
}
