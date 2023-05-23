package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.FindCarsPage;
import pages.HomePage;
import pages.VisualizeAccessoriesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestFindCars extends AbstractBaseTest {
    @Test
    public void testFindCars() {
        VisualizeAccessoriesPage visualizeAccessoriesPage = new VisualizeAccessoriesPage(driver);
        HomePage homePage = new HomePage(driver);
        FindCarsPage findCarsPage = new FindCarsPage(driver);

        visualizeAccessoriesPage.clickShoppingButton();
        homePage.dismissPopup();

        findCarsPage.inputZipCode()
                .clickShopNewButton()
                .inputZipCodeNewPage()
                .clickShopNow()
                .clickSeriesButton()
                .click5SeriesButton()
                .scrollToExterier()
                .clickExterierColorButton()
                .clickColorBlackButton()
                .clickOptionsButton()
                .clickMSportButton()
                .clickBuildMyDealButton()
                .clickContinueButton()
                .clickContinueButton()
                .clickContinueButton()
                .clickContinueButton()
                .clickSendEstimateButton();

        assertEquals(driver.getCurrentUrl(), "https://www.bmwusa.com/inventory/#/detail/WBA53BJ08PWY20306?pricing=true");
        assertTrue(findCarsPage.textBmwSedan().isDisplayed());
    }
}
