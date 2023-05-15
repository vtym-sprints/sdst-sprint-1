package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

abstract public class AbstractBasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public AbstractBasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        this.actions = new Actions(driver);
    }

    public WebElement getVisibleElementByXpath(String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        return driver.findElement(By.xpath(element));
    }

    public List<WebElement> getListOfVisibleElementsByXpath(String element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        return driver.findElements(By.xpath(element));
    }
}
