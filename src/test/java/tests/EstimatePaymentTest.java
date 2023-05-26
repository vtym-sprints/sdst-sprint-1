package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.EstimatePaymentPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class EstimatePaymentTest extends AbstractBaseTest {
    private String zipCode = "90001";

    @Test
    public void checkEstimatePayment() {
        HomePage homePage = new HomePage(driver);
        EstimatePaymentPage estimatePaymentPage = new EstimatePaymentPage(driver);

        homePage
                .dismissPopup()
                .clickEstimatePayment();

        estimatePaymentPage
                .chose8Series()
                .chose840iGranCoupe()
                .enterZIpCode(zipCode)
                .waitTillVehicleLoaderDisappear();
        estimatePaymentPage
                .clickEstimatePayments()
                .waitTillCircleLoaderDisappear();

        estimatePaymentPage
                .selectMonthFinancePaymentOption("42")
                .waitTillButtonLoaderDisappear();

        double monthFinancePaymentOptions =
                estimatePaymentPage.calculateMonthlyPayment(estimatePaymentPage.getPriceOfCar(), 42);
        String formattedValue = String.format("%.2f", monthFinancePaymentOptions);
        assertTrue(Double.parseDouble(formattedValue) == 2298.65);
    }
}
