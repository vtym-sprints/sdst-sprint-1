package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarsInHeaderPage extends AbstractBasePage {

    public CarsInHeaderPage(WebDriver driver) {
        super(driver);
    }

    private static final String CARS_IN_HEADER = "//a[@aria-label='Автомобілі']";

    public WebElement getCarsButton() {
        return waitUntilElementToBeClickableByXpath(CARS_IN_HEADER);
    }

    public CarsInHeaderPage clickCarsInHomePage() {
        getCarsButton().click();
        return this;
    }
}
