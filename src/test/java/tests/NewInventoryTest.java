package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewInventoryPage;
import pages.ZipCodePage;

import static org.assertj.core.api.Assertions.assertThat;

public class NewInventoryTest extends AbstractBaseTest {
    private final String zipCode = "90001";

    @Test
    public void checkPriceFilter() {
        HomePage homePage = new HomePage(driver);
        ZipCodePage zipCodePage = new ZipCodePage(driver);
        NewInventoryPage newInventoryPage = new NewInventoryPage(driver);

        homePage
                .dismissPopup()
                .clickModelsButton()
                .clickShopInventoryButton();

        zipCodePage.choseZipCode(zipCode);

        newInventoryPage.setPriceFilterMin60k();

        newInventoryPage.getCardsPricesList().forEach(price -> {
            assertThat(price).isGreaterThanOrEqualTo(60000);
        });
    }
}
