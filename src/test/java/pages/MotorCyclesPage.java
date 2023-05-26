package pages;

import elements.MotorcyclesElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.scrollToElement;

public class MotorCyclesPage extends MotorcyclesElements {

    public MotorCyclesPage(WebDriver driver) {
        super(driver);
    }

    public MotorCyclesPage clickButton(String nameButton) {
        waitUntilElementToBeVisibleByXpath(nameButton).click();
        return this;
    }

    public MotorCyclesPage scrollAndClickByJS() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollTo(0, document.body.scrollHeight)");
        js.executeScript("arguments[0].click()", driver
                .findElement(By.xpath("//a[contains(@class,'btn intern btn--secondary')]")));
        return this;
    }

    public MotorCyclesPage scrollAndClickToElement(String nameElement) {
        scrollToElement(waitUntilPresenceOfElementByXpath(nameElement),driver);
        waitUntilElementToBeVisibleByXpath(nameElement).isEnabled();
        waitUntilElementToBeClickableByXpath(nameElement).click();
        return this;
    }

    public String getPriceField(String nameField) {
        return waitUntilElementToBeVisibleByXpath(nameField)
                .getText().replaceAll("[$,. ]", "").replaceAll("00$", "");
    }
}
