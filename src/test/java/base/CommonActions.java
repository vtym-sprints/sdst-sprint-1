package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonActions {

    public static void scrollToElement(WebElement element, WebDriver driver) {
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void jsClick(WebElement element, WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public static void back(WebDriver driver) {
        driver.navigate().back();
    }

    public static void moveCursor(WebElement element, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public static String replacePrice(WebElement element) {
        return element.getText().replaceAll("[^\\-\\d]", "");
    }

    public static void selectOptionByValue(WebElement dropdown, String optionValue) {
        Select select = new Select(dropdown);
        select.selectByValue(optionValue);
    }

    public static void scrollToTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
    }
}
