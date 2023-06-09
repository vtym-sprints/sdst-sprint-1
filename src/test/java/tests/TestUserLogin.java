package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.UserLoginPage;
import pages.HomePage;

import java.util.Set;

import static org.testng.Assert.*;

public class TestUserLogin extends AbstractBaseTest {
    @Test
    public void testUserLogin() {
        HomePage homePage = new HomePage(driver);
        UserLoginPage userLoginPage = new UserLoginPage(driver);

        homePage.dismissPopup();

        userLoginPage
                .clickMyBmwButton()
                .inputEmail()
                .inputPasswoed()
                .clickLoginButton()
                .clickMyBmwLogHomePage()
                .clickBmwLoginButton();

        Set<String> windowHandles = driver.getWindowHandles();
        String currentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(currentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        assertEquals(driver.getCurrentUrl(), "https://login.bmwusa.com/oneid/#/profile?client=usahub&brand=bmw&country=US&language=en");
        assertTrue(userLoginPage.TextProfile().isDisplayed());
    }
}
