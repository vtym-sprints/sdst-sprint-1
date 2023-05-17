package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

abstract public class AbstractBasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    int BASE_WAIT = 5000;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, ofMillis(BASE_WAIT));
    }

    protected WebElement waitUntilElementToBeVisibleByXpath(String locator) {
        return wait.until(visibilityOfElementLocated(By.xpath(locator)));
    }

    protected WebElement waitUntilElementToBeClickableByXpath(String locator) {
        return wait.until(elementToBeClickable(By.xpath(locator)));
    }

    protected WebElement waitUntilPresenceOfElementByXpath(String locator) {
        return wait.until(presenceOfElementLocated(By.xpath(locator)));
    }

    protected List<WebElement> waitUntilPresenceOfAllElementsByXpath(String locator) {
        return wait.until(presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }
}
