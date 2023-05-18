package tests;

import base.AbstractBaseTest;
import elements.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ShopBmwUsaPage;

import static elements.HomePageElements.BTN_SHOP_BMW_PARTS_AND_ACCESSORIES;

public class TestCheckingTheBasketWithSelectedAccessories extends AbstractBaseTest {

    @Test
    public void testCheckingTheBasketWithSelectedAccessories() {
        ShopBmwUsaPage shopBmwUsaPage = new ShopBmwUsaPage(driver);
        CartPage cartPage = new CartPage(driver);

        new HomePage(driver)
                .clickAndSwitchToFollowingPage(BTN_SHOP_BMW_PARTS_AND_ACCESSORIES);

        shopBmwUsaPage
                .clickOnCategory("Travel & Comfort")
                .clickFieldWithNameGoods("2");

        String nameFirstProduct = shopBmwUsaPage.getNameProduct();
        String priceFirstProduct = shopBmwUsaPage.getPriceProduct();

        shopBmwUsaPage
                .sendKeysInFieldDealerNameOrZipCode("11222")
                .clickOnFirstBtnSetUpMyDealer()
                .clickBtnAddToCart()
                .clickBtnClosePopUpCart()
                .clickBtnSeatAccessoriesAboutPhoto()
                .clickFieldWithNameGoods("4");

        String nameSecondProduct = shopBmwUsaPage.getNameProduct();
        String priceSecondProduct = shopBmwUsaPage.getPriceProduct();

        shopBmwUsaPage
                .clickBtnAddToCart()
                .clickBtnViewCartOnPopUp();

        Assert.assertEquals(cartPage.getNameProductOnCartPage("1"), nameFirstProduct);
        Assert.assertEquals(cartPage.getPriceProductOnCartPage("1"), priceFirstProduct);
        Assert.assertEquals(cartPage.getNameProductOnCartPage("2"), nameSecondProduct);
        Assert.assertEquals(cartPage.getPriceProductOnCartPage("2"), priceSecondProduct);
    }
}
