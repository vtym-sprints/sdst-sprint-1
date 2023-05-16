package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class HomePage extends AbstractBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String CARS_IN_AVAILABILITY = "//a[@id='button-f4e1544f40'] ";
    private static final String FIELD_MOTORCYCLES_LOWER_HEADER = "//a[contains(text(),'BMW Motorcycles')]";

    public WebElement getCarsInAvailabilityButton() {
        return waitUntilElementToBeClickableByXpath(CARS_IN_AVAILABILITY);
    }

    public HomePage clickCarsInAvailability() {
        getCarsInAvailabilityButton().click();
        return this;
    }

    public void clickMotorcyclesField() {
        waitUntilElementToBeClickableByXpath(FIELD_MOTORCYCLES_LOWER_HEADER).click();
    }
}
