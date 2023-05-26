package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.BuildYourOwnPage;
import pages.HomePage;

import static elements.BuildYourOwnElements.*;
import static org.testng.Assert.assertEquals;

public class BuildYourOwnIXTest extends AbstractBaseTest {

    @Test
    public void buildYourOwnIXTest() {
        BuildYourOwnPage buildYourOwnPage = new BuildYourOwnPage(driver);

        new HomePage(driver)
                .dismissPopup()
                .clickBuildYourOwnInFooter();

        buildYourOwnPage
                .clickButton(SELECT_BUTTON_BMW_IX);

        int priceBaseCar = Integer.parseInt(buildYourOwnPage.getPriceElement(PRICE_BASE_CAR));

        buildYourOwnPage
                .clickButton(BUTTON_DESIGN_IX)
                .closeZipCodePopUp();

        int priceSports = Integer.parseInt(buildYourOwnPage.getPriceElement(PRICE_SPORTS_IX));

        buildYourOwnPage
                .scrollAndClickButtonInSelectMenu(BUTTON_SPORTS_IX)
                .clickNext()
                .clickButtonConfirm();

        int priceStormBayMetallic = Integer.parseInt(buildYourOwnPage.getPriceElement(PRICE_STORM_BY_METALLIC));

        buildYourOwnPage
                .scrollAndClickButtonInSelectMenu(BUTTON_STORM_BAY_METALLIC)
                .clickNext();

        int priceBiColorWheels = Integer.parseInt(buildYourOwnPage.getPriceElement(PRICE_BI_COLLOR_WHEELS));

        buildYourOwnPage
                .scrollAndClickButtonInSelectMenu(BUTTON_BI_COLOR_WHEELS)
                .clickNext();

        int priceCastaneaChestnut = Integer.parseInt(buildYourOwnPage.getPriceElement(PRICE_CASTANEA_CHESTNUT));

        buildYourOwnPage
                .scrollAndClickButtonInSelectMenu(BUTTON_CASTANEA_CHESTNUT)
                .clickNext()
                .clickNext()
                .clickNextAccessories()
                .clickNextSummaryButton();

        int actualTotalPriceCar = Integer.parseInt(buildYourOwnPage.getPriceElement(CHECK_PRICE));
        int expectedTotalPriceCar =
                priceBaseCar + priceSports + priceStormBayMetallic +
                        priceBiColorWheels + priceCastaneaChestnut;

        assertEquals(actualTotalPriceCar, expectedTotalPriceCar);
    }
}
