package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.EstimatePaymentPage;
import pages.HomePage;

import static java.lang.Thread.sleep;

public class EstimatePaymentTest extends AbstractBaseTest {
    private String zipCode = "90001";

    @Test
    public void checkEstimatePayment() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        EstimatePaymentPage estimatePaymentPage = new EstimatePaymentPage(driver);

        homePage
                .dismissPopup()
                .clickEstimatePayment();

        estimatePaymentPage
                .chose8Series()
                .chose840iGranCoupe()
                .enterZIpCode(zipCode)
                .isTillLoader();
        estimatePaymentPage
                .clickEstimatePayments();

        //sleep(4000);
        estimatePaymentPage
                .scroll42FinanceTerms()
                .chose42FinanceTerms()
                .chose30LeaseTerms()
                .choseAnnualMileage();
    }
}
