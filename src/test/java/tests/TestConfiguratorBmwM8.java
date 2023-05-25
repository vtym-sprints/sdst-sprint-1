package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BmwM8Page;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class TestConfiguratorBmwM8 extends AbstractBaseTest {

    @Test
    public void testConfiguratorBmwM8() {
        HomePage homePage = new HomePage(driver);
        BmwM8Page bmwM8Page = new BmwM8Page(driver);

        homePage
                .dismissPopup()
                .clickBuildYourOwnButton();
        bmwM8Page
                .scrollToBmwM8()
                .clickSelectBmwM8();

        assertTrue(bmwM8Page.getTextBmwM850i().isDisplayed());

        bmwM8Page
                .clickCustomizeThisBuildButton()
                .clickNextWheelsButton();

        homePage.clickCloseZipCodeButton();
        bmwM8Page
                .clickUpholsteryButton()
                .clickTrimButton()
                .clickOptionsButton();

        assertTrue(bmwM8Page.getSumCars().isDisplayed());

        bmwM8Page.clickNextSummaryButton();

        assertTrue(bmwM8Page.getTextM8Competition().isDisplayed());
    }
}
