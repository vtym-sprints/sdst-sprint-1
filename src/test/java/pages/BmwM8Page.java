package pages;

import elements.BmwElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.scrollToElement;

public class BmwM8Page extends BmwElements {
    public BmwM8Page(WebDriver driver) {
        super(driver);
    }

    public BmwM8Page scrollToBmwM8() {
        scrollToElement(waitUntilElementToBeVisibleByXpath(SCROLL_M8_BUTTON), driver);
        return this;
    }

    public BmwM8Page selectBmwM8() {
        waitUntilElementToBeClickableByXpath(SELECT_BMW_M8).click();
        return this;
    }

    public void clickCustomizeThisBuildButton() {
        waitUntilElementToBeClickableByXpath(CUSTOMIZE_BUTTON).click();
    }

    public WebElement getTextBmwM850i() {
        return waitUntilElementToBeVisibleByXpath(TEXT_BMW_M8);
    }
}
