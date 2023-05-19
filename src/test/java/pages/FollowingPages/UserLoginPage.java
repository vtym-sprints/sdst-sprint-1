package pages.FollowingPages;

import elements.LoginUserElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.VisualizeAccessoriesPage;

public class UserLoginPage extends LoginUserElements {
    public UserLoginPage(WebDriver driver) {
        super(driver);
    }
    public UserLoginPage clickMyBmwButton() {
        waitUntilElementToBeClickableByXpath(MY_BMW_BUTTON).click();
        return this;
    }
    public UserLoginPage clickBmwLoginButton() {
        waitUntilElementToBeClickableByXpath(BMW_LOGIN_BUTTON).click();
        return this;
    }
    public UserLoginPage inputEmail() {
        waitUntilElementToBeVisibleByXpath((INPUT_EMAIL)).sendKeys("car.life23max@gmail.com");
        return this;
    }
    public UserLoginPage inputPasswoed() {
        waitUntilElementToBeVisibleByXpath((INPUT_PASSWORD)).sendKeys("Qa1234567.");
        return this;
    }
    public UserLoginPage clickLoginButton() {
        waitUntilElementToBeClickableByXpath(LOGIN_BUTTON).click();
        return this;
    }
    public UserLoginPage clickMyBmwLogHomePage() {
        waitUntilElementToBeClickableByXpath(MY_BMW_BUTTON_HOME_PAGE).click();
        return this;
    }
    public WebElement TextProfile() {

        return waitUntilElementToBeVisibleByXpath(TEXT_PROFILE);
    }

}
