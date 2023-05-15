package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestCarsInHeader extends AbstractBaseTest {

    @Test
    public void test() {
        openPage("https://www.bmwusa.com/");

        HomePage homePage = new HomePage(driver);
        homePage
                .clickCarsInAvailability();
    }
}
