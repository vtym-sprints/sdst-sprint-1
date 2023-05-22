package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BmwM8Page;
import pages.HomePage;

import static base.CommonActions.scrollToElement;

public class TestConfiguratorBmwM8 extends AbstractBaseTest {

    @Test
    public void testConfiguratorBmwM8() {

        HomePage homePage = new HomePage(driver);
        BmwM8Page bmwM8Page = new BmwM8Page(driver);

        homePage
                .dismissPopup()
                .clickBuildYourOwnButton();
        bmwM8Page
                .clickSelectASeriesButton()
                .clickBmwMButton()
                .scrollBmwM8Select()
                .clickBmwM8CoupeButton()
                .clickCustomizeThisBuildButton();

    }
}
