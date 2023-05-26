package tests;

import base.AbstractBaseTest;
import elements.HomePageElements;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MotorCyclesPage;

import static elements.MotorcyclesElements.*;
import static org.testng.Assert.assertEquals;

public class TestMotorCyclesBuildYourOwn extends AbstractBaseTest {

    @Test
    public void testMotorCyclesBuildYourOwn() {
        MotorCyclesPage motorCyclesPage = new MotorCyclesPage(driver);

        new HomePage(driver)
                .clickAndSwitchToFollowingPage(HomePageElements.BUTTON_BMW_MOTORCYCLES);

        motorCyclesPage
                .clickButton(BUTTON_BURGER_MENU)
                .clickButton(BUTTON_INDIVIDUALIZATION)
                .clickButton(BUTTON_OPTION_719)
                .scrollAndClickByJS()
                .scrollAndClickToElement(BUTTON_R_NINET_PURE)
                .clickButton(BUTTON_NEXT_STEP);

        int priceBaseMotorCycles = Integer.parseInt(motorCyclesPage.getPriceField(FIELD_PRICE_BASE_MOTORCYCLES));

        motorCyclesPage
                .scrollAndClickToElement(CHECKBOX_POLLUX_METALLIC);

        int priceColor = Integer.parseInt(motorCyclesPage.getPriceField(PRICE_COLOR));

        motorCyclesPage
                .clickButton(BUTTON_NEXT_STEP)
                .clickButton(CHECKBOX_DESIGN_OPTION_SILENCER);

        int priceDesignOption = Integer.parseInt(motorCyclesPage.getPriceField(PRICE_DESIGN_OPTION_SILENCER));

        motorCyclesPage
                .clickButton(BUTTON_NEXT_STEP)
                .clickButton(BUTTON_NEXT_STEP)
                .clickButton(BUTTON_NEXT_STEP);

        int actualTotalPriceMotorCycles = Integer.parseInt(motorCyclesPage.getPriceField(TOTAL_PRICE_MOTORCYCLES));
        int expectedPrice = priceBaseMotorCycles + priceColor + priceDesignOption;

        assertEquals(actualTotalPriceMotorCycles,expectedPrice);
    }
}
