package pages;

import elements.HomePageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends HomePageElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String CARS_IN_AVAILABILITY = "//a[@id='button-f4e1544f40'] ";
    public String NAME_HEADER = "BMW USA";
    public String URL_CONTAINS_BWM_USA = "BMWUSA";

    public WebElement getCarsInAvailabilityButton() {
        return waitUntilElementToBeClickableByXpath(CARS_IN_AVAILABILITY);
    }

    public HomePage clickCarsInAvailability() {
        getCarsInAvailabilityButton().click();
        return this;
    }

    public void clickAndSwitchToFollowingPage(String locator) {
        waitUntilElementToBeClickableByXpath(locator).click();
        goToNextTab(2);
    }

    public void closeAndSwitchToHomePage() {
        driver.close();
        goToNextTab(1);
    }
}
