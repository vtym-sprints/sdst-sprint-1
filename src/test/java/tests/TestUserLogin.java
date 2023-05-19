package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FollowingPages.UserLoginPage;
import pages.HomePage;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class TestUserLogin extends AbstractBaseTest {
    @Test
    public void test() {
        openPage("https://www.bmwusa.com/");

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

        Assert.assertEquals(driver.getCurrentUrl(), "https://login.bmwusa.com/oneid/#/profile?client=usahub&brand=bmw&country=US&language=en");
        assertTrue(userLoginPage.TextProfile().isDisplayed());

    }
}
