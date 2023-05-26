package base;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

abstract public class AbstractBasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    private int BASE_WAIT = 15000;
    private final String CIRCLE_LOADER = "//div[@class='load-indicator_loader_njc5r']";
    private final String VEHICLE_LOADER = "//figure[@class='vehicle-info-loader']";
    public final String BUTTON_LOADER = "//div[@class='pe-button__cta-holder loading']//figure[@class='pe-payment-options-card__loader']";

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, ofMillis(BASE_WAIT));
    }

    protected WebElement waitUntilElementToBeVisibleByXpath(String locator) {
        return wait.until(visibilityOfElementLocated(By.xpath(locator)));
    }

    protected Boolean waitUntilElementToBeInvisibilityByXpath(String locator) {
        return wait.until(invisibilityOfElementLocated(By.xpath(locator)));
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

    protected List<WebElement> waitUntilElementsToBeVisibleByXpath(String locator) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    public void goToNextTab(int tabNumber) {
        waitUntilNumberOfTabToBe(tabNumber);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber - 1));
    }

    public void waitUntilNumberOfTabToBe(int tabNumber) {
        wait.until(ExpectedConditions.numberOfWindowsToBe(tabNumber));
    }

    @SneakyThrows
    public void waitTillCircleLoaderDisappear() {
        waitUntilElementToBeInvisibilityByXpath(CIRCLE_LOADER);
        sleep(100);
    }

    @SneakyThrows
    public void waitTillVehicleLoaderDisappear() {
        waitUntilElementToBeInvisibilityByXpath(VEHICLE_LOADER);
        sleep(100);
    }

    @SneakyThrows
    public void waitTillButtonLoaderDisappear() {
        waitUntilElementToBeInvisibilityByXpath(BUTTON_LOADER);
        sleep(100);
    }
}
