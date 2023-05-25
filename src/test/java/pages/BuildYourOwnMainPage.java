package pages;

import elements.BuildYourOwnMainElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuildYourOwnMainPage extends BuildYourOwnMainElements {

    public BuildYourOwnMainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonSelect5Series() {
        return waitUntilElementToBeClickableByXpath(SELECT_5_SERIES);
    }

    public WebElement getButtonSelectModel530i() {
        return waitUntilElementToBeClickableByXpath(SELECT_MODEL_530I);
    }

    public BuildYourOwnMainPage clickSelect5Series() {
        getButtonSelect5Series().click();
        return this;
    }

    public BuildYourOwnMainPage clickSelectModel530i() {
        getButtonSelectModel530i().click();
        return this;
    }
}
