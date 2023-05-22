package tests;

import base.AbstractBaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPreOwnedInventoryPage;
import pages.ZipCodePage;

import java.util.List;

import static base.CommonActions.replacePrice;
import static org.testng.Assert.assertTrue;

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

        assertTrue(shopPreOwnedInventoryPage.getFilterText().contains("Pre-Owned"));

        shopPreOwnedInventoryPage.clickBodyStyleFilter();
        WebElement bodyStyle = shopPreOwnedInventoryPage.choseRandomBodyStyle();
        shopPreOwnedInventoryPage.clickBodyStyle(bodyStyle);
        String nameOfBodyStyle = shopPreOwnedInventoryPage.getNameBodyStyle(bodyStyle).trim();
        System.out.println(shopPreOwnedInventoryPage.getFilterText());
        System.out.println(nameOfBodyStyle);

        List<String> filters = shopPreOwnedInventoryPage.getFilterText();
        boolean match = filters.stream()
                .anyMatch(filter -> filters.contains(nameOfBodyStyle));
        assertTrue(match);

        shopPreOwnedInventoryPage.scrollToPriceFilter();
        shopPreOwnedInventoryPage
                .clickPriceFilter();
        shopPreOwnedInventoryPage
                .chooseRandomMinPrice();
        shopPreOwnedInventoryPage
                .chooseRandomMaxPrice();
        int minPrice = Integer.parseInt(replacePrice(shopPreOwnedInventoryPage.getChooseMinPrice()));
        int maxPrice = Integer.parseInt(replacePrice(shopPreOwnedInventoryPage.getChooseMaxPrice()));

        System.out.println(minPrice);
        System.out.println(maxPrice);
        var soft = new SoftAssert();
        List<Integer> prices = shopPreOwnedInventoryPage.getProductsPrices();
        for (int price : prices) {
            soft.assertTrue(price >= minPrice, "Doesn't >=" + minPrice);
            soft.assertTrue(price <= maxPrice, "Doesn't <=" + maxPrice);
        }

        soft.assertAll();
    }
}
