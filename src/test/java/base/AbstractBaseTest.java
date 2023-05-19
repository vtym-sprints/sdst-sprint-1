package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract public class AbstractBaseTest extends Assert {

    protected WebDriver driver;

    @BeforeMethod
    public void openWindow() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void closeWindow() {
//        driver.quit();
//    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public boolean urlContains(String urlPath) {
        return driver.getCurrentUrl().contains(urlPath);
    }
}
