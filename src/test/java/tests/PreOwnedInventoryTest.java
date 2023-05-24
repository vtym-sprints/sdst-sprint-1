package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ShopPreOwnedInventoryPage;
import pages.ZipCodePage;

import java.util.List;

import static base.CommonActions.replacePrice;
import static java.lang.Integer.parseInt;
import static org.assertj.core.api.Assertions.assertThat;

public class PreOwnedInventoryTest extends AbstractBaseTest {
    private final String zipCode = "07003";

    @Test
    public void checkFilteringByBodyStyleAndPrice() {
        HomePage homePage = new HomePage(driver);
        ZipCodePage zipCodePage = new ZipCodePage(driver);
        ShopPreOwnedInventoryPage shopPreOwnedInventoryPage = new ShopPreOwnedInventoryPage(driver);

        homePage
                .dismissPopup()
                .clickPreOwnedInventory();

        zipCodePage.choseZipCode(zipCode);
        shopPreOwnedInventoryPage.chosePreOwned();

        assertThat(shopPreOwnedInventoryPage.getFilterText())
                .as("Pre-Owned doesn't selected")
                .contains("Pre-Owned");

        WebElement bodyStyle = shopPreOwnedInventoryPage
                .clickBodyStyleFilter()
                .choseRandomBodyStyle();
        shopPreOwnedInventoryPage.clickBodyStyle(bodyStyle);

        String nameOfBodyStyle = shopPreOwnedInventoryPage.getNameBodyStyle(bodyStyle);
        List<String> filters = shopPreOwnedInventoryPage.getFilterText();

        assertThat(filters)
                .as("Filter of body style " + nameOfBodyStyle + " doesn't selected.")
                .contains(nameOfBodyStyle);

        shopPreOwnedInventoryPage
                .scrollToPriceFilter()
                .clickPriceFilter()
                .chooseRandomMinPrice()
                .isTillLoader();
        shopPreOwnedInventoryPage
                .chooseRandomMaxPrice()
                .isTillLoader();

        int minPrice = parseInt(replacePrice(shopPreOwnedInventoryPage.getChooseMinPrice()));
        int maxPrice = parseInt(replacePrice(shopPreOwnedInventoryPage.getChooseMaxPrice()));

        List<Integer> prices = shopPreOwnedInventoryPage.getProductsPrices();
        prices
                .forEach(price -> {
                    assertThat(price)
                            .as("Price should be in the range from " + minPrice + " to " + maxPrice)
                            .isBetween(minPrice, maxPrice);
                });
    }

    @Test
    public void checkFilterByModelYear() {
        HomePage homePage = new HomePage(driver);
        ZipCodePage zipCodePage = new ZipCodePage(driver);
        ShopPreOwnedInventoryPage shopPreOwnedInventoryPage = new ShopPreOwnedInventoryPage(driver);

        homePage
                .dismissPopup()
                .clickShoppingButton()
                .setZipCode(zipCode)
                .clickShopPreOwnedButtonInShoppingTab();

        zipCodePage.chooseZipCodeWithNoDealerPick(zipCode);

        shopPreOwnedInventoryPage
                .setModelYearFilterMax2015()
                .getCardsModelYearsList().forEach(year -> {
                    assertThat(year).isLessThanOrEqualTo(2015);
                });
    }
}
